package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
  /**
    * The port number associated with the EC2 instance.
    */
  var InstancePort: EndPointPort
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The names of the policies. If the list is empty, then all current polices are removed from the EC2 instance.
    */
  var PolicyNames: typings.awsDashSdk.clientsElbMod.PolicyNames
}

object SetLoadBalancerPoliciesForBackendServerInput {
  @scala.inline
  def apply(InstancePort: EndPointPort, LoadBalancerName: AccessPointName, PolicyNames: PolicyNames): SetLoadBalancerPoliciesForBackendServerInput = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort, LoadBalancerName = LoadBalancerName, PolicyNames = PolicyNames)
  
    __obj.asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
  }
}

