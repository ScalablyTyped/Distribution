package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachLoadBalancerTargetGroupsType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups. To get the ARN of a target group, use the Elastic Load Balancing DescribeTargetGroups API operation.
    */
  var TargetGroupARNs: typings.awsSdk.clientsAutoscalingMod.TargetGroupARNs
}
object AttachLoadBalancerTargetGroupsType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, TargetGroupARNs: TargetGroupARNs): AttachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TargetGroupARNs = TargetGroupARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTargetGroupsType]
  }
  
  extension [Self <: AttachLoadBalancerTargetGroupsType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNs(value: TargetGroupARNs): Self = StObject.set(x, "TargetGroupARNs", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = StObject.set(x, "TargetGroupARNs", js.Array(value*))
  }
}
