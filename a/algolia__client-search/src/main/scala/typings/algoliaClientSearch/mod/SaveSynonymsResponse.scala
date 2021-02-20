package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveSynonymsResponse extends StObject {
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
  
  /**
    * When the given synonyms got saved.
    */
  var updatedAt: Double = js.native
}
object SaveSynonymsResponse {
  
  @scala.inline
  def apply(taskID: Double, updatedAt: Double): SaveSynonymsResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveSynonymsResponse]
  }
  
  @scala.inline
  implicit class SaveSynonymsResponseMutableBuilder[Self <: SaveSynonymsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
