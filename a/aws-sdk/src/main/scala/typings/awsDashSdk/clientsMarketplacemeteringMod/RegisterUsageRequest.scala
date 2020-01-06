package typings.awsDashSdk.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUsageRequest extends js.Object {
  /**
    * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
    */
  var Nonce: js.UndefOr[typings.awsDashSdk.clientsMarketplacemeteringMod.Nonce] = js.native
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsDashSdk.clientsMarketplacemeteringMod.ProductCode = js.native
  /**
    * Public Key Version provided by AWS Marketplace
    */
  var PublicKeyVersion: VersionInteger = js.native
}

object RegisterUsageRequest {
  @scala.inline
  def apply(ProductCode: ProductCode, PublicKeyVersion: VersionInteger, Nonce: Nonce = null): RegisterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], PublicKeyVersion = PublicKeyVersion.asInstanceOf[js.Any])
    if (Nonce != null) __obj.updateDynamic("Nonce")(Nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUsageRequest]
  }
}

