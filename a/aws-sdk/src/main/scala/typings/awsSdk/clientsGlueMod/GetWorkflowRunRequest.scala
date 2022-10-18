package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunRequest extends StObject {
  
  /**
    * Specifies whether to include the workflow graph in response or not.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Name of the workflow being run.
    */
  var Name: NameString
  
  /**
    * The ID of the workflow run.
    */
  var RunId: IdString
}
object GetWorkflowRunRequest {
  
  inline def apply(Name: NameString, RunId: IdString): GetWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunRequest]
  }
  
  extension [Self <: GetWorkflowRunRequest](x: Self) {
    
    inline def setIncludeGraph(value: NullableBoolean): Self = StObject.set(x, "IncludeGraph", value.asInstanceOf[js.Any])
    
    inline def setIncludeGraphUndefined: Self = StObject.set(x, "IncludeGraph", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
