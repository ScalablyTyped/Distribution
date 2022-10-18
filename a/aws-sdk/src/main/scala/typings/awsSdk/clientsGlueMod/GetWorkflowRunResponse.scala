package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunResponse extends StObject {
  
  /**
    * The requested workflow run metadata.
    */
  var Run: js.UndefOr[WorkflowRun] = js.undefined
}
object GetWorkflowRunResponse {
  
  inline def apply(): GetWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunResponse]
  }
  
  extension [Self <: GetWorkflowRunResponse](x: Self) {
    
    inline def setRun(value: WorkflowRun): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "Run", js.undefined)
  }
}
