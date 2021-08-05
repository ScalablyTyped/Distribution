package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveSynonymResponse extends StObject {
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double
  
  /**
    * When the given synonyms got saved.
    */
  var updatedAt: Double
}
object SaveSynonymResponse {
  
  inline def apply(taskID: Double, updatedAt: Double): SaveSynonymResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveSynonymResponse]
  }
  
  extension [Self <: SaveSynonymResponse](x: Self) {
    
    inline def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
