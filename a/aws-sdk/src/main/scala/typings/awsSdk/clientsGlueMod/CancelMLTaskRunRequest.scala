package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMLTaskRunRequest extends StObject {
  
  /**
    * A unique identifier for the task run.
    */
  var TaskRunId: HashString
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object CancelMLTaskRunRequest {
  
  inline def apply(TaskRunId: HashString, TransformId: HashString): CancelMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMLTaskRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelMLTaskRunRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
