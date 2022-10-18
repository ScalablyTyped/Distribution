package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkflowRunResponse extends StObject {
  
  /**
    * An Id for the new run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}
object StartWorkflowRunResponse {
  
  inline def apply(): StartWorkflowRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkflowRunResponse]
  }
  
  extension [Self <: StartWorkflowRunResponse](x: Self) {
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
