package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceUserSummary extends StObject {
  
  /**
    * The date a user was associated with an EC2 instance.
    */
  var AssociationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The date a user was disassociated from an EC2 instance.
    */
  var DisassociationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The domain name of the user.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * An object that specifies details for the identity provider.
    */
  var IdentityProvider: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The ID of the EC2 instance, which provides user-based subscriptions.
    */
  var InstanceId: String
  
  /**
    * The status of a user associated with an EC2 instance.
    */
  var Status: String
  
  /**
    * The status message for users of an EC2 instance.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The user name from the identity provider for the user.
    */
  var Username: String
}
object InstanceUserSummary {
  
  inline def apply(IdentityProvider: IdentityProvider, InstanceId: String, Status: String, Username: String): InstanceUserSummary = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceUserSummary]
  }
  
  extension [Self <: InstanceUserSummary](x: Self) {
    
    inline def setAssociationDate(value: String): Self = StObject.set(x, "AssociationDate", value.asInstanceOf[js.Any])
    
    inline def setAssociationDateUndefined: Self = StObject.set(x, "AssociationDate", js.undefined)
    
    inline def setDisassociationDate(value: String): Self = StObject.set(x, "DisassociationDate", value.asInstanceOf[js.Any])
    
    inline def setDisassociationDateUndefined: Self = StObject.set(x, "DisassociationDate", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
