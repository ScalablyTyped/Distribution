package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficSourcesRequest extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The maximum number of items to return with this call. The maximum value is 50.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The traffic source type that you want to describe. The following lists the valid values:    elb if the traffic source is a Classic Load Balancer.    elbv2 if the traffic source is a Application Load Balancer, Gateway Load Balancer, or Network Load Balancer.    vpc-lattice if the traffic source is VPC Lattice.  
    */
  var TrafficSourceType: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object DescribeTrafficSourcesRequest {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DescribeTrafficSourcesRequest = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficSourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrafficSourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficSourceType(value: XmlStringMaxLen255): Self = StObject.set(x, "TrafficSourceType", value.asInstanceOf[js.Any])
    
    inline def setTrafficSourceTypeUndefined: Self = StObject.set(x, "TrafficSourceType", js.undefined)
  }
}
