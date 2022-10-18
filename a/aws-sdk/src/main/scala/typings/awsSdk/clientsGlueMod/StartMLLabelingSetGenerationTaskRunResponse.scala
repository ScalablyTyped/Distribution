package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMLLabelingSetGenerationTaskRunResponse extends StObject {
  
  /**
    * The unique run identifier that is associated with this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
}
object StartMLLabelingSetGenerationTaskRunResponse {
  
  inline def apply(): StartMLLabelingSetGenerationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunResponse]
  }
  
  extension [Self <: StartMLLabelingSetGenerationTaskRunResponse](x: Self) {
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
  }
}
