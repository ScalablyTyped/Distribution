package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledUpdateGroupAction extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the capacity it attempts to maintain.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  
  /**
    * The date and time in UTC for the recurring schedule to end. For example, "2019-06-01T00:00:00Z". 
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The maximum size of the Auto Scaling group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
  
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
  
  /**
    * The recurring schedule for the action, in Unix cron syntax format. When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
    */
  var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  var ScheduledActionARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The date and time in UTC for this action to start. For example, "2019-06-01T00:00:00Z". 
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * This parameter is no longer used.
    */
  var Time: js.UndefOr[TimestampType] = js.undefined
}
object ScheduledUpdateGroupAction {
  
  inline def apply(): ScheduledUpdateGroupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledUpdateGroupAction]
  }
  
  extension [Self <: ScheduledUpdateGroupAction](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityUndefined: Self = StObject.set(x, "DesiredCapacity", js.undefined)
    
    inline def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxSize(value: AutoScalingGroupMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: AutoScalingGroupMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setRecurrence(value: XmlStringMaxLen255): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setScheduledActionARN(value: ResourceName): Self = StObject.set(x, "ScheduledActionARN", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionARNUndefined: Self = StObject.set(x, "ScheduledActionARN", js.undefined)
    
    inline def setScheduledActionName(value: XmlStringMaxLen255): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNameUndefined: Self = StObject.set(x, "ScheduledActionName", js.undefined)
    
    inline def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTime(value: TimestampType): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
  }
}
