package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectAssignmentRequest extends StObject {
  
  /**
    *  The ID of the assignment. The assignment must correspond to a HIT created by the Requester. 
    */
  var AssignmentId: EntityId
  
  /**
    *  A message for the Worker, which the Worker can see in the Status section of the web site. 
    */
  var RequesterFeedback: String
}
object RejectAssignmentRequest {
  
  inline def apply(AssignmentId: EntityId, RequesterFeedback: String): RejectAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], RequesterFeedback = RequesterFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectAssignmentRequest]
  }
  
  extension [Self <: RejectAssignmentRequest](x: Self) {
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setRequesterFeedback(value: String): Self = StObject.set(x, "RequesterFeedback", value.asInstanceOf[js.Any])
  }
}
