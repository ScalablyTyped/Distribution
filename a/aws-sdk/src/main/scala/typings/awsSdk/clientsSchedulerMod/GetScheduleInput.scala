package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScheduleInput extends StObject {
  
  /**
    * The name of the schedule group associated with this schedule. If you omit this, EventBridge Scheduler assumes that the schedule is associated with the default group.
    */
  var GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * The name of the schedule to retrieve.
    */
  var Name: typings.awsSdk.clientsSchedulerMod.Name
}
object GetScheduleInput {
  
  inline def apply(Name: Name): GetScheduleInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScheduleInput]
  }
  
  extension [Self <: GetScheduleInput](x: Self) {
    
    inline def setGroupName(value: ScheduleGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
