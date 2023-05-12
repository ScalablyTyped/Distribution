package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficSourceIdentifier extends StObject {
  
  /**
    * Identifies the traffic source. For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will be the Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load Balancers, this will be the name of the Classic Load Balancer in this account and Region. For example:    Application Load Balancer ARN: arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456    Classic Load Balancer name: my-classic-load-balancer    VPC Lattice ARN: arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456    To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing DescribeTargetGroups and DescribeLoadBalancers API operations. To get the ARN of a target group for VPC Lattice, use the VPC Lattice GetTargetGroup API operation.
    */
  var Identifier: XmlStringMaxLen511
  
  /**
    * Provides additional context for the value of Identifier. The following lists the valid values:    elb if Identifier is the name of a Classic Load Balancer.    elbv2 if Identifier is the ARN of an Application Load Balancer, Gateway Load Balancer, or Network Load Balancer target group.    vpc-lattice if Identifier is the ARN of a VPC Lattice target group.   Required if the identifier is the name of a Classic Load Balancer.
    */
  var Type: js.UndefOr[XmlStringMaxLen511] = js.undefined
}
object TrafficSourceIdentifier {
  
  inline def apply(Identifier: XmlStringMaxLen511): TrafficSourceIdentifier = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficSourceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrafficSourceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: XmlStringMaxLen511): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: XmlStringMaxLen511): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
