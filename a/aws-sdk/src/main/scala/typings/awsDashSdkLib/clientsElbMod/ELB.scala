package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELB
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ELB: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load balancer, AddTags updates its value. For more information, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified tags to the specified load balancer. Each load balancer can have a maximum of 10 tags. Each tag consists of a key and an optional value. If a tag with the same key is already associated with the load balancer, AddTags updates its value. For more information, see Tag Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTags(
    params: AddTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified security groups override the previously associated security groups. For more information, see Security Groups for Load Balancers in a VPC in the Classic Load Balancers Guide.
    */
  def applySecurityGroupsToLoadBalancer(): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applySecurityGroupsToLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplySecurityGroupsToLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates one or more security groups with your load balancer in a virtual private cloud (VPC). The specified security groups override the previously associated security groups. For more information, see Security Groups for Load Balancers in a VPC in the Classic Load Balancers Guide.
    */
  def applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def applySecurityGroupsToLoadBalancer(
    params: ApplySecurityGroupsToLoadBalancerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ApplySecurityGroupsToLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ApplySecurityGroupsToLoadBalancerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more subnets to the set of configured subnets for the specified load balancer. The load balancer evenly distributes requests across all registered subnets. For more information, see Add or Remove Subnets for Your Load Balancer in a VPC in the Classic Load Balancers Guide.
    */
  def attachLoadBalancerToSubnets(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerToSubnets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerToSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more subnets to the set of configured subnets for the specified load balancer. The load balancer evenly distributes requests across all registered subnets. For more information, see Add or Remove Subnets for Your Load Balancer in a VPC in the Classic Load Balancers Guide.
    */
  def attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerToSubnets(
    params: AttachLoadBalancerToSubnetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerToSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerToSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Specifies the health check settings to use when evaluating the health state of your EC2 instances. For more information, see Configure Health Checks for Your Load Balancer in the Classic Load Balancers Guide.
    */
  def configureHealthCheck(): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def configureHealthCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigureHealthCheckOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Specifies the health check settings to use when evaluating the health state of your EC2 instances. For more information, see Configure Health Checks for Your Load Balancer in the Classic Load Balancers Guide.
    */
  def configureHealthCheck(params: ConfigureHealthCheckInput): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def configureHealthCheck(
    params: ConfigureHealthCheckInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfigureHealthCheckOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfigureHealthCheckOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie. This policy can be associated only with HTTP/HTTPS listeners. This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime of the special Elastic Load Balancing cookie, AWSELB, follows the lifetime of the application-generated cookie specified in the policy configuration. The load balancer only inserts a new stickiness cookie when the application response includes a new application cookie. If the application cookie is explicitly removed or expires, the session stops being sticky until a new application cookie is issued. For more information, see Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
    */
  def createAppCookieStickinessPolicy(): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAppCookieStickinessPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppCookieStickinessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a stickiness policy with sticky session lifetimes that follow that of an application-generated cookie. This policy can be associated only with HTTP/HTTPS listeners. This policy is similar to the policy created by CreateLBCookieStickinessPolicy, except that the lifetime of the special Elastic Load Balancing cookie, AWSELB, follows the lifetime of the application-generated cookie specified in the policy configuration. The load balancer only inserts a new stickiness cookie when the application response includes a new application cookie. If the application cookie is explicitly removed or expires, the session stops being sticky until a new application cookie is issued. For more information, see Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
    */
  def createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAppCookieStickinessPolicy(
    params: CreateAppCookieStickinessPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAppCookieStickinessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAppCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners. When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for each request. When the load balancer receives a request, it first checks to see if this cookie is present in the request. If so, the load balancer sends the request to the application server specified in the cookie. If not, the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm. A cookie is inserted into the response for binding subsequent requests from the same user to that server. The validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration. For more information, see Duration-Based Session Stickiness in the Classic Load Balancers Guide.
    */
  def createLBCookieStickinessPolicy(): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLBCookieStickinessPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLBCookieStickinessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent) or a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners. When a load balancer implements this policy, the load balancer uses a special cookie to track the instance for each request. When the load balancer receives a request, it first checks to see if this cookie is present in the request. If so, the load balancer sends the request to the application server specified in the cookie. If not, the load balancer sends the request to a server that is chosen based on the existing load-balancing algorithm. A cookie is inserted into the response for binding subsequent requests from the same user to that server. The validity of the cookie is based on the cookie expiration time, which is specified in the policy configuration. For more information, see Duration-Based Session Stickiness in the Classic Load Balancers Guide.
    */
  def createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLBCookieStickinessPolicy(
    params: CreateLBCookieStickinessPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLBCookieStickinessPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLBCookieStickinessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Classic Load Balancer. You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them later using CreateLoadBalancerListeners, ApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. You can create up to 20 load balancers per region per account. You can request an increase for the number of load balancers for your account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccessPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Classic Load Balancer. You can add listeners, security groups, subnets, and tags when you create your load balancer, or you can add them later using CreateLoadBalancerListeners, ApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. You can create up to 20 load balancers per region per account. You can request an increase for the number of load balancers for your account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def createLoadBalancer(params: CreateAccessPointInput): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancer(
    params: CreateAccessPointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccessPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one or more listeners for the specified load balancer. If a listener with the specified port does not already exist, it is created; otherwise, the properties of the new listener must match the properties of the existing listener. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def createLoadBalancerListeners(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one or more listeners for the specified load balancer. If a listener with the specified port does not already exist, it is created; otherwise, the properties of the new listener must match the properties of the existing listener. For more information, see Listeners for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def createLoadBalancerListeners(params: CreateLoadBalancerListenerInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerListeners(
    params: CreateLoadBalancerListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a policy with the specified attributes for the specified load balancer. Policies are settings that are saved for your load balancer and that can be applied to the listener or the application server, depending on the policy type.
    */
  def createLoadBalancerPolicy(): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a policy with the specified attributes for the specified load balancer. Policies are settings that are saved for your load balancer and that can be applied to the listener or the application server, depending on the policy type.
    */
  def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoadBalancerPolicy(
    params: CreateLoadBalancerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoadBalancerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified load balancer. If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances. If the load balancer does not exist or has already been deleted, the call to DeleteLoadBalancer still succeeds.
    */
  def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccessPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified load balancer. If you are attempting to recreate a load balancer, you must reconfigure all settings. The DNS name associated with a deleted load balancer are no longer usable. The name and associated DNS record of the deleted load balancer no longer exist and traffic sent to any of its IP addresses is no longer delivered to your instances. If the load balancer does not exist or has already been deleted, the call to DeleteLoadBalancer still succeeds.
    */
  def deleteLoadBalancer(params: DeleteAccessPointInput): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancer(
    params: DeleteAccessPointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccessPointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccessPointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified listeners from the specified load balancer.
    */
  def deleteLoadBalancerListeners(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified listeners from the specified load balancer.
    */
  def deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerListeners(
    params: DeleteLoadBalancerListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
    */
  def deleteLoadBalancerPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified policy from the specified load balancer. This policy must not be enabled for any listeners.
    */
  def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoadBalancerPolicy(
    params: DeleteLoadBalancerPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoadBalancerPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoadBalancerPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no longer receives traffic from the load balancer. You can use DescribeLoadBalancers to verify that the instance is deregistered from the load balancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
    */
  def deregisterInstancesFromLoadBalancer(): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterInstancesFromLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterEndPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters the specified instances from the specified load balancer. After the instance is deregistered, it no longer receives traffic from the load balancer. You can use DescribeLoadBalancers to verify that the instance is deregistered from the load balancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
    */
  def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterInstancesFromLoadBalancer(
    params: DeregisterEndPointsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterEndPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Classic Load Balancer in the Classic Load Balancers Guide.
    */
  def describeAccountLimits(params: DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountLimits(
    params: DescribeAccountLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the state of the specified instances with respect to the specified load balancer. If no instances are specified, the call describes the state of all instances that are currently registered with the load balancer. If instances are specified, their state is returned even if they are no longer registered with the load balancer. The state of terminated instances is not returned.
    */
  def describeInstanceHealth(): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the state of the specified instances with respect to the specified load balancer. If no instances are specified, the call describes the state of all instances that are currently registered with the load balancer. If instances are specified, their state is returned even if they are no longer registered with the load balancer. The state of terminated instances is not returned.
    */
  def describeInstanceHealth(params: DescribeEndPointStateInput): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInstanceHealth(
    params: DescribeEndPointStateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified load balancer.
    */
  def describeLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the attributes for the specified load balancer.
    */
  def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerAttributes(
    params: DescribeLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified policies. If you specify a load balancer name, the action returns the descriptions of all policies created for the load balancer. If you specify a policy name associated with your load balancer, the action returns the description of that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample policies, or descriptions of all sample policies. The names of the sample policies have the ELBSample- prefix.
    */
  def describeLoadBalancerPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified policies. If you specify a load balancer name, the action returns the descriptions of all policies created for the load balancer. If you specify a policy name associated with your load balancer, the action returns the description of that policy. If you don't specify a load balancer name, the action returns descriptions of the specified sample policies, or descriptions of all sample policies. The names of the sample policies have the ELBSample- prefix.
    */
  def describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerPolicies(
    params: DescribeLoadBalancerPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified load balancer policy types or all load balancer policy types. The description of each type indicates how it can be used. For example, some policies can be used only with layer 7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your EC2 instances. You can use CreateLoadBalancerPolicy to create a policy configuration for any of these policy types. Then, depending on the policy type, use either SetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to set the policy.
    */
  def describeLoadBalancerPolicyTypes(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerPolicyTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerPolicyTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified load balancer policy types or all load balancer policy types. The description of each type indicates how it can be used. For example, some policies can be used only with layer 7 listeners, some policies can be used only with layer 4 listeners, and some policies can be used only with your EC2 instances. You can use CreateLoadBalancerPolicy to create a policy configuration for any of these policy types. Then, depending on the policy type, use either SetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to set the policy.
    */
  def describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerPolicyTypes(
    params: DescribeLoadBalancerPolicyTypesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerPolicyTypesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerPolicyTypesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your load balancers.
    */
  def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccessPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified the load balancers. If no load balancers are specified, the call describes all of your load balancers.
    */
  def describeLoadBalancers(params: DescribeAccessPointsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    params: DescribeAccessPointsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccessPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccessPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags associated with the specified load balancers.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the tags associated with the specified load balancers.
    */
  def describeTags(params: DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    params: DescribeTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified subnets from the set of configured subnets for the load balancer. After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the OutOfService state. Then, the load balancer balances the traffic among the remaining routable subnets.
    */
  def detachLoadBalancerFromSubnets(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancerFromSubnets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancerFromSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified subnets from the set of configured subnets for the load balancer. After a subnet is removed, all EC2 instances registered with the load balancer in the removed subnet go into the OutOfService state. Then, the load balancer balances the traffic among the remaining routable subnets.
    */
  def detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancerFromSubnets(
    params: DetachLoadBalancerFromSubnetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancerFromSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerFromSubnetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets. There must be at least one Availability Zone registered with a load balancer at all times. After an Availability Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go into the OutOfService state. Then, the load balancer attempts to equally balance the traffic among its remaining Availability Zones. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
    */
  def disableAvailabilityZonesForLoadBalancer(): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAvailabilityZonesForLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveAvailabilityZonesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified Availability Zones from the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets. There must be at least one Availability Zone registered with a load balancer at all times. After an Availability Zone is removed, all instances registered with the load balancer that are in the removed Availability Zone go into the OutOfService state. Then, the load balancer attempts to equally balance the traffic among its remaining Availability Zones. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
    */
  def disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableAvailabilityZonesForLoadBalancer(
    params: RemoveAvailabilityZonesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveAvailabilityZonesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets. The load balancer evenly distributes requests across all its registered Availability Zones that contain instances. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
    */
  def enableAvailabilityZonesForLoadBalancer(): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAvailabilityZonesForLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddAvailabilityZonesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified Availability Zones to the set of Availability Zones for the specified load balancer in EC2-Classic or a default VPC. For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets. The load balancer evenly distributes requests across all its registered Availability Zones that contain instances. For more information, see Add or Remove Availability Zones in the Classic Load Balancers Guide.
    */
  def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableAvailabilityZonesForLoadBalancer(
    params: AddAvailabilityZonesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddAvailabilityZonesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddAvailabilityZonesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the attributes of the specified load balancer. You can modify the load balancer attributes, such as AccessLogs, ConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling them. Or, you can modify the load balancer attribute ConnectionSettings by specifying an idle connection timeout value for your load balancer. For more information, see the following in the Classic Load Balancers Guide:    Cross-Zone Load Balancing     Connection Draining     Access Logs     Idle Connection Timeout   
    */
  def modifyLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the attributes of the specified load balancer. You can modify the load balancer attributes, such as AccessLogs, ConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling them. Or, you can modify the load balancer attribute ConnectionSettings by specifying an idle connection timeout value for your load balancer. For more information, see the following in the Classic Load Balancers Guide:    Cross-Zone Load Balancing     Connection Draining     Access Logs     Idle Connection Timeout   
    */
  def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLoadBalancerAttributes(
    params: ModifyLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLoadBalancerAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified instances to the specified load balancer. The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in the VPC. Note that RegisterInstanceWithLoadBalancer completes when the request has been registered. Instance registration takes a little time to complete. To check the state of the registered instances, use DescribeLoadBalancers or DescribeInstanceHealth. After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance that is not in one of the Availability Zones registered for the load balancer is moved to the OutOfService state. If an Availability Zone is added to the load balancer later, any instances registered with the load balancer move to the InService state. To deregister instances from a load balancer, use DeregisterInstancesFromLoadBalancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
    */
  def registerInstancesWithLoadBalancer(): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerInstancesWithLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterEndPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified instances to the specified load balancer. The instance must be a running instance in the same network as the load balancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a load balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic instances to that VPC and then register the linked EC2-Classic instances with the load balancer in the VPC. Note that RegisterInstanceWithLoadBalancer completes when the request has been registered. Instance registration takes a little time to complete. To check the state of the registered instances, use DescribeLoadBalancers or DescribeInstanceHealth. After the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance that is not in one of the Availability Zones registered for the load balancer is moved to the OutOfService state. If an Availability Zone is added to the load balancer later, any instances registered with the load balancer move to the InService state. To deregister instances from a load balancer, use DeregisterInstancesFromLoadBalancer. For more information, see Register or De-Register EC2 Instances in the Classic Load Balancers Guide.
    */
  def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerInstancesWithLoadBalancer(
    params: RegisterEndPointsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterEndPointsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterEndPointsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the specified load balancer.
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the specified load balancer.
    */
  def removeTags(params: RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTags(
    params: RemoveTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces any prior certificate that was used on the same load balancer and port. For more information about updating your SSL certificate, see Replace the SSL Certificate for Your Load Balancer in the Classic Load Balancers Guide.
    */
  def setLoadBalancerListenerSSLCertificate(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerListenerSSLCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerListenerSSLCertificateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the certificate that terminates the specified listener's SSL connections. The specified certificate replaces any prior certificate that was used on the same load balancer and port. For more information about updating your SSL certificate, see Replace the SSL Certificate for Your Load Balancer in the Classic Load Balancers Guide.
    */
  def setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerListenerSSLCertificate(
    params: SetLoadBalancerListenerSSLCertificateInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerListenerSSLCertificateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerListenerSSLCertificateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new set of policies. At this time, only the back-end server authentication policy type can be applied to the instance ports; this policy type is composed of multiple public key policies. Each time you use SetLoadBalancerPoliciesForBackendServer to enable the policies, use the PolicyNames parameter to list the policies that you want to enable. You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify that the policy is associated with the EC2 instance. For more information about enabling back-end instance authentication, see Configure Back-end Instance Authentication in the Classic Load Balancers Guide. For more information about Proxy Protocol, see Configure Proxy Protocol Support in the Classic Load Balancers Guide.
    */
  def setLoadBalancerPoliciesForBackendServer(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerPoliciesForBackendServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerPoliciesForBackendServerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the set of policies associated with the specified port on which the EC2 instance is listening with a new set of policies. At this time, only the back-end server authentication policy type can be applied to the instance ports; this policy type is composed of multiple public key policies. Each time you use SetLoadBalancerPoliciesForBackendServer to enable the policies, use the PolicyNames parameter to list the policies that you want to enable. You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify that the policy is associated with the EC2 instance. For more information about enabling back-end instance authentication, see Configure Back-end Instance Authentication in the Classic Load Balancers Guide. For more information about Proxy Protocol, see Configure Proxy Protocol Support in the Classic Load Balancers Guide.
    */
  def setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerPoliciesForBackendServer(
    params: SetLoadBalancerPoliciesForBackendServerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerPoliciesForBackendServerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesForBackendServerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the current set of policies for the specified load balancer port with the specified set of policies. To enable back-end server authentication, use SetLoadBalancerPoliciesForBackendServer. For more information about setting policies, see Update the SSL Negotiation Configuration, Duration-Based Session Stickiness, and Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
    */
  def setLoadBalancerPoliciesOfListener(): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerPoliciesOfListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerPoliciesOfListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Replaces the current set of policies for the specified load balancer port with the specified set of policies. To enable back-end server authentication, use SetLoadBalancerPoliciesForBackendServer. For more information about setting policies, see Update the SSL Negotiation Configuration, Duration-Based Session Stickiness, and Application-Controlled Session Stickiness in the Classic Load Balancers Guide.
    */
  def setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setLoadBalancerPoliciesOfListener(
    params: SetLoadBalancerPoliciesOfListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetLoadBalancerPoliciesOfListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetLoadBalancerPoliciesOfListenerOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the anyInstanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_anyInstanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_anyInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the anyInstanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_anyInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_anyInstanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.anyInstanceInService,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the instanceDeregistered state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceDeregistered(state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the instanceDeregistered state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceDeregistered,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the instanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceInService(state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Waits for the instanceInService state by periodically calling the underlying ELB.describeInstanceHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_instanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceInService,
    params: DescribeEndPointStateInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeEndPointStateOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeEndPointStateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

