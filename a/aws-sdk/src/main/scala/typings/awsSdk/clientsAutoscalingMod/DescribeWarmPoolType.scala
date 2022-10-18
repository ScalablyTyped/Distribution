package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWarmPoolType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The maximum number of instances to return with this call. The maximum value is 50.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of instances to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeWarmPoolType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DescribeWarmPoolType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWarmPoolType]
  }
  
  extension [Self <: DescribeWarmPoolType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
