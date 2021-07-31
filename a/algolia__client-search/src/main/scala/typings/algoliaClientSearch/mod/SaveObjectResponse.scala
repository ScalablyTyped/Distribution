package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveObjectResponse extends StObject {
  
  /**
    * The object id saved.
    */
  var objectID: String
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double
}
object SaveObjectResponse {
  
  @scala.inline
  def apply(objectID: String, taskID: Double): SaveObjectResponse = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveObjectResponse]
  }
  
  @scala.inline
  implicit class SaveObjectResponseMutableBuilder[Self <: SaveObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
  }
}
