package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetWorkflowsResponse extends StObject {
  
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.undefined
  
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typings.awsSdk.clientsGlueMod.Workflows] = js.undefined
}
object BatchGetWorkflowsResponse {
  
  inline def apply(): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetWorkflowsResponse] (val x: Self) extends AnyVal {
    
    inline def setMissingWorkflows(value: WorkflowNames): Self = StObject.set(x, "MissingWorkflows", value.asInstanceOf[js.Any])
    
    inline def setMissingWorkflowsUndefined: Self = StObject.set(x, "MissingWorkflows", js.undefined)
    
    inline def setMissingWorkflowsVarargs(value: NameString*): Self = StObject.set(x, "MissingWorkflows", js.Array(value*))
    
    inline def setWorkflows(value: Workflows): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "Workflows", js.undefined)
    
    inline def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "Workflows", js.Array(value*))
  }
}
