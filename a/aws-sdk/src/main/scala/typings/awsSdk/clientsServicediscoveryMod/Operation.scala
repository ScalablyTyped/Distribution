package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /**
    * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The code associated with ErrorMessage. Values for ErrorCode include the following:    ACCESS_DENIED     CANNOT_CREATE_HOSTED_ZONE     EXPIRED_TOKEN     HOSTED_ZONE_NOT_FOUND     INTERNAL_FAILURE     INVALID_CHANGE_BATCH     THROTTLED_REQUEST   
    */
  var ErrorCode: js.UndefOr[Code] = js.undefined
  
  /**
    * If the value of Status is FAIL, the reason that the operation failed.
    */
  var ErrorMessage: js.UndefOr[Message] = js.undefined
  
  /**
    * The ID of the operation that you want to get information about.
    */
  var Id: js.UndefOr[OperationId] = js.undefined
  
  /**
    * The status of the operation. Values include the following:  SUBMITTED  This is the initial state that occurs immediately after you submit a request.  PENDING  Cloud Map is performing the operation.  SUCCESS  The operation succeeded.  FAIL  The operation failed. For the failure reason, see ErrorMessage.  
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    * The name of the target entity that's associated with the operation:  NAMESPACE  The namespace ID is returned in the ResourceId property.  SERVICE  The service ID is returned in the ResourceId property.  INSTANCE  The instance ID is returned in the ResourceId property.  
    */
  var Targets: js.UndefOr[OperationTargetsMap] = js.undefined
  
  /**
    * The name of the operation that's associated with the specified ID.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
  
  /**
    * The date and time that the value of Status changed to the current value, in Unix date/time format and Coordinated Universal Time (UTC). The value of UpdateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setErrorCode(value: Code): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: Message): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: OperationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargets(value: OperationTargetsMap): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setType(value: OperationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
