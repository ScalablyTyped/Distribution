package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialUpdateObjectResponse extends StObject {
  
  /**
    * The object id updated.
    */
  var objectID: String
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double
}
object PartialUpdateObjectResponse {
  
  inline def apply(objectID: String, taskID: Double): PartialUpdateObjectResponse = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUpdateObjectResponse]
  }
  
  extension [Self <: PartialUpdateObjectResponse](x: Self) {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
  }
}
