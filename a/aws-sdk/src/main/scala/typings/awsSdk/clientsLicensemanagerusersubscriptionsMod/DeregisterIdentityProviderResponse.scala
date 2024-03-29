package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterIdentityProviderResponse extends StObject {
  
  /**
    * Metadata that describes the results of an identity provider operation.
    */
  var IdentityProviderSummary: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProviderSummary
}
object DeregisterIdentityProviderResponse {
  
  inline def apply(IdentityProviderSummary: IdentityProviderSummary): DeregisterIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProviderSummary = IdentityProviderSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterIdentityProviderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentityProviderSummary(value: IdentityProviderSummary): Self = StObject.set(x, "IdentityProviderSummary", value.asInstanceOf[js.Any])
  }
}
