package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationWorkflowResponse extends StObject {
  
  /**
    * A message indicating create request was received.
    */
  var Message: string1To255
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: uuid
}
object CreateIntegrationWorkflowResponse {
  
  inline def apply(Message: string1To255, WorkflowId: uuid): CreateIntegrationWorkflowResponse = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationWorkflowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIntegrationWorkflowResponse] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: string1To255): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: uuid): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
