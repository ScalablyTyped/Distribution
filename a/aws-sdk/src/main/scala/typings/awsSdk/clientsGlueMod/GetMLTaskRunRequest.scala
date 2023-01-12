package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTaskRunRequest extends StObject {
  
  /**
    * The unique identifier of the task run.
    */
  var TaskRunId: HashString
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object GetMLTaskRunRequest {
  
  inline def apply(TaskRunId: HashString, TransformId: HashString): GetMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMLTaskRunRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
