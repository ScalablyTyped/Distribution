package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScheduledUpdateGroupActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after the scheduled action runs and the capacity it attempts to maintain. It can scale beyond this capacity if you add more scaling conditions. 
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  
  /**
    * The date and time for the recurring schedule to end. Amazon EC2 Auto Scaling does not perform the action after this time.
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
    * The recurring schedule for this action, in Unix cron syntax format. This format consists of five fields separated by white spaces: [Minute] [Hour] [Day_of_Month] [Month_of_Year] [Day_of_Week]. The value must be in quotes (for example, "30 0 1 1,6,12 *"). For more information about this format, see Crontab. When StartTime and EndTime are specified with Recurrence, they form the boundaries of when the recurring action starts and stops.
    */
  var Recurrence: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The name of this scaling action.
    */
  var ScheduledActionName: XmlStringMaxLen255
  
  /**
    * The date and time for this action to start, in YYYY-MM-DDThh:mm:ssZ format in UTC/GMT only and in quotes (for example, "2019-06-01T00:00:00Z"). If you specify Recurrence and StartTime, Amazon EC2 Auto Scaling performs the action at this time, and then performs the action based on the specified recurrence. If you try to schedule your action in the past, Amazon EC2 Auto Scaling returns an error message.
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * This parameter is no longer used.
    */
  var Time: js.UndefOr[TimestampType] = js.undefined
}
object PutScheduledUpdateGroupActionType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: XmlStringMaxLen255): PutScheduledUpdateGroupActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScheduledUpdateGroupActionType]
  }
  
  @scala.inline
  implicit class PutScheduledUpdateGroupActionTypeMutableBuilder[Self <: PutScheduledUpdateGroupActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacityUndefined: Self = StObject.set(x, "DesiredCapacity", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    @scala.inline
    def setRecurrence(value: XmlStringMaxLen255): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    @scala.inline
    def setScheduledActionName(value: XmlStringMaxLen255): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTime(value: TimestampType): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
  }
}
