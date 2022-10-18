package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAssessmentFrameworkShareRequest extends StObject {
  
  /**
    * The unique identifier for the share request to be deleted.
    */
  var requestId: UUID
  
  /**
    * Specifies whether the share request is a sent request or a received request.
    */
  var requestType: ShareRequestType
}
object DeleteAssessmentFrameworkShareRequest {
  
  inline def apply(requestId: UUID, requestType: ShareRequestType): DeleteAssessmentFrameworkShareRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentFrameworkShareRequest]
  }
  
  extension [Self <: DeleteAssessmentFrameworkShareRequest](x: Self) {
    
    inline def setRequestId(value: UUID): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestType(value: ShareRequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
  }
}
