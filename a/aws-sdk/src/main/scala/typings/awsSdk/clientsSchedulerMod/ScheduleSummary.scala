package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var Arn: js.UndefOr[ScheduleArn] = js.undefined
  
  /**
    * The time at which the schedule was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the schedule group associated with this schedule.
    */
  var GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * The time at which the schedule was last modified.
    */
  var LastModificationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Name] = js.undefined
  
  /**
    * Specifies whether the schedule is enabled or disabled.
    */
  var State: js.UndefOr[ScheduleState] = js.undefined
  
  /**
    * The schedule's target details.
    */
  var Target: js.UndefOr[TargetSummary] = js.undefined
}
object ScheduleSummary {
  
  inline def apply(): ScheduleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ScheduleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setGroupName(value: ScheduleGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setLastModificationDate(value: js.Date): Self = StObject.set(x, "LastModificationDate", value.asInstanceOf[js.Any])
    
    inline def setLastModificationDateUndefined: Self = StObject.set(x, "LastModificationDate", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ScheduleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTarget(value: TargetSummary): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
