package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowResponse extends StObject {
  
  /**
    * The resource metadata for the workflow.
    */
  var Workflow: js.UndefOr[typings.awsSdk.clientsGlueMod.Workflow] = js.undefined
}
object GetWorkflowResponse {
  
  inline def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  
  extension [Self <: GetWorkflowResponse](x: Self) {
    
    inline def setWorkflow(value: Workflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
    
    inline def setWorkflowUndefined: Self = StObject.set(x, "Workflow", js.undefined)
  }
}
