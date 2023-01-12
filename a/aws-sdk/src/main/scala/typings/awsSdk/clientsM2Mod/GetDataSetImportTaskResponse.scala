package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetImportTaskResponse extends StObject {
  
  /**
    * The status of the task.
    */
  var status: DataSetTaskLifecycle
  
  /**
    * A summary of the status of the task.
    */
  var summary: js.UndefOr[DataSetImportSummary] = js.undefined
  
  /**
    * The task identifier.
    */
  var taskId: Identifier
}
object GetDataSetImportTaskResponse {
  
  inline def apply(status: DataSetTaskLifecycle, taskId: Identifier): GetDataSetImportTaskResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetImportTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSetImportTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: DataSetTaskLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: DataSetImportSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTaskId(value: Identifier): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
