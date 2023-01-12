package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSpecificCredentialMetadata extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when the service-specific credential were created.
    */
  var CreateDate: js.Date
  
  /**
    * The name of the service associated with the service-specific credential.
    */
  var ServiceName: serviceName
  
  /**
    * The unique identifier for the service-specific credential.
    */
  var ServiceSpecificCredentialId: serviceSpecificCredentialId
  
  /**
    * The generated user name for the service-specific credential.
    */
  var ServiceUserName: serviceUserName
  
  /**
    * The status of the service-specific credential. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType
  
  /**
    * The name of the IAM user associated with the service-specific credential.
    */
  var UserName: userNameType
}
object ServiceSpecificCredentialMetadata {
  
  inline def apply(
    CreateDate: js.Date,
    ServiceName: serviceName,
    ServiceSpecificCredentialId: serviceSpecificCredentialId,
    ServiceUserName: serviceUserName,
    Status: statusType,
    UserName: userNameType
  ): ServiceSpecificCredentialMetadata = {
    val __obj = js.Dynamic.literal(CreateDate = CreateDate.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceSpecificCredentialId = ServiceSpecificCredentialId.asInstanceOf[js.Any], ServiceUserName = ServiceUserName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSpecificCredentialMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceSpecificCredentialMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: serviceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceSpecificCredentialId(value: serviceSpecificCredentialId): Self = StObject.set(x, "ServiceSpecificCredentialId", value.asInstanceOf[js.Any])
    
    inline def setServiceUserName(value: serviceUserName): Self = StObject.set(x, "ServiceUserName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
