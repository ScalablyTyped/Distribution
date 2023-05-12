package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIdentityProviderSettingsRequest extends StObject {
  
  var IdentityProvider: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The name of the user-based subscription product.
    */
  var Product: String
  
  /**
    * Updates the registered identity provider’s product related configuration settings. You can update any combination of settings in a single operation such as the:   Subnets which you want to add to provision VPC endpoints.   Subnets which you want to remove the VPC endpoints from.   Security group ID which permits traffic to the VPC endpoints.  
    */
  var UpdateSettings: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.UpdateSettings
}
object UpdateIdentityProviderSettingsRequest {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String, UpdateSettings: UpdateSettings): UpdateIdentityProviderSettingsRequest = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], UpdateSettings = UpdateSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIdentityProviderSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setUpdateSettings(value: UpdateSettings): Self = StObject.set(x, "UpdateSettings", value.asInstanceOf[js.Any])
  }
}
