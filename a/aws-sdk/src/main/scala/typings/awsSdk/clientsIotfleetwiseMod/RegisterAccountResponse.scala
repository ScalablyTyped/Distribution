package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAccountResponse extends StObject {
  
  /**
    *  The time the account was registered, in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.Date
  
  /**
    *  The registered IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream. 
    */
  var iamResources: IamResources
  
  /**
    *  The time this registration was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.Date
  
  /**
    *  The status of registering your Amazon Web Services account, IAM role, and Timestream resources. 
    */
  var registerAccountStatus: RegistrationStatus
  
  var timestreamResources: TimestreamResources
}
object RegisterAccountResponse {
  
  inline def apply(
    creationTime: js.Date,
    iamResources: IamResources,
    lastModificationTime: js.Date,
    registerAccountStatus: RegistrationStatus,
    timestreamResources: TimestreamResources
  ): RegisterAccountResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], iamResources = iamResources.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], registerAccountStatus = registerAccountStatus.asInstanceOf[js.Any], timestreamResources = timestreamResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAccountResponse]
  }
  
  extension [Self <: RegisterAccountResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setIamResources(value: IamResources): Self = StObject.set(x, "iamResources", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setRegisterAccountStatus(value: RegistrationStatus): Self = StObject.set(x, "registerAccountStatus", value.asInstanceOf[js.Any])
    
    inline def setTimestreamResources(value: TimestreamResources): Self = StObject.set(x, "timestreamResources", value.asInstanceOf[js.Any])
  }
}
