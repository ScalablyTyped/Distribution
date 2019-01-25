package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ELBv2
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ELBv2: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ClientConfiguration = js.native
  /**
    * Adds the specified certificate to the specified HTTPS listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates. To specify the default SSL server certificate, use ModifyListener.
    */
  def addListenerCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds the specified certificate to the specified HTTPS listener. If the certificate was already added, the call is successful but the certificate is not added again. To list the certificates for your listener, use DescribeListenerCertificates. To remove certificates from your listener, use RemoveListenerCertificates. To specify the default SSL server certificate, use ModifyListener.
    */
  def addListenerCertificates(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addListenerCertificates(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds the specified tags to the specified Elastic Load Balancing resource. You can tag your Application Load Balancers, Network Load Balancers, and your target groups. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, AddTags updates its value. To list the current tags for your resources, use DescribeTags. To remove tags from your resources, use RemoveTags.
    */
  def addTags(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a listener for the specified Application Load Balancer or Network Load Balancer. To update a listener, use ModifyListener. When you are finished with a listener, you can delete it using DeleteListener. If you are finished with both the listener and the load balancer, you can delete them both using DeleteLoadBalancer. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple listeners with the same settings, each call succeeds. For more information, see Listeners for Your Application Load Balancers in the Application Load Balancers Guide and Listeners for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createListener(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createListener(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
    */
  def createLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Application Load Balancer or a Network Load Balancer. When you create a load balancer, you can specify security groups, public subnets, IP address type, and tags. Otherwise, you could do so later using SetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags. To create listeners for your load balancer, use CreateListener. To describe your current load balancers, see DescribeLoadBalancers. When you are finished with a load balancer, you can delete it using DeleteLoadBalancer. For limit information, see Limits for Your Application Load Balancer in the Application Load Balancers Guide and Limits for Your Network Load Balancer in the Network Load Balancers Guide. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple load balancers with the same settings, each call succeeds. For more information, see Application Load Balancers in the Application Load Balancers Guide and Network Load Balancers in the Network Load Balancers Guide.
    */
  def createLoadBalancer(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLoadBalancer(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
    */
  def createRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a rule for the specified listener. The listener must be associated with an Application Load Balancer. Rules are evaluated in priority order, from the lowest value to the highest value. When the conditions for a rule are met, its actions are performed. If the conditions for no rules are met, the actions for the default rule are performed. For more information, see Listener Rules in the Application Load Balancers Guide. To view your current rules, use DescribeRules. To update a rule, use ModifyRule. To set the priorities of your rules, use SetRulePriorities. To delete a rule, use DeleteRule.
    */
  def createRule(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRule(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createTargetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a target group. To register targets with the target group, use RegisterTargets. To update the health check settings for the target group, use ModifyTargetGroup. To monitor the health of targets in the target group, use DescribeTargetHealth. To route traffic to the targets in a target group, specify the target group in an action using CreateListener or CreateRule. To delete a target group, use DeleteTargetGroup. This operation is idempotent, which means that it completes at most one time. If you attempt to create multiple target groups with the same settings, each call succeeds. For more information, see Target Groups for Your Application Load Balancers in the Application Load Balancers Guide or Target Groups for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def createTargetGroup(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTargetGroup(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.CreateTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
    */
  def deleteListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified listener. Alternatively, your listener is deleted when you delete the load balancer to which it is attached, using DeleteLoadBalancer.
    */
  def deleteListener(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteListener(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Application Load Balancer or Network Load Balancer and its attached listeners. You can't delete a load balancer if deletion protection is enabled. If the load balancer does not exist or has already been deleted, the call succeeds. Deleting a load balancer does not affect its registered targets. For example, your EC2 instances continue to run and are still registered to their target groups. If you no longer need these EC2 instances, you can stop or terminate them.
    */
  def deleteLoadBalancer(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLoadBalancer(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteLoadBalancerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified rule.
    */
  def deleteRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified rule.
    */
  def deleteRule(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRule(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
    */
  def deleteTargetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified target group. You can delete a target group if it is not referenced by any actions. Deleting a target group also deletes any associated health checks.
    */
  def deleteTargetGroup(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTargetGroup(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeleteTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters the specified targets from the specified target group. After the targets are deregistered, they no longer receive traffic from the load balancer.
    */
  def deregisterTargets(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterTargets(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DeregisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the current Elastic Load Balancing resource limits for your AWS account. For more information, see Limits for Your Application Load Balancers in the Application Load Balancer Guide or Limits for Your Network Load Balancers in the Network Load Balancers Guide.
    */
  def describeAccountLimits(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAccountLimits(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeAccountLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the certificates for the specified HTTPS listener.
    */
  def describeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the certificates for the specified HTTPS listener.
    */
  def describeListenerCertificates(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListenerCertificates(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
    */
  def describeListeners(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListeners(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified listeners or the listeners for the specified Application Load Balancer or Network Load Balancer. You must specify either a load balancer or one or more listeners.
    */
  def describeListeners(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeListeners(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeListenersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
    */
  def describeLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the attributes for the specified Application Load Balancer or Network Load Balancer. For more information, see Load Balancer Attributes in the Application Load Balancers Guide or Load Balancer Attributes in the Network Load Balancers Guide.
    */
  def describeLoadBalancerAttributes(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoadBalancerAttributes(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
    */
  def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified load balancers or all of your load balancers. To describe the listeners for a load balancer, use DescribeListeners. To describe the attributes for a load balancer, use DescribeLoadBalancerAttributes.
    */
  def describeLoadBalancers(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoadBalancers(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified rules or the rules for the specified listener. You must specify either a listener or one or more rules.
    */
  def describeRules(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRules(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeRulesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
    */
  def describeSSLPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSSLPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified policies or all policies used for SSL negotiation. For more information, see Security Policies in the Application Load Balancers Guide.
    */
  def describeSSLPolicies(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSSLPolicies(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeSSLPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the tags for the specified resources. You can describe the tags for one or more Application Load Balancers, Network Load Balancers, and target groups.
    */
  def describeTags(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
    */
  def describeTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetGroupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the attributes for the specified target group. For more information, see Target Group Attributes in the Application Load Balancers Guide or Target Group Attributes in the Network Load Balancers Guide.
    */
  def describeTargetGroupAttributes(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetGroupAttributes(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
    */
  def describeTargetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified target groups or all of your target groups. By default, all target groups are described. Alternatively, you can specify one of the following to filter the results: the ARN of the load balancer, the names of one or more target groups, or the ARNs of one or more target groups. To describe the targets for a target group, use DescribeTargetHealth. To describe the attributes of a target group, use DescribeTargetGroupAttributes.
    */
  def describeTargetGroups(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetGroups(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the health of the specified targets or all of your targets.
    */
  def describeTargetHealth(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTargetHealth(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and server certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and server certificate properties.
    */
  def modifyListener(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyListener(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified properties of the specified listener. Any properties that you do not specify retain their current values. However, changing the protocol from HTTPS to HTTP, or from TLS to TCP, removes the security policy and server certificate properties. If you change the protocol from HTTP to HTTPS, or from TCP to TLS, you must add the security policy and server certificate properties.
    */
  def modifyListener(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyListener(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyListenerOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyLoadBalancerAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attributes of the specified Application Load Balancer or Network Load Balancer. If any of the specified attributes can't be modified as requested, the call fails. Any existing attributes that you do not modify retain their current values.
    */
  def modifyLoadBalancerAttributes(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyLoadBalancerAttributes(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyLoadBalancerAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
    */
  def modifyRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified rule. Any existing properties that you do not modify retain their current values. To modify the actions for the default rule, use ModifyListener.
    */
  def modifyRule(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyRule(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyRuleOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
    */
  def modifyTargetGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTargetGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the health checks used when evaluating the health state of the targets in the specified target group. To monitor the health of the targets, use DescribeTargetHealth.
    */
  def modifyTargetGroup(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTargetGroup(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTargetGroupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the specified attributes of the specified target group.
    */
  def modifyTargetGroupAttributes(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def modifyTargetGroupAttributes(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.ModifyTargetGroupAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
    */
  def registerTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers the specified targets with the specified target group. If the target is an EC2 instance, it must be in the running state when you register it. By default, the load balancer routes requests to registered targets using the protocol and port for the target group. Alternatively, you can override the port for a target when you register it. You can register each EC2 instance or IP address with the same target group multiple times using different ports. With a Network Load Balancer, you cannot register instances by instance ID if they have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1, G2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by IP address. To remove a target from a target group, use DeregisterTargets.
    */
  def registerTargets(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerTargets(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RegisterTargetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified certificate from the specified HTTPS listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
    */
  def removeListenerCertificates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeListenerCertificates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified certificate from the specified HTTPS listener. You can't remove the default certificate for a listener. To replace the default certificate, call ModifyListener. To list the certificates for your listener, use DescribeListenerCertificates.
    */
  def removeListenerCertificates(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeListenerCertificates(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveListenerCertificatesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
    */
  def removeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified Elastic Load Balancing resource. To list the current tags for your resources, use DescribeTags.
    */
  def removeTags(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def removeTags(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.RemoveTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
    */
  def setIpAddressType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIpAddressType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the type of IP addresses used by the subnets of the specified Application Load Balancer or Network Load Balancer. Network Load Balancers must use ipv4.
    */
  def setIpAddressType(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIpAddressType(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetIpAddressTypeOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setRulePriorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the priorities of the specified rules. You can reorder the rules as long as there are no priority conflicts in the new order. Any existing rules that you do not specify retain their current priority.
    */
  def setRulePriorities(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setRulePriorities(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetRulePrioritiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
    */
  def setSecurityGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setSecurityGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified security groups with the specified Application Load Balancer. The specified security groups override the previously associated security groups. You can't specify a security group for a Network Load Balancer.
    */
  def setSecurityGroups(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setSecurityGroups(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSecurityGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
    */
  def setSubnets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setSubnets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the Availability Zone for the specified public subnets for the specified Application Load Balancer. The specified subnets replace the previously enabled subnets. You can't change the subnets for a Network Load Balancer.
    */
  def setSubnets(params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setSubnets(
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.SetSubnetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancerAvailable state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerAvailable,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancerExists state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancerExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancerExists,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the loadBalancersDeleted state by periodically calling the underlying ELBv2.describeLoadBalancersoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_loadBalancersDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.loadBalancersDeleted,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeLoadBalancersOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the targetDeregistered state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_targetDeregistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetDeregistered,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(state: awsDashSdkLib.awsDashSdkLibStrings.targetInService): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the targetInService state by periodically calling the underlying ELBv2.describeTargetHealthoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_targetInService(
    state: awsDashSdkLib.awsDashSdkLibStrings.targetInService,
    params: awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsElbv2Mod.ELBv2Ns.DescribeTargetHealthOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

