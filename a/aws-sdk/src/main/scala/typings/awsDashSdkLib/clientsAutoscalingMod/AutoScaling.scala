package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScaling
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AutoScaling: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ClientConfiguration = js.native
  /**
     * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachInstances(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachInstancesQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachInstances(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachInstancesQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancerTargetGroups(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancerTargetGroups(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancers(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attach a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def attachLoadBalancers(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AttachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     */
  def batchDeleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     */
  def batchDeleteScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     */
  def batchDeleteScheduledAction(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     */
  def batchDeleteScheduledAction(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchDeleteScheduledActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged.
     */
  def batchPutScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged.
     */
  def batchPutScheduledUpdateGroupAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged.
     */
  def batchPutScheduledUpdateGroupAction(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged.
     */
  def batchPutScheduledUpdateGroupAction(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.BatchPutScheduledUpdateGroupActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def completeLifecycleAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def completeLifecycleAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def completeLifecycleAction(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def completeLifecycleAction(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CompleteLifecycleActionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
     */
  def createAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
     */
  def createAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
     */
  def createAutoScalingGroup(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling Groups in the Amazon EC2 Auto Scaling User Guide.
     */
  def createAutoScalingGroup(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
     */
  def createLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
     */
  def createLaunchConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
     */
  def createLaunchConfiguration(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateLaunchConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
     */
  def createLaunchConfiguration(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateLaunchConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def createOrUpdateTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def createOrUpdateTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def createOrUpdateTags(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateOrUpdateTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def createOrUpdateTags(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.CreateOrUpdateTagsType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity so that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
     */
  def deleteAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity so that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
     */
  def deleteAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity so that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
     */
  def deleteAutoScalingGroup(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity so that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
     */
  def deleteAutoScalingGroup(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
     */
  def deleteLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
     */
  def deleteLaunchConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
     */
  def deleteLaunchConfiguration(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationNameType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
     */
  def deleteLaunchConfiguration(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationNameType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
     */
  def deleteLifecycleHook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
     */
  def deleteLifecycleHook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
     */
  def deleteLifecycleHook(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
     */
  def deleteLifecycleHook(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified notification.
     */
  def deleteNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified notification.
     */
  def deleteNotificationConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified notification.
     */
  def deleteNotificationConfiguration(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified notification.
     */
  def deleteNotificationConfiguration(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteNotificationConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
     */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
     */
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
     */
  def deletePolicy(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeletePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified Auto Scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
     */
  def deletePolicy(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeletePolicyType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified scheduled action.
     */
  def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified scheduled action.
     */
  def deleteScheduledAction(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified scheduled action.
     */
  def deleteScheduledAction(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified scheduled action.
     */
  def deleteScheduledAction(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteScheduledActionType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified tags.
     */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified tags.
     */
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified tags.
     */
  def deleteTags(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified tags.
     */
  def deleteTags(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DeleteTagsType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes the current Auto Scaling resource limits for your AWS account. For information about requesting an increase in these limits, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
     */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAccountLimitsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the current Auto Scaling resource limits for your AWS account. For information about requesting an increase in these limits, see Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
     */
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAccountLimitsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAccountLimitsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policy adjustment types for use with PutScalingPolicy.
     */
  def describeAdjustmentTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAdjustmentTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policy adjustment types for use with PutScalingPolicy.
     */
  def describeAdjustmentTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAdjustmentTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAdjustmentTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling groups.
     */
  def describeAutoScalingGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling groups.
     */
  def describeAutoScalingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling groups.
     */
  def describeAutoScalingGroups(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupNamesType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling groups.
     */
  def describeAutoScalingGroups(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupNamesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingGroupsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling instances.
     */
  def describeAutoScalingInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling instances.
     */
  def describeAutoScalingInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling instances.
     */
  def describeAutoScalingInstances(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAutoScalingInstancesType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more Auto Scaling instances.
     */
  def describeAutoScalingInstances(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAutoScalingInstancesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.AutoScalingInstancesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     */
  def describeAutoScalingNotificationTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAutoScalingNotificationTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     */
  def describeAutoScalingNotificationTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAutoScalingNotificationTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeAutoScalingNotificationTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more launch configurations.
     */
  def describeLaunchConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more launch configurations.
     */
  def describeLaunchConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more launch configurations.
     */
  def describeLaunchConfigurations(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationNamesType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more launch configurations.
     */
  def describeLaunchConfigurations(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationNamesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.LaunchConfigurationsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
     */
  def describeLifecycleHookTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHookTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
     */
  def describeLifecycleHookTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHookTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHookTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     */
  def describeLifecycleHooks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     */
  def describeLifecycleHooks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     */
  def describeLifecycleHooks(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     */
  def describeLifecycleHooks(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLifecycleHooksAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the target groups for the specified Auto Scaling group.
     */
  def describeLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the target groups for the specified Auto Scaling group.
     */
  def describeLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the target groups for the specified Auto Scaling group.
     */
  def describeLoadBalancerTargetGroups(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the target groups for the specified Auto Scaling group.
     */
  def describeLoadBalancerTargetGroups(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancerTargetGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the load balancers for the specified Auto Scaling group. Note that this operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
     */
  def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the load balancers for the specified Auto Scaling group. Note that this operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
     */
  def describeLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the load balancers for the specified Auto Scaling group. Note that this operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
     */
  def describeLoadBalancers(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the load balancers for the specified Auto Scaling group. Note that this operation describes only Classic Load Balancers. If you have Application Load Balancers, use DescribeLoadBalancerTargetGroups instead.
     */
  def describeLoadBalancers(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeLoadBalancersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. Note that the GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling EnableMetricsCollection.
     */
  def describeMetricCollectionTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeMetricCollectionTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. Note that the GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling EnableMetricsCollection.
     */
  def describeMetricCollectionTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeMetricCollectionTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeMetricCollectionTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification actions associated with the specified Auto Scaling group.
     */
  def describeNotificationConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification actions associated with the specified Auto Scaling group.
     */
  def describeNotificationConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification actions associated with the specified Auto Scaling group.
     */
  def describeNotificationConfigurations(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the notification actions associated with the specified Auto Scaling group.
     */
  def describeNotificationConfigurations(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeNotificationConfigurationsAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policies for the specified Auto Scaling group.
     */
  def describePolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policies for the specified Auto Scaling group.
     */
  def describePolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policies for the specified Auto Scaling group.
     */
  def describePolicies(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribePoliciesType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the policies for the specified Auto Scaling group.
     */
  def describePolicies(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribePoliciesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PoliciesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more scaling activities for the specified Auto Scaling group.
     */
  def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more scaling activities for the specified Auto Scaling group.
     */
  def describeScalingActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more scaling activities for the specified Auto Scaling group.
     */
  def describeScalingActivities(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeScalingActivitiesType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes one or more scaling activities for the specified Auto Scaling group.
     */
  def describeScalingActivities(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeScalingActivitiesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivitiesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.
     */
  def describeScalingProcessTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ProcessesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.
     */
  def describeScalingProcessTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ProcessesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ProcessesType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
     */
  def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
     */
  def describeScheduledActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
     */
  def describeScheduledActions(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeScheduledActionsType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
     */
  def describeScheduledActions(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeScheduledActionsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScheduledActionsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
     */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
     */
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
     */
  def describeTags(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeTagsType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
     */
  def describeTags(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeTagsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TagsType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     */
  def describeTerminationPolicyTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeTerminationPolicyTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     */
  def describeTerminationPolicyTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeTerminationPolicyTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DescribeTerminationPolicyTypesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def detachInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def detachInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def detachInstances(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesQuery): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def detachInstances(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachInstancesAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more target groups from the specified Auto Scaling group.
     */
  def detachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more target groups from the specified Auto Scaling group.
     */
  def detachLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more target groups from the specified Auto Scaling group.
     */
  def detachLoadBalancerTargetGroups(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more target groups from the specified Auto Scaling group.
     */
  def detachLoadBalancerTargetGroups(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancerTargetGroupsResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. Note that this operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. Note that the instances remain running.
     */
  def detachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. Note that this operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. Note that the instances remain running.
     */
  def detachLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. Note that this operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. Note that the instances remain running.
     */
  def detachLoadBalancers(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. Note that this operation detaches only Classic Load Balancers. If you have Application Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. Note that the instances remain running.
     */
  def detachLoadBalancers(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DetachLoadBalancersResultType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables group metrics for the specified Auto Scaling group.
     */
  def disableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables group metrics for the specified Auto Scaling group.
     */
  def disableMetricsCollection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables group metrics for the specified Auto Scaling group.
     */
  def disableMetricsCollection(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DisableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables group metrics for the specified Auto Scaling group.
     */
  def disableMetricsCollection(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.DisableMetricsCollectionQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def enableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def enableMetricsCollection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def enableMetricsCollection(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
     */
  def enableMetricsCollection(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnableMetricsCollectionQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def enterStandby(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def enterStandby(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def enterStandby(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyQuery): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def enterStandby(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.EnterStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes the specified policy.
     */
  def executePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Executes the specified policy.
     */
  def executePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Executes the specified policy.
     */
  def executePolicy(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExecutePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Executes the specified policy.
     */
  def executePolicy(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExecutePolicyType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def exitStandby(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def exitStandby(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def exitStandby(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyQuery): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
     */
  def exitStandby(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ExitStandbyAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group. A lifecycle hook tells Amazon EC2 Auto Scaling that you want to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putLifecycleHook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group. A lifecycle hook tells Amazon EC2 Auto Scaling that you want to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putLifecycleHook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group. A lifecycle hook tells Amazon EC2 Auto Scaling that you want to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putLifecycleHook(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group. A lifecycle hook tells Amazon EC2 Auto Scaling that you want to perform an action on an instance that is not actively in service; for example, either when the instance launches or before the instance terminates. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.   If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putLifecycleHook(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutLifecycleHookAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
     */
  def putNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
     */
  def putNotificationConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
     */
  def putNotificationConfiguration(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information see Getting SNS Notifications When Your Auto Scaling Group Scales in the Auto Scaling User Guide.
     */
  def putNotificationConfiguration(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutNotificationConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putScalingPolicy(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutScalingPolicyType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request. If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For information about updating this limit, see AWS Service Limits in the Amazon Web Services General Reference.
     */
  def putScalingPolicy(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutScalingPolicyType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PolicyARNType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
     */
  def putScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
     */
  def putScheduledUpdateGroupAction(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
     */
  def putScheduledUpdateGroupAction(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling action, if you leave a parameter unspecified, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
     */
  def putScheduledUpdateGroupAction(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.PutScheduledUpdateGroupActionType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def recordLifecycleActionHeartbeat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def recordLifecycleActionHeartbeat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def recordLifecycleActionHeartbeat(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
     */
  def recordLifecycleActionHeartbeat(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.RecordLifecycleActionHeartbeatAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def resumeProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def resumeProcesses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def resumeProcesses(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def resumeProcesses(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScalingProcessQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
     */
  def setDesiredCapacity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
     */
  def setDesiredCapacity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
     */
  def setDesiredCapacity(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetDesiredCapacityType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
     */
  def setDesiredCapacity(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetDesiredCapacityType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceHealth(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceHealth(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceHealth(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceHealthQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the health status of the specified instance. For more information, see Health Checks in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceHealth(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceHealthQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceProtection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceProtection(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionQuery): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the instance protection settings of the specified instances. For more information, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
     */
  def setInstanceProtection(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.SetInstanceProtectionAnswer, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. Note that if you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def suspendProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. Note that if you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def suspendProcesses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. Note that if you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def suspendProcesses(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. Note that if you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
     */
  def suspendProcesses(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ScalingProcessQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
     */
  def terminateInstanceInAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
     */
  def terminateInstanceInAutoScalingGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
     */
  def terminateInstanceInAutoScalingGroup(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TerminateInstanceInAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
     */
  def terminateInstanceInAutoScalingGroup(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.TerminateInstanceInAutoScalingGroupType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.ActivityType, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you will get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
     */
  def updateAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you will get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
     */
  def updateAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you will get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
     */
  def updateAutoScalingGroup(params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.UpdateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you will get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
     */
  def updateAutoScalingGroup(
    params: awsDashSdkLib.clientsAutoscalingMod.AutoScalingNs.UpdateAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

