package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterIdentityProviderRequest extends StObject {
  
  /**
    * An object that specifies details for the identity provider.
    */
  var IdentityProvider: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The name of the user-based subscription product.
    */
  var Product: String
}
object RegisterIdentityProviderRequest {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String): RegisterIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterIdentityProviderRequest]
  }
  
  extension [Self <: RegisterIdentityProviderRequest](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
  }
}
