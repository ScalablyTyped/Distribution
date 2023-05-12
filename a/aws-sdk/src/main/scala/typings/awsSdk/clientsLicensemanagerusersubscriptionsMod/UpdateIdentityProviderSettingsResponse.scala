package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIdentityProviderSettingsResponse extends StObject {
  
  var IdentityProviderSummary: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProviderSummary
}
object UpdateIdentityProviderSettingsResponse {
  
  inline def apply(IdentityProviderSummary: IdentityProviderSummary): UpdateIdentityProviderSettingsResponse = {
    val __obj = js.Dynamic.literal(IdentityProviderSummary = IdentityProviderSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIdentityProviderSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviderSummary(value: IdentityProviderSummary): Self = StObject.set(x, "IdentityProviderSummary", value.asInstanceOf[js.Any])
  }
}
