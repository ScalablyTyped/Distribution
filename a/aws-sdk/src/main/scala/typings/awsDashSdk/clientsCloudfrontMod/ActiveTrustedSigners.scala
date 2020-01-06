package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTrustedSigners extends js.Object {
  /**
    * Enabled is true if any of the AWS accounts listed in the TrustedSigners complex type for this distribution have active CloudFront key pairs. If not, Enabled is false.
    */
  var Enabled: Boolean = js.native
  /**
    * A complex type that contains one Signer complex type for each trusted signer that is specified in the TrustedSigners complex type.
    */
  var Items: js.UndefOr[SignerList] = js.native
  /**
    * The number of trusted signers specified in the TrustedSigners complex type.
    */
  var Quantity: integer = js.native
}

object ActiveTrustedSigners {
  @scala.inline
  def apply(Enabled: Boolean, Quantity: integer, Items: SignerList = null): ActiveTrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTrustedSigners]
  }
}

