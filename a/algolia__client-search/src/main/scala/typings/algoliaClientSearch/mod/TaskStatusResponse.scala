package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskStatusResponse extends StObject {
  
  /**
    * If the operation is pending.
    */
  var pendingTask: Boolean = js.native
  
  /**
    * The operation status. When the value is `published` the
    * operation is completed.
    */
  var status: String = js.native
}
object TaskStatusResponse {
  
  @scala.inline
  def apply(pendingTask: Boolean, status: String): TaskStatusResponse = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatusResponse]
  }
  
  @scala.inline
  implicit class TaskStatusResponseMutableBuilder[Self <: TaskStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPendingTask(value: Boolean): Self = StObject.set(x, "pendingTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
