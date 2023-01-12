package typings.algoliaClientSearch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleBatchResponse extends StObject {
  
  /**
    * The list of object ids.
    */
  var objectIDs: js.Array[String]
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Record[String, Double]
}
object MultipleBatchResponse {
  
  inline def apply(objectIDs: js.Array[String], taskID: Record[String, Double]): MultipleBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleBatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipleBatchResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    inline def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value*))
    
    inline def setTaskID(value: Record[String, Double]): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
  }
}
