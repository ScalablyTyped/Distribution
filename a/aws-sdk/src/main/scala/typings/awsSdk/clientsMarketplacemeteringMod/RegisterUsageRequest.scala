package typings.awsSdk.clientsMarketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterUsageRequest extends StObject {
  
  /**
    * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
    */
  var Nonce: js.UndefOr[typings.awsSdk.clientsMarketplacemeteringMod.Nonce] = js.undefined
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.clientsMarketplacemeteringMod.ProductCode
  
  /**
    * Public Key Version provided by AWS Marketplace
    */
  var PublicKeyVersion: VersionInteger
}
object RegisterUsageRequest {
  
  inline def apply(ProductCode: ProductCode, PublicKeyVersion: VersionInteger): RegisterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], PublicKeyVersion = PublicKeyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUsageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterUsageRequest] (val x: Self) extends AnyVal {
    
    inline def setNonce(value: Nonce): Self = StObject.set(x, "Nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "Nonce", js.undefined)
    
    inline def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyVersion(value: VersionInteger): Self = StObject.set(x, "PublicKeyVersion", value.asInstanceOf[js.Any])
  }
}
