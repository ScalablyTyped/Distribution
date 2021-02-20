package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChunkedBatchResponse extends StObject {
  
  /**
    * The object ids created/updated/deleted by the multiple requests.
    */
  var objectIDs: js.Array[String] = js.native
  
  /**
    * The operations task ids. May be used to perform a wait task.
    */
  var taskIDs: js.Array[Double] = js.native
}
object ChunkedBatchResponse {
  
  @scala.inline
  def apply(objectIDs: js.Array[String], taskIDs: js.Array[Double]): ChunkedBatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskIDs = taskIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkedBatchResponse]
  }
  
  @scala.inline
  implicit class ChunkedBatchResponseMutableBuilder[Self <: ChunkedBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value :_*))
    
    @scala.inline
    def setTaskIDs(value: js.Array[Double]): Self = StObject.set(x, "taskIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIDsVarargs(value: Double*): Self = StObject.set(x, "taskIDs", js.Array(value :_*))
  }
}
