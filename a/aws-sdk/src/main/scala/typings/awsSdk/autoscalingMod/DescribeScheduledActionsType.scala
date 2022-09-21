package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduledActionsType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The latest scheduled start time to return. If scheduled action names are provided, this property is ignored.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The names of one or more scheduled actions. If you omit this property, all scheduled actions are described. If you specify an unknown scheduled action, it is ignored with no error. Array Members: Maximum number of 50 actions.
    */
  var ScheduledActionNames: js.UndefOr[typings.awsSdk.autoscalingMod.ScheduledActionNames] = js.undefined
  
  /**
    * The earliest scheduled start time to return. If scheduled action names are provided, this property is ignored.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeScheduledActionsType {
  
  inline def apply(): DescribeScheduledActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledActionsType]
  }
  
  extension [Self <: DescribeScheduledActionsType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledActionNames(value: ScheduledActionNames): Self = StObject.set(x, "ScheduledActionNames", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNamesUndefined: Self = StObject.set(x, "ScheduledActionNames", js.undefined)
    
    inline def setScheduledActionNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ScheduledActionNames", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
