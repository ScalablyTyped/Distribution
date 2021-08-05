package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingActivitiesType extends StObject {
  
  /**
    * The activity IDs of the desired scaling activities. You can specify up to 50 IDs. If you omit this parameter, all activities for the past six weeks are described. If unknown activities are requested, they are ignored with no error. If you specify an Auto Scaling group, the results are limited to that group.
    */
  var ActivityIds: js.UndefOr[typings.awsSdk.autoscalingMod.ActivityIds] = js.undefined
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 100 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeScalingActivitiesType {
  
  inline def apply(): DescribeScalingActivitiesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingActivitiesType]
  }
  
  extension [Self <: DescribeScalingActivitiesType](x: Self) {
    
    inline def setActivityIds(value: ActivityIds): Self = StObject.set(x, "ActivityIds", value.asInstanceOf[js.Any])
    
    inline def setActivityIdsUndefined: Self = StObject.set(x, "ActivityIds", js.undefined)
    
    inline def setActivityIdsVarargs(value: XmlString*): Self = StObject.set(x, "ActivityIds", js.Array(value :_*))
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
