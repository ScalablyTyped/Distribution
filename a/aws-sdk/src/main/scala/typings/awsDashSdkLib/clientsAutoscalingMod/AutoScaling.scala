package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScaling
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AutoScaling: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachInstances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInstances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 Instances to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachInstances(params: AttachInstancesQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachInstances(
    params: AttachInstancesQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more target groups to the specified Auto Scaling group.  To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more target groups to the specified Auto Scaling group.  To describe the target groups for an Auto Scaling group, use DescribeLoadBalancerTargetGroups. To detach the target group from the Auto Scaling group, use DetachLoadBalancerTargetGroups. With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancerTargetGroups(
    params: AttachLoadBalancerTargetGroupsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer or a Network Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attaching a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attaches one or more Classic Load Balancers to the specified Auto Scaling group. To attach an Application Load Balancer or a Network Load Balancer instead, see AttachLoadBalancerTargetGroups. To describe the load balancers for an Auto Scaling group, use DescribeLoadBalancers. To detach the load balancer from the Auto Scaling group, use DetachLoadBalancers. For more information, see Attaching a Load Balancer to Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancers(params: AttachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def attachLoadBalancers(
    params: AttachLoadBalancersType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AttachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AttachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more scheduled actions for the specified Auto Scaling group.
    */
  def batchDeleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteScheduledActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more scheduled actions for the specified Auto Scaling group.
    */
  def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteScheduledAction(
    params: BatchDeleteScheduledActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteScheduledActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteScheduledActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
    */
  def batchPutScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutScheduledUpdateGroupAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutScheduledUpdateGroupActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
    */
  def batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutScheduledUpdateGroupAction(
    params: BatchPutScheduledUpdateGroupActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutScheduledUpdateGroupActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutScheduledUpdateGroupActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide.
    */
  def completeLifecycleAction(): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def completeLifecycleAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CompleteLifecycleActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide.
    */
  def completeLifecycleAction(params: CompleteLifecycleActionType): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def completeLifecycleAction(
    params: CompleteLifecycleActionType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CompleteLifecycleActionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CompleteLifecycleActionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
    */
  def createAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Auto Scaling group with the specified name and attributes. If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
    */
  def createAutoScalingGroup(params: CreateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAutoScalingGroup(
    params: CreateAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
    */
  def createLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLaunchConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this limit, see DescribeAccountLimits. For information about updating this limit, see Amazon EC2 Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch Configurations in the Amazon EC2 Auto Scaling User Guide.
    */
  def createLaunchConfiguration(params: CreateLaunchConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLaunchConfiguration(
    params: CreateLaunchConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def createOrUpdateTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrUpdateTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def createOrUpdateTags(params: CreateOrUpdateTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createOrUpdateTags(
    params: CreateOrUpdateTagsType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
    */
  def deleteAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call DetachInstances with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call UpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto Scaling group to zero.
    */
  def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAutoScalingGroup(
    params: DeleteAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
    */
  def deleteLaunchConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLaunchConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
    */
  def deleteLaunchConfiguration(params: LaunchConfigurationNameType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLaunchConfiguration(
    params: LaunchConfigurationNameType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
    */
  def deleteLifecycleHook(): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLifecycleHook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
    */
  def deleteLifecycleHook(params: DeleteLifecycleHookType): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLifecycleHook(
    params: DeleteLifecycleHookType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified notification.
    */
  def deleteNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified notification.
    */
  def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNotificationConfiguration(
    params: DeleteNotificationConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
    */
  def deletePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action.
    */
  def deletePolicy(params: DeletePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePolicy(
    params: DeletePolicyType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified scheduled action.
    */
  def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAction(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified scheduled action.
    */
  def deleteScheduledAction(params: DeleteScheduledActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAction(
    params: DeleteScheduledActionType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified tags.
    */
  def deleteTags(params: DeleteTagsType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTags(
    params: DeleteTagsType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the current Amazon EC2 Auto Scaling resource limits for your AWS account. For information about requesting an increase in these limits, see Amazon EC2 Auto Scaling Limits in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAccountLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAccountLimitsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the policy adjustment types for use with PutScalingPolicy.
    */
  def describeAdjustmentTypes(): awsDashSdkLib.libRequestMod.Request[DescribeAdjustmentTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAdjustmentTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAdjustmentTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAdjustmentTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more Auto Scaling groups.
    */
  def describeAutoScalingGroups(): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutoScalingGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AutoScalingGroupsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more Auto Scaling groups.
    */
  def describeAutoScalingGroups(params: AutoScalingGroupNamesType): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutoScalingGroups(
    params: AutoScalingGroupNamesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AutoScalingGroupsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AutoScalingGroupsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more Auto Scaling instances.
    */
  def describeAutoScalingInstances(): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutoScalingInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AutoScalingInstancesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more Auto Scaling instances.
    */
  def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutoScalingInstances(
    params: DescribeAutoScalingInstancesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AutoScalingInstancesType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AutoScalingInstancesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
    */
  def describeAutoScalingNotificationTypes(): awsDashSdkLib.libRequestMod.Request[DescribeAutoScalingNotificationTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeAutoScalingNotificationTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeAutoScalingNotificationTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeAutoScalingNotificationTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more launch configurations.
    */
  def describeLaunchConfigurations(): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLaunchConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LaunchConfigurationsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more launch configurations.
    */
  def describeLaunchConfigurations(params: LaunchConfigurationNamesType): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLaunchConfigurations(
    params: LaunchConfigurationNamesType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LaunchConfigurationsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LaunchConfigurationsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  def describeLifecycleHookTypes(): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHookTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLifecycleHookTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLifecycleHookTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHookTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the lifecycle hooks for the specified Auto Scaling group.
    */
  def describeLifecycleHooks(): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLifecycleHooks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLifecycleHooksAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the lifecycle hooks for the specified Auto Scaling group.
    */
  def describeLifecycleHooks(params: DescribeLifecycleHooksType): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLifecycleHooks(
    params: DescribeLifecycleHooksType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLifecycleHooksAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLifecycleHooksAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the target groups for the specified Auto Scaling group.
    */
  def describeLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerTargetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the target groups for the specified Auto Scaling group.
    */
  def describeLoadBalancerTargetGroups(params: DescribeLoadBalancerTargetGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancerTargetGroups(
    params: DescribeLoadBalancerTargetGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancerTargetGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancerTargetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use DescribeLoadBalancerTargetGroups instead.
    */
  def describeLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use DescribeLoadBalancerTargetGroups instead.
    */
  def describeLoadBalancers(params: DescribeLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoadBalancers(
    params: DescribeLoadBalancersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoadBalancersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoadBalancersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling EnableMetricsCollection.
    */
  def describeMetricCollectionTypes(): awsDashSdkLib.libRequestMod.Request[DescribeMetricCollectionTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeMetricCollectionTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeMetricCollectionTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeMetricCollectionTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the notification actions associated with the specified Auto Scaling group.
    */
  def describeNotificationConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationConfigurationsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the notification actions associated with the specified Auto Scaling group.
    */
  def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeNotificationConfigurations(
    params: DescribeNotificationConfigurationsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeNotificationConfigurationsAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeNotificationConfigurationsAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the policies for the specified Auto Scaling group.
    */
  def describePolicies(): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePolicies(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PoliciesType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the policies for the specified Auto Scaling group.
    */
  def describePolicies(params: DescribePoliciesType): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePolicies(
    params: DescribePoliciesType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PoliciesType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PoliciesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more scaling activities for the specified Auto Scaling group.
    */
  def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingActivities(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivitiesType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes one or more scaling activities for the specified Auto Scaling group.
    */
  def describeScalingActivities(params: DescribeScalingActivitiesType): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingActivities(
    params: DescribeScalingActivitiesType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivitiesType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivitiesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the scaling process types for use with ResumeProcesses and SuspendProcesses.
    */
  def describeScalingProcessTypes(): awsDashSdkLib.libRequestMod.Request[ProcessesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingProcessTypes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ProcessesType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ProcessesType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
    */
  def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScheduledActionsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have already run, use DescribeScalingActivities.
    */
  def describeScheduledActions(params: DescribeScheduledActionsType): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledActions(
    params: DescribeScheduledActionsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScheduledActionsType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScheduledActionsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagsType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned.
    */
  def describeTags(params: DescribeTagsType): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTags(
    params: DescribeTagsType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagsType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagsType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the termination policies supported by Amazon EC2 Auto Scaling. For more information, see Controlling Which Auto Scaling Instances Terminate During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeTerminationPolicyTypes(): awsDashSdkLib.libRequestMod.Request[DescribeTerminationPolicyTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeTerminationPolicyTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeTerminationPolicyTypesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeTerminationPolicyTypesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def detachInstances(): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachInstancesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def detachInstances(params: DetachInstancesQuery): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachInstances(
    params: DetachInstancesQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachInstancesAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachInstancesAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches one or more target groups from the specified Auto Scaling group.
    */
  def detachLoadBalancerTargetGroups(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancerTargetGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches one or more target groups from the specified Auto Scaling group.
    */
  def detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancerTargetGroups(
    params: DetachLoadBalancerTargetGroupsType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancerTargetGroupsResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancerTargetGroupsResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
    */
  def detachLoadBalancers(): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use DetachLoadBalancerTargetGroups instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using DescribeLoadBalancers. The instances remain running.
    */
  def detachLoadBalancers(params: DetachLoadBalancersType): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachLoadBalancers(
    params: DetachLoadBalancersType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetachLoadBalancersResultType, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetachLoadBalancersResultType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables group metrics for the specified Auto Scaling group.
    */
  def disableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableMetricsCollection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables group metrics for the specified Auto Scaling group.
    */
  def disableMetricsCollection(params: DisableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disableMetricsCollection(
    params: DisableMetricsCollectionQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def enableMetricsCollection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableMetricsCollection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring Your Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def enableMetricsCollection(params: EnableMetricsCollectionQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enableMetricsCollection(
    params: EnableMetricsCollectionQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def enterStandby(): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enterStandby(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnterStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified instances into the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def enterStandby(params: EnterStandbyQuery): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def enterStandby(
    params: EnterStandbyQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ EnterStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[EnterStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Executes the specified policy.
    */
  def executePolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executePolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Executes the specified policy.
    */
  def executePolicy(params: ExecutePolicyType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executePolicy(
    params: ExecutePolicyType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def exitStandby(): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exitStandby(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExitStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified instances out of the standby state. For more information, see Temporarily Removing Instances from Your Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  def exitStandby(params: ExitStandbyQuery): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def exitStandby(
    params: ExitStandbyQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExitStandbyAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExitStandbyAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before it is put into service) or as the instance terminates (before it is fully terminated). This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using using RecordLifecycleActionHeartbeat.   If you finish before the timeout period ends, complete the lifecycle action using CompleteLifecycleAction.   For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. You can view the lifecycle hooks for an Auto Scaling group using DescribeLifecycleHooks. If you are no longer using a lifecycle hook, you can delete it using DeleteLifecycleHook.
    */
  def putLifecycleHook(): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecycleHook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before it is put into service) or as the instance terminates (before it is fully terminated). This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using using RecordLifecycleActionHeartbeat.   If you finish before the timeout period ends, complete the lifecycle action using CompleteLifecycleAction.   For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. You can view the lifecycle hooks for an Auto Scaling group using DescribeLifecycleHooks. If you are no longer using a lifecycle hook, you can delete it using DeleteLifecycleHook.
    */
  def putLifecycleHook(params: PutLifecycleHookType): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLifecycleHook(
    params: PutLifecycleHookType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutLifecycleHookAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutLifecycleHookAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting Amazon SNS Notifications When Your Auto Scaling Group Scales in the Amazon EC2 Auto Scaling User Guide.
    */
  def putNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putNotificationConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting Amazon SNS Notifications When Your Auto Scaling Group Scales in the Amazon EC2 Auto Scaling User Guide.
    */
  def putNotificationConfiguration(params: PutNotificationConfigurationType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putNotificationConfiguration(
    params: PutNotificationConfigurationType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request.
    */
  def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScalingPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PolicyARNType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not changed in this update request.
    */
  def putScalingPolicy(params: PutScalingPolicyType): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScalingPolicy(
    params: PutScalingPolicyType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PolicyARNType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[PolicyARNType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScheduledUpdateGroupAction(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScheduledUpdateGroupAction(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScheduledUpdateGroupAction(
    params: PutScheduledUpdateGroupActionType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
    */
  def recordLifecycleActionHeartbeat(): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def recordLifecycleActionHeartbeat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RecordLifecycleActionHeartbeatAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using PutLifecycleHook. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling Lifecycle in the Amazon EC2 Auto Scaling User Guide.
    */
  def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def recordLifecycleActionHeartbeat(
    params: RecordLifecycleActionHeartbeatType,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RecordLifecycleActionHeartbeatAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RecordLifecycleActionHeartbeatAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def resumeProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resumeProcesses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def resumeProcesses(params: ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resumeProcesses(
    params: ScalingProcessQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
    */
  def setDesiredCapacity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDesiredCapacity(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the size of the specified Auto Scaling group. For more information about desired capacity, see What Is Amazon EC2 Auto Scaling? in the Amazon EC2 Auto Scaling User Guide.
    */
  def setDesiredCapacity(params: SetDesiredCapacityType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setDesiredCapacity(
    params: SetDesiredCapacityType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the health status of the specified instance. For more information, see Health Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceHealth(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setInstanceHealth(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the health status of the specified instance. For more information, see Health Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceHealth(params: SetInstanceHealthQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setInstanceHealth(
    params: SetInstanceHealthQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the instance protection settings of the specified instances. For more information about preventing instances that are part of an Auto Scaling group from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceProtection(): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setInstanceProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetInstanceProtectionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the instance protection settings of the specified instances. For more information about preventing instances that are part of an Auto Scaling group from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceProtection(params: SetInstanceProtectionQuery): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setInstanceProtection(
    params: SetInstanceProtectionQuery,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetInstanceProtectionAnswer, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetInstanceProtectionAnswer, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def suspendProcesses(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def suspendProcesses(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. To resume processes that have been suspended, use ResumeProcesses. For more information, see Suspending and Resuming Scaling Processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def suspendProcesses(params: ScalingProcessQuery): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def suspendProcesses(
    params: ScalingProcessQuery,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
    */
  def terminateInstanceInAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateInstanceInAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Terminates the specified instance and optionally adjusts the desired group size. This call simply makes a termination request. The instance is not terminated immediately.
    */
  def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def terminateInstanceInAutoScalingGroup(
    params: TerminateInstanceInAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ActivityType, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ActivityType, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
    */
  def updateAutoScalingGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAutoScalingGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the configuration for the specified Auto Scaling group. The new settings take effect on any scaling activities after this call returns. Scaling activities that are currently in progress aren't affected. To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. Note the following:   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MinSize.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, we implicitly call SetDesiredCapacity to set the size of the group to the new value of MaxSize.   All other optional parameters are left unchanged if not specified.  
    */
  def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAutoScalingGroup(
    params: UpdateAutoScalingGroupType,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

