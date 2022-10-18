package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSetImportTaskRequest extends StObject {
  
  /**
    * The application identifier.
    */
  var applicationId: Identifier
  
  /**
    * The task identifier returned by the CreateDataSetImportTask operation. 
    */
  var taskId: Identifier
}
object GetDataSetImportTaskRequest {
  
  inline def apply(applicationId: Identifier, taskId: Identifier): GetDataSetImportTaskRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetImportTaskRequest]
  }
  
  extension [Self <: GetDataSetImportTaskRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: Identifier): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
