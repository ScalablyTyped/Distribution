package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationConfigurationsType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupNames: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AutoScalingGroupNames] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeNotificationConfigurationsType {
  
  inline def apply(): DescribeNotificationConfigurationsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationConfigurationsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNotificationConfigurationsType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupNames(value: AutoScalingGroupNames): Self = StObject.set(x, "AutoScalingGroupNames", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupNamesUndefined: Self = StObject.set(x, "AutoScalingGroupNames", js.undefined)
    
    inline def setAutoScalingGroupNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AutoScalingGroupNames", js.Array(value*))
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
