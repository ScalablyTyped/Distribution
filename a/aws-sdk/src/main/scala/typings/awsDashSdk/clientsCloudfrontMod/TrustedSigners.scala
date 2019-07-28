package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedSigners extends js.Object {
  /**
    * Specifies whether you want to require viewers to use signed URLs to access the files specified by PathPattern and TargetOriginId.
    */
  var Enabled: Boolean
  /**
    *  Optional: A complex type that contains trusted signers for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[AwsAccountNumberList] = js.undefined
  /**
    * The number of trusted signers for this cache behavior.
    */
  var Quantity: integer
}

object TrustedSigners {
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer, Items: AwsAccountNumberList = null): TrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[TrustedSigners]
  }
}

