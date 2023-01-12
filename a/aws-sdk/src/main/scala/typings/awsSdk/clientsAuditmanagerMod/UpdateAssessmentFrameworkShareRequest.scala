package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentFrameworkShareRequest extends StObject {
  
  /**
    * Specifies the update action for the share request.
    */
  var action: ShareRequestAction
  
  /**
    *  The unique identifier for the share request. 
    */
  var requestId: UUID
  
  /**
    * Specifies whether the share request is a sent request or a received request.
    */
  var requestType: ShareRequestType
}
object UpdateAssessmentFrameworkShareRequest {
  
  inline def apply(action: ShareRequestAction, requestId: UUID, requestType: ShareRequestType): UpdateAssessmentFrameworkShareRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentFrameworkShareRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssessmentFrameworkShareRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ShareRequestAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: UUID): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestType(value: ShareRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
  }
}
