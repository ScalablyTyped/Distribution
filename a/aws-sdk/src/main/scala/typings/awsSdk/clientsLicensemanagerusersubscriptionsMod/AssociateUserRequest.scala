package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserRequest extends StObject {
  
  /**
    * The domain name of the user.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The identity provider of the user.
    */
  var IdentityProvider: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The ID of the EC2 instance, which provides user-based subscriptions.
    */
  var InstanceId: String
  
  /**
    * The user name from the identity provider for the user.
    */
  var Username: String
}
object AssociateUserRequest {
  
  inline def apply(IdentityProvider: IdentityProvider, InstanceId: String, Username: String): AssociateUserRequest = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateUserRequest]
  }
  
  extension [Self <: AssociateUserRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
