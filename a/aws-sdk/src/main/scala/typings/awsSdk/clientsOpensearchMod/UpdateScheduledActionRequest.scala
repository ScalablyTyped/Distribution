package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduledActionRequest extends StObject {
  
  /**
    * The unique identifier of the action to reschedule. To retrieve this ID, send a ListScheduledActions request.
    */
  var ActionID: String
  
  /**
    * The type of action to reschedule. Can be one of SERVICE_SOFTWARE_UPDATE, JVM_HEAP_SIZE_TUNING, or JVM_YOUNG_GEN_TUNING. To retrieve this value, send a ListScheduledActions request.
    */
  var ActionType: typings.awsSdk.clientsOpensearchMod.ActionType
  
  /**
    * The time to implement the change, in Coordinated Universal Time (UTC). Only specify this parameter if you set ScheduleAt to TIMESTAMP.
    */
  var DesiredStartTime: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the domain to reschedule an action for.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * When to schedule the action.    NOW - Immediately schedules the update to happen in the current hour if there's capacity available.    TIMESTAMP - Lets you specify a custom date and time to apply the update. If you specify this value, you must also provide a value for DesiredStartTime.    OFF_PEAK_WINDOW - Marks the action to be picked up during an upcoming off-peak window. There's no guarantee that the change will be implemented during the next immediate window. Depending on capacity, it might happen in subsequent days.  
    */
  var ScheduleAt: typings.awsSdk.clientsOpensearchMod.ScheduleAt
}
object UpdateScheduledActionRequest {
  
  inline def apply(ActionID: String, ActionType: ActionType, DomainName: DomainName, ScheduleAt: ScheduleAt): UpdateScheduledActionRequest = {
    val __obj = js.Dynamic.literal(ActionID = ActionID.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ScheduleAt = ScheduleAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduledActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScheduledActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionID(value: String): Self = StObject.set(x, "ActionID", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setDesiredStartTime(value: Long): Self = StObject.set(x, "DesiredStartTime", value.asInstanceOf[js.Any])
    
    inline def setDesiredStartTimeUndefined: Self = StObject.set(x, "DesiredStartTime", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setScheduleAt(value: ScheduleAt): Self = StObject.set(x, "ScheduleAt", value.asInstanceOf[js.Any])
  }
}
