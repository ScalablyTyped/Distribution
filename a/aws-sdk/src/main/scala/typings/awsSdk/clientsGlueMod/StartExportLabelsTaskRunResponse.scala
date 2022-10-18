package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportLabelsTaskRunResponse extends StObject {
  
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.undefined
}
object StartExportLabelsTaskRunResponse {
  
  inline def apply(): StartExportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportLabelsTaskRunResponse]
  }
  
  extension [Self <: StartExportLabelsTaskRunResponse](x: Self) {
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
  }
}
