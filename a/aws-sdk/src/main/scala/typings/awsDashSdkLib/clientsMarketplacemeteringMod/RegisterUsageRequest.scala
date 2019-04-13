package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterUsageRequest extends js.Object {
  /**
    * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
    */
  var Nonce: js.UndefOr[Nonce] = js.undefined
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: awsDashSdkLib.clientsMarketplacemeteringMod.ProductCode
  /**
    * Public Key Version provided by AWS Marketplace
    */
  var PublicKeyVersion: VersionInteger
}

object RegisterUsageRequest {
  @scala.inline
  def apply(ProductCode: ProductCode, PublicKeyVersion: VersionInteger, Nonce: Nonce = null): RegisterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode, PublicKeyVersion = PublicKeyVersion)
    if (Nonce != null) __obj.updateDynamic("Nonce")(Nonce)
    __obj.asInstanceOf[RegisterUsageRequest]
  }
}

