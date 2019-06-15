package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTrustedSigners extends js.Object {
  /**
    * Enabled is true if any of the AWS accounts listed in the TrustedSigners complex type for this distribution have active CloudFront key pairs. If not, Enabled is false.
    */
  var Enabled: scala.Boolean
  /**
    * A complex type that contains one Signer complex type for each trusted signer that is specified in the TrustedSigners complex type.
    */
  var Items: js.UndefOr[SignerList] = js.undefined
  /**
    * The number of trusted signers specified in the TrustedSigners complex type.
    */
  var Quantity: integer
}

object ActiveTrustedSigners {
  @scala.inline
  def apply(Enabled: scala.Boolean, Quantity: integer, Items: SignerList = null): ActiveTrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled, Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[ActiveTrustedSigners]
  }
}

