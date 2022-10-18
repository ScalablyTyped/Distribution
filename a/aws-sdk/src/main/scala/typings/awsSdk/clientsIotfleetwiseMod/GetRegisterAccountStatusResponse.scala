package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegisterAccountStatusResponse extends StObject {
  
  /**
    *  The status of registering your account and resources. The status can be one of:    REGISTRATION_SUCCESS - The Amazon Web Services resource is successfully registered.    REGISTRATION_PENDING - Amazon Web Services IoT FleetWise is processing the registration request. This process takes approximately five minutes to complete.    REGISTRATION_FAILURE - Amazon Web Services IoT FleetWise can't register the AWS resource. Try again later.  
    */
  var accountStatus: RegistrationStatus
  
  /**
    *  The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.Date
  
  /**
    *  The unique ID of the Amazon Web Services account, provided at account creation. 
    */
  var customerAccountId: typings.awsSdk.clientsIotfleetwiseMod.customerAccountId
  
  /**
    *  Information about the registered IAM resources or errors, if any. 
    */
  var iamRegistrationResponse: IamRegistrationResponse
  
  /**
    *  The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.Date
  
  /**
    *  Information about the registered Amazon Timestream resources or errors, if any.
    */
  var timestreamRegistrationResponse: TimestreamRegistrationResponse
}
object GetRegisterAccountStatusResponse {
  
  inline def apply(
    accountStatus: RegistrationStatus,
    creationTime: js.Date,
    customerAccountId: customerAccountId,
    iamRegistrationResponse: IamRegistrationResponse,
    lastModificationTime: js.Date,
    timestreamRegistrationResponse: TimestreamRegistrationResponse
  ): GetRegisterAccountStatusResponse = {
    val __obj = js.Dynamic.literal(accountStatus = accountStatus.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], customerAccountId = customerAccountId.asInstanceOf[js.Any], iamRegistrationResponse = iamRegistrationResponse.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], timestreamRegistrationResponse = timestreamRegistrationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegisterAccountStatusResponse]
  }
  
  extension [Self <: GetRegisterAccountStatusResponse](x: Self) {
    
    inline def setAccountStatus(value: RegistrationStatus): Self = StObject.set(x, "accountStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCustomerAccountId(value: customerAccountId): Self = StObject.set(x, "customerAccountId", value.asInstanceOf[js.Any])
    
    inline def setIamRegistrationResponse(value: IamRegistrationResponse): Self = StObject.set(x, "iamRegistrationResponse", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setTimestreamRegistrationResponse(value: TimestreamRegistrationResponse): Self = StObject.set(x, "timestreamRegistrationResponse", value.asInstanceOf[js.Any])
  }
}
