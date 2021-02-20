package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledActionsType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The latest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The names of one or more scheduled actions. You can specify up to 50 actions. If you omit this parameter, all scheduled actions are described. If you specify an unknown scheduled action, it is ignored with no error.
    */
  var ScheduledActionNames: js.UndefOr[typings.awsSdk.autoscalingMod.ScheduledActionNames] = js.native
  
  /**
    * The earliest scheduled start time to return. If scheduled action names are provided, this parameter is ignored.
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
}
object DescribeScheduledActionsType {
  
  @scala.inline
  def apply(): DescribeScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsType]
  }
  
  @scala.inline
  implicit class DescribeScheduledActionsTypeMutableBuilder[Self <: DescribeScheduledActionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledActionNames(value: ScheduledActionNames): Self = StObject.set(x, "ScheduledActionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionNamesUndefined: Self = StObject.set(x, "ScheduledActionNames", js.undefined)
    
    @scala.inline
    def setScheduledActionNamesVarargs(value: ResourceName*): Self = StObject.set(x, "ScheduledActionNames", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
