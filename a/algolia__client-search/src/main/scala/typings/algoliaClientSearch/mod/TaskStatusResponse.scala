package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskStatusResponse extends StObject {
  
  /**
    * If the operation is pending.
    */
  var pendingTask: Boolean
  
  /**
    * The operation status. When the value is `published` the
    * operation is completed.
    */
  var status: String
}
object TaskStatusResponse {
  
  inline def apply(pendingTask: Boolean, status: String): TaskStatusResponse = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatusResponse]
  }
  
  extension [Self <: TaskStatusResponse](x: Self) {
    
    inline def setPendingTask(value: Boolean): Self = StObject.set(x, "pendingTask", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
