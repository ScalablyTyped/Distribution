package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchResponse extends StObject {
  
  /**
    * The object ids created/updated by the batch request.
    */
  var objectIDs: js.Array[String] = js.native
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
}
object BatchResponse {
  
  @scala.inline
  def apply(objectIDs: js.Array[String], taskID: Double): BatchResponse = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResponse]
  }
  
  @scala.inline
  implicit class BatchResponseMutableBuilder[Self <: BatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIDs(value: js.Array[String]): Self = StObject.set(x, "objectIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIDsVarargs(value: String*): Self = StObject.set(x, "objectIDs", js.Array(value :_*))
    
    @scala.inline
    def setTaskID(value: Double): Self = StObject.set(x, "taskID", value.asInstanceOf[js.Any])
  }
}
