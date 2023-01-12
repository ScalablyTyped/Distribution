package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetWorkflowsRequest extends StObject {
  
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of workflow names, which may be the names returned from the ListWorkflows operation.
    */
  var Names: WorkflowNames
}
object BatchGetWorkflowsRequest {
  
  inline def apply(Names: WorkflowNames): BatchGetWorkflowsRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetWorkflowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetWorkflowsRequest] (val x: Self) extends AnyVal {
    
    inline def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    inline def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    inline def setNames(value: WorkflowNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: NameString*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
