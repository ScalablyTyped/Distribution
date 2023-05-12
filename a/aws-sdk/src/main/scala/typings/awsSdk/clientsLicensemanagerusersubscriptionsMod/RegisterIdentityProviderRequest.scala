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
  
  /**
    * The registered identity provider’s product related configuration settings such as the subnets to provision VPC endpoints.
    */
  var Settings: js.UndefOr[typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.Settings] = js.undefined
}
object RegisterIdentityProviderRequest {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String): RegisterIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterIdentityProviderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
