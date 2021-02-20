package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexOperationResponse extends StObject {
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
}
object IndexOperationResponse {
  
  @scala.inline
  def apply(taskID: Double): IndexOperationResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexOperationResponse]
  }
  
  @scala.inline
  implicit class IndexOperationResponseMutableBuilder[Self <: IndexOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
  }
}
