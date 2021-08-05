package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkedBatchResponse extends StObject {
  
  /**
    * The object ids created/updated/deleted by the multiple requests.
    */
  var objectIDs: js.Array[String]
  
  /**
    * The operations task ids. May be used to perform a wait task.
    */
  var taskIDs: js.Array[Double]
}
object ChunkedBatchResponse {
  
  inline def apply(objectIDs: js.Array[String], taskIDs: js.Array[Double]): ChunkedBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskIDs = taskIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkedBatchResponse]
  }
  
  extension [Self <: ChunkedBatchResponse](x: Self) {
    
    inline def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    inline def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value :_*))
    
    inline def setTaskIDs(value: js.Array[Double]): Self = StObject.set(x, "taskIDs", value.asInstanceOf[js.Any])
    
    inline def setTaskIDsVarargs(value: Double*): Self = StObject.set(x, "taskIDs", js.Array(value :_*))
  }
}
