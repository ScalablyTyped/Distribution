package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairIds extends js.Object {
  /**
    * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber. For more information, see ActiveTrustedSigners.
    */
  var Items: js.UndefOr[KeyPairIdList] = js.undefined
  /**
    * The number of active CloudFront key pairs for AwsAccountNumber. For more information, see ActiveTrustedSigners.
    */
  var Quantity: integer
}

object KeyPairIds {
  @scala.inline
  def apply(Quantity: integer, Items: KeyPairIdList = null): KeyPairIds = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[KeyPairIds]
  }
}

