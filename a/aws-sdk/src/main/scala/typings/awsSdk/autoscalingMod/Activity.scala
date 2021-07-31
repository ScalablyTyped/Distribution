package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  /**
    * The ID of the activity.
    */
  var ActivityId: XmlString
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The reason the activity began.
    */
  var Cause: XmlStringMaxLen1023
  
  /**
    * A friendly, more verbose description of the activity.
    */
  var Description: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The details about the activity.
    */
  var Details: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The end time of the activity.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * A value between 0 and 100 that indicates the progress of the activity.
    */
  var Progress: js.UndefOr[typings.awsSdk.autoscalingMod.Progress] = js.undefined
  
  /**
    * The start time of the activity.
    */
  var StartTime: TimestampType
  
  /**
    * The current status of the activity.
    */
  var StatusCode: ScalingActivityStatusCode
  
  /**
    * A friendly, more verbose description of the activity status.
    */
  var StatusMessage: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object Activity {
  
  @scala.inline
  def apply(
    ActivityId: XmlString,
    AutoScalingGroupName: XmlStringMaxLen255,
    Cause: XmlStringMaxLen1023,
    StartTime: TimestampType,
    StatusCode: ScalingActivityStatusCode
  ): Activity = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId.asInstanceOf[js.Any], AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Cause = Cause.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any], StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: XmlString): Self = StObject.set(x, "ActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCause(value: XmlStringMaxLen1023): Self = StObject.set(x, "Cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: XmlString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDetails(value: XmlString): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setProgress(value: Progress): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: ScalingActivityStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: XmlStringMaxLen255): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
