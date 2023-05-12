package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkflowRequest extends StObject {
  
  /**
    * The workflow's ID.
    */
  var id: WorkflowId
}
object DeleteWorkflowRequest {
  
  inline def apply(id: WorkflowId): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
