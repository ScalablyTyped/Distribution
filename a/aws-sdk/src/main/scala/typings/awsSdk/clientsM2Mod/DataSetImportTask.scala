package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetImportTask extends StObject {
  
  /**
    * The status of the data set import task.
    */
  var status: DataSetTaskLifecycle
  
  /**
    * A summary of the data set import task.
    */
  var summary: DataSetImportSummary
  
  /**
    * The identifier of the data set import task.
    */
  var taskId: Identifier
}
object DataSetImportTask {
  
  inline def apply(status: DataSetTaskLifecycle, summary: DataSetImportSummary, taskId: Identifier): DataSetImportTask = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetImportTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSetImportTask] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: DataSetTaskLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: DataSetImportSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: Identifier): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
