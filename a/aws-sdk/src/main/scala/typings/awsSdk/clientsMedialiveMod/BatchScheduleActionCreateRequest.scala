package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchScheduleActionCreateRequest extends StObject {
  
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: listOfScheduleAction
}
object BatchScheduleActionCreateRequest {
  
  inline def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchScheduleActionCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    inline def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value*))
  }
}
