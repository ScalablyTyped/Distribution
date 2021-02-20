package typings.awsSdk.autoscalingMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScaling extends Service {
  
  /**
    * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 instances to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachInstances(): Request[js.Object, AWSError] = js.native
  def attachInstances(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches one or more EC2 instances to the specified Auto Scaling group. When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of instances being attached. If the number of instances being attached plus the desired capacity of the group exceeds the maximum size of the group, the operation fails. If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also registered with the target groups. For more information, see Attach EC2 instances to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachInstances(params: AttachInstancesQuery): Request[js.Object, AWSError] = js.native
  def attachInstances(
    params: AttachInstancesQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, call the DescribeLoadBalancerTargetGroups API. To detach the target group from the Auto Scaling group, call the DetachLoadBalancerTargetGroups API. With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a load balancer to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancerTargetGroups(): Request[AttachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  def attachLoadBalancerTargetGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancerTargetGroupsResultType, Unit]
  ): Request[AttachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  /**
    * Attaches one or more target groups to the specified Auto Scaling group. To describe the target groups for an Auto Scaling group, call the DescribeLoadBalancerTargetGroups API. To detach the target group from the Auto Scaling group, call the DetachLoadBalancerTargetGroups API. With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see Attaching a load balancer to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancerTargetGroups(params: AttachLoadBalancerTargetGroupsType): Request[AttachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  def attachLoadBalancerTargetGroups(
    params: AttachLoadBalancerTargetGroupsType,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancerTargetGroupsResultType, Unit]
  ): Request[AttachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  
  /**
    *  To attach an Application Load Balancer or a Network Load Balancer, use the AttachLoadBalancerTargetGroups API operation instead.  Attaches one or more Classic Load Balancers to the specified Auto Scaling group. Amazon EC2 Auto Scaling registers the running instances with these Classic Load Balancers. To describe the load balancers for an Auto Scaling group, call the DescribeLoadBalancers API. To detach the load balancer from the Auto Scaling group, call the DetachLoadBalancers API. For more information, see Attaching a load balancer to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancers(): Request[AttachLoadBalancersResultType, AWSError] = js.native
  def attachLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancersResultType, Unit]): Request[AttachLoadBalancersResultType, AWSError] = js.native
  /**
    *  To attach an Application Load Balancer or a Network Load Balancer, use the AttachLoadBalancerTargetGroups API operation instead.  Attaches one or more Classic Load Balancers to the specified Auto Scaling group. Amazon EC2 Auto Scaling registers the running instances with these Classic Load Balancers. To describe the load balancers for an Auto Scaling group, call the DescribeLoadBalancers API. To detach the load balancer from the Auto Scaling group, call the DetachLoadBalancers API. For more information, see Attaching a load balancer to your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def attachLoadBalancers(params: AttachLoadBalancersType): Request[AttachLoadBalancersResultType, AWSError] = js.native
  def attachLoadBalancers(
    params: AttachLoadBalancersType,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachLoadBalancersResultType, Unit]
  ): Request[AttachLoadBalancersResultType, AWSError] = js.native
  
  /**
    * Deletes one or more scheduled actions for the specified Auto Scaling group.
    */
  def batchDeleteScheduledAction(): Request[BatchDeleteScheduledActionAnswer, AWSError] = js.native
  def batchDeleteScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteScheduledActionAnswer, Unit]): Request[BatchDeleteScheduledActionAnswer, AWSError] = js.native
  /**
    * Deletes one or more scheduled actions for the specified Auto Scaling group.
    */
  def batchDeleteScheduledAction(params: BatchDeleteScheduledActionType): Request[BatchDeleteScheduledActionAnswer, AWSError] = js.native
  def batchDeleteScheduledAction(
    params: BatchDeleteScheduledActionType,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteScheduledActionAnswer, Unit]
  ): Request[BatchDeleteScheduledActionAnswer, AWSError] = js.native
  
  /**
    * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
    */
  def batchPutScheduledUpdateGroupAction(): Request[BatchPutScheduledUpdateGroupActionAnswer, AWSError] = js.native
  def batchPutScheduledUpdateGroupAction(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutScheduledUpdateGroupActionAnswer, Unit]
  ): Request[BatchPutScheduledUpdateGroupActionAnswer, AWSError] = js.native
  /**
    * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
    */
  def batchPutScheduledUpdateGroupAction(params: BatchPutScheduledUpdateGroupActionType): Request[BatchPutScheduledUpdateGroupActionAnswer, AWSError] = js.native
  def batchPutScheduledUpdateGroupAction(
    params: BatchPutScheduledUpdateGroupActionType,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutScheduledUpdateGroupActionAnswer, Unit]
  ): Request[BatchPutScheduledUpdateGroupActionAnswer, AWSError] = js.native
  
  /**
    * Cancels an instance refresh operation in progress. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.  For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def cancelInstanceRefresh(): Request[CancelInstanceRefreshAnswer, AWSError] = js.native
  def cancelInstanceRefresh(callback: js.Function2[/* err */ AWSError, /* data */ CancelInstanceRefreshAnswer, Unit]): Request[CancelInstanceRefreshAnswer, AWSError] = js.native
  /**
    * Cancels an instance refresh operation in progress. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.  For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def cancelInstanceRefresh(params: CancelInstanceRefreshType): Request[CancelInstanceRefreshAnswer, AWSError] = js.native
  def cancelInstanceRefresh(
    params: CancelInstanceRefreshType,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelInstanceRefreshAnswer, Unit]
  ): Request[CancelInstanceRefreshAnswer, AWSError] = js.native
  
  /**
    * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Amazon EC2 Auto Scaling lifecycle hooks in the Amazon EC2 Auto Scaling User Guide.
    */
  def completeLifecycleAction(): Request[CompleteLifecycleActionAnswer, AWSError] = js.native
  def completeLifecycleAction(callback: js.Function2[/* err */ AWSError, /* data */ CompleteLifecycleActionAnswer, Unit]): Request[CompleteLifecycleActionAnswer, AWSError] = js.native
  /**
    * Completes the lifecycle action for the specified token or instance with the specified result. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.   If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.    For more information, see Amazon EC2 Auto Scaling lifecycle hooks in the Amazon EC2 Auto Scaling User Guide.
    */
  def completeLifecycleAction(params: CompleteLifecycleActionType): Request[CompleteLifecycleActionAnswer, AWSError] = js.native
  def completeLifecycleAction(
    params: CompleteLifecycleActionType,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteLifecycleActionAnswer, Unit]
  ): Request[CompleteLifecycleActionAnswer, AWSError] = js.native
  
  @JSName("config")
  var config_AutoScaling: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an Auto Scaling group with the specified name and attributes.  If you exceed your maximum limit of Auto Scaling groups, the call fails. To query this limit, call the DescribeAccountLimits API. For information about updating this limit, see Amazon EC2 Auto Scaling service quotas in the Amazon EC2 Auto Scaling User Guide. For introductory exercises for creating an Auto Scaling group, see Getting started with Amazon EC2 Auto Scaling and Tutorial: Set up a scaled and load-balanced application in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling groups in the Amazon EC2 Auto Scaling User Guide. Every Auto Scaling group has three size parameters (DesiredCapacity, MaxSize, and MinSize). Usually, you set these sizes based on a specific number of instances. However, if you configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with the same units that you use for weighting instances.
    */
  def createAutoScalingGroup(): Request[js.Object, AWSError] = js.native
  def createAutoScalingGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an Auto Scaling group with the specified name and attributes.  If you exceed your maximum limit of Auto Scaling groups, the call fails. To query this limit, call the DescribeAccountLimits API. For information about updating this limit, see Amazon EC2 Auto Scaling service quotas in the Amazon EC2 Auto Scaling User Guide. For introductory exercises for creating an Auto Scaling group, see Getting started with Amazon EC2 Auto Scaling and Tutorial: Set up a scaled and load-balanced application in the Amazon EC2 Auto Scaling User Guide. For more information, see Auto Scaling groups in the Amazon EC2 Auto Scaling User Guide. Every Auto Scaling group has three size parameters (DesiredCapacity, MaxSize, and MinSize). Usually, you set these sizes based on a specific number of instances. However, if you configure a mixed instances policy that defines weights for the instance types, you must specify these sizes with the same units that you use for weighting instances.
    */
  def createAutoScalingGroup(params: CreateAutoScalingGroupType): Request[js.Object, AWSError] = js.native
  def createAutoScalingGroup(
    params: CreateAutoScalingGroupType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. To query this limit, call the DescribeAccountLimits API. For information about updating this limit, see Amazon EC2 Auto Scaling service quotas in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch configurations in the Amazon EC2 Auto Scaling User Guide.
    */
  def createLaunchConfiguration(): Request[js.Object, AWSError] = js.native
  def createLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a launch configuration. If you exceed your maximum limit of launch configurations, the call fails. To query this limit, call the DescribeAccountLimits API. For information about updating this limit, see Amazon EC2 Auto Scaling service quotas in the Amazon EC2 Auto Scaling User Guide. For more information, see Launch configurations in the Amazon EC2 Auto Scaling User Guide.
    */
  def createLaunchConfiguration(params: CreateLaunchConfigurationType): Request[js.Object, AWSError] = js.native
  def createLaunchConfiguration(
    params: CreateLaunchConfigurationType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def createOrUpdateTags(): Request[js.Object, AWSError] = js.native
  def createOrUpdateTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates tags for the specified Auto Scaling group. When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and you do not get an error message. For more information, see Tagging Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def createOrUpdateTags(params: CreateOrUpdateTagsType): Request[js.Object, AWSError] = js.native
  def createOrUpdateTags(
    params: CreateOrUpdateTagsType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call the DetachInstances API with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call the UpdateAutoScalingGroup API and set the minimum size and desired capacity of the Auto Scaling group to zero.
    */
  def deleteAutoScalingGroup(): Request[js.Object, AWSError] = js.native
  def deleteAutoScalingGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Auto Scaling group. If the group has instances or scaling activities in progress, you must specify the option to force the deletion in order for it to succeed. If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm that no longer has an associated action. To remove instances from the Auto Scaling group before deleting it, call the DetachInstances API with the list of instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not launch replacement instances. To terminate all instances before deleting the Auto Scaling group, call the UpdateAutoScalingGroup API and set the minimum size and desired capacity of the Auto Scaling group to zero.
    */
  def deleteAutoScalingGroup(params: DeleteAutoScalingGroupType): Request[js.Object, AWSError] = js.native
  def deleteAutoScalingGroup(
    params: DeleteAutoScalingGroupType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
    */
  def deleteLaunchConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified launch configuration. The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch configuration is no longer available for use.
    */
  def deleteLaunchConfiguration(params: LaunchConfigurationNameType): Request[js.Object, AWSError] = js.native
  def deleteLaunchConfiguration(
    params: LaunchConfigurationNameType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
    */
  def deleteLifecycleHook(): Request[DeleteLifecycleHookAnswer, AWSError] = js.native
  def deleteLifecycleHook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecycleHookAnswer, Unit]): Request[DeleteLifecycleHookAnswer, AWSError] = js.native
  /**
    * Deletes the specified lifecycle hook. If there are any outstanding lifecycle actions, they are completed first (ABANDON for launching instances, CONTINUE for terminating instances).
    */
  def deleteLifecycleHook(params: DeleteLifecycleHookType): Request[DeleteLifecycleHookAnswer, AWSError] = js.native
  def deleteLifecycleHook(
    params: DeleteLifecycleHookType,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecycleHookAnswer, Unit]
  ): Request[DeleteLifecycleHookAnswer, AWSError] = js.native
  
  /**
    * Deletes the specified notification.
    */
  def deleteNotificationConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified notification.
    */
  def deleteNotificationConfiguration(params: DeleteNotificationConfigurationType): Request[js.Object, AWSError] = js.native
  def deleteNotificationConfiguration(
    params: DeleteNotificationConfigurationType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified scaling policy. Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action. For more information, see Deleting a scaling policy in the Amazon EC2 Auto Scaling User Guide.
    */
  def deletePolicy(): Request[js.Object, AWSError] = js.native
  def deletePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified scaling policy. Deleting either a step scaling policy or a simple scaling policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an associated action. For more information, see Deleting a scaling policy in the Amazon EC2 Auto Scaling User Guide.
    */
  def deletePolicy(params: DeletePolicyType): Request[js.Object, AWSError] = js.native
  def deletePolicy(params: DeletePolicyType, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified scheduled action.
    */
  def deleteScheduledAction(): Request[js.Object, AWSError] = js.native
  def deleteScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified scheduled action.
    */
  def deleteScheduledAction(params: DeleteScheduledActionType): Request[js.Object, AWSError] = js.native
  def deleteScheduledAction(
    params: DeleteScheduledActionType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified tags.
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified tags.
    */
  def deleteTags(params: DeleteTagsType): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsType, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the current Amazon EC2 Auto Scaling resource quotas for your AWS account. For information about requesting an increase, see Amazon EC2 Auto Scaling service quotas in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeAccountLimits(): Request[DescribeAccountLimitsAnswer, AWSError] = js.native
  def describeAccountLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsAnswer, Unit]): Request[DescribeAccountLimitsAnswer, AWSError] = js.native
  
  /**
    * Describes the available adjustment types for Amazon EC2 Auto Scaling scaling policies. These settings apply to step scaling policies and simple scaling policies; they do not apply to target tracking scaling policies. The following adjustment types are supported:   ChangeInCapacity   ExactCapacity   PercentChangeInCapacity  
    */
  def describeAdjustmentTypes(): Request[DescribeAdjustmentTypesAnswer, AWSError] = js.native
  def describeAdjustmentTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAdjustmentTypesAnswer, Unit]): Request[DescribeAdjustmentTypesAnswer, AWSError] = js.native
  
  /**
    * Describes one or more Auto Scaling groups.
    */
  def describeAutoScalingGroups(): Request[AutoScalingGroupsType, AWSError] = js.native
  def describeAutoScalingGroups(callback: js.Function2[/* err */ AWSError, /* data */ AutoScalingGroupsType, Unit]): Request[AutoScalingGroupsType, AWSError] = js.native
  /**
    * Describes one or more Auto Scaling groups.
    */
  def describeAutoScalingGroups(params: AutoScalingGroupNamesType): Request[AutoScalingGroupsType, AWSError] = js.native
  def describeAutoScalingGroups(
    params: AutoScalingGroupNamesType,
    callback: js.Function2[/* err */ AWSError, /* data */ AutoScalingGroupsType, Unit]
  ): Request[AutoScalingGroupsType, AWSError] = js.native
  
  /**
    * Describes one or more Auto Scaling instances.
    */
  def describeAutoScalingInstances(): Request[AutoScalingInstancesType, AWSError] = js.native
  def describeAutoScalingInstances(callback: js.Function2[/* err */ AWSError, /* data */ AutoScalingInstancesType, Unit]): Request[AutoScalingInstancesType, AWSError] = js.native
  /**
    * Describes one or more Auto Scaling instances.
    */
  def describeAutoScalingInstances(params: DescribeAutoScalingInstancesType): Request[AutoScalingInstancesType, AWSError] = js.native
  def describeAutoScalingInstances(
    params: DescribeAutoScalingInstancesType,
    callback: js.Function2[/* err */ AWSError, /* data */ AutoScalingInstancesType, Unit]
  ): Request[AutoScalingInstancesType, AWSError] = js.native
  
  /**
    * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
    */
  def describeAutoScalingNotificationTypes(): Request[DescribeAutoScalingNotificationTypesAnswer, AWSError] = js.native
  def describeAutoScalingNotificationTypes(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoScalingNotificationTypesAnswer, Unit]
  ): Request[DescribeAutoScalingNotificationTypesAnswer, AWSError] = js.native
  
  /**
    * Describes one or more instance refreshes. You can determine the status of a request by looking at the Status parameter. The following are the possible statuses:     Pending - The request was created, but the operation has not started.    InProgress - The operation is in progress.    Successful - The operation completed successfully.    Failed - The operation failed to complete. You can troubleshoot using the status reason and the scaling activities.     Cancelling - An ongoing operation is being cancelled. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.     Cancelled - The operation is cancelled.    For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def describeInstanceRefreshes(): Request[DescribeInstanceRefreshesAnswer, AWSError] = js.native
  def describeInstanceRefreshes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceRefreshesAnswer, Unit]): Request[DescribeInstanceRefreshesAnswer, AWSError] = js.native
  /**
    * Describes one or more instance refreshes. You can determine the status of a request by looking at the Status parameter. The following are the possible statuses:     Pending - The request was created, but the operation has not started.    InProgress - The operation is in progress.    Successful - The operation completed successfully.    Failed - The operation failed to complete. You can troubleshoot using the status reason and the scaling activities.     Cancelling - An ongoing operation is being cancelled. Cancellation does not roll back any replacements that have already been completed, but it prevents new replacements from being started.     Cancelled - The operation is cancelled.    For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def describeInstanceRefreshes(params: DescribeInstanceRefreshesType): Request[DescribeInstanceRefreshesAnswer, AWSError] = js.native
  def describeInstanceRefreshes(
    params: DescribeInstanceRefreshesType,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstanceRefreshesAnswer, Unit]
  ): Request[DescribeInstanceRefreshesAnswer, AWSError] = js.native
  
  /**
    * Describes one or more launch configurations.
    */
  def describeLaunchConfigurations(): Request[LaunchConfigurationsType, AWSError] = js.native
  def describeLaunchConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationsType, Unit]): Request[LaunchConfigurationsType, AWSError] = js.native
  /**
    * Describes one or more launch configurations.
    */
  def describeLaunchConfigurations(params: LaunchConfigurationNamesType): Request[LaunchConfigurationsType, AWSError] = js.native
  def describeLaunchConfigurations(
    params: LaunchConfigurationNamesType,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationsType, Unit]
  ): Request[LaunchConfigurationsType, AWSError] = js.native
  
  /**
    * Describes the available types of lifecycle hooks. The following hook types are supported:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING  
    */
  def describeLifecycleHookTypes(): Request[DescribeLifecycleHookTypesAnswer, AWSError] = js.native
  def describeLifecycleHookTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLifecycleHookTypesAnswer, Unit]): Request[DescribeLifecycleHookTypesAnswer, AWSError] = js.native
  
  /**
    * Describes the lifecycle hooks for the specified Auto Scaling group.
    */
  def describeLifecycleHooks(): Request[DescribeLifecycleHooksAnswer, AWSError] = js.native
  def describeLifecycleHooks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLifecycleHooksAnswer, Unit]): Request[DescribeLifecycleHooksAnswer, AWSError] = js.native
  /**
    * Describes the lifecycle hooks for the specified Auto Scaling group.
    */
  def describeLifecycleHooks(params: DescribeLifecycleHooksType): Request[DescribeLifecycleHooksAnswer, AWSError] = js.native
  def describeLifecycleHooks(
    params: DescribeLifecycleHooksType,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLifecycleHooksAnswer, Unit]
  ): Request[DescribeLifecycleHooksAnswer, AWSError] = js.native
  
  /**
    * Describes the target groups for the specified Auto Scaling group.
    */
  def describeLoadBalancerTargetGroups(): Request[DescribeLoadBalancerTargetGroupsResponse, AWSError] = js.native
  def describeLoadBalancerTargetGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancerTargetGroupsResponse, Unit]
  ): Request[DescribeLoadBalancerTargetGroupsResponse, AWSError] = js.native
  /**
    * Describes the target groups for the specified Auto Scaling group.
    */
  def describeLoadBalancerTargetGroups(params: DescribeLoadBalancerTargetGroupsRequest): Request[DescribeLoadBalancerTargetGroupsResponse, AWSError] = js.native
  def describeLoadBalancerTargetGroups(
    params: DescribeLoadBalancerTargetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancerTargetGroupsResponse, Unit]
  ): Request[DescribeLoadBalancerTargetGroupsResponse, AWSError] = js.native
  
  /**
    * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use the DescribeLoadBalancerTargetGroups API instead.
    */
  def describeLoadBalancers(): Request[DescribeLoadBalancersResponse, AWSError] = js.native
  def describeLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersResponse, Unit]): Request[DescribeLoadBalancersResponse, AWSError] = js.native
  /**
    * Describes the load balancers for the specified Auto Scaling group. This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use the DescribeLoadBalancerTargetGroups API instead.
    */
  def describeLoadBalancers(params: DescribeLoadBalancersRequest): Request[DescribeLoadBalancersResponse, AWSError] = js.native
  def describeLoadBalancers(
    params: DescribeLoadBalancersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBalancersResponse, Unit]
  ): Request[DescribeLoadBalancersResponse, AWSError] = js.native
  
  /**
    * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling. The GroupStandbyInstances metric is not returned by default. You must explicitly request this metric when calling the EnableMetricsCollection API.
    */
  def describeMetricCollectionTypes(): Request[DescribeMetricCollectionTypesAnswer, AWSError] = js.native
  def describeMetricCollectionTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMetricCollectionTypesAnswer, Unit]): Request[DescribeMetricCollectionTypesAnswer, AWSError] = js.native
  
  /**
    * Describes the notification actions associated with the specified Auto Scaling group.
    */
  def describeNotificationConfigurations(): Request[DescribeNotificationConfigurationsAnswer, AWSError] = js.native
  def describeNotificationConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationConfigurationsAnswer, Unit]
  ): Request[DescribeNotificationConfigurationsAnswer, AWSError] = js.native
  /**
    * Describes the notification actions associated with the specified Auto Scaling group.
    */
  def describeNotificationConfigurations(params: DescribeNotificationConfigurationsType): Request[DescribeNotificationConfigurationsAnswer, AWSError] = js.native
  def describeNotificationConfigurations(
    params: DescribeNotificationConfigurationsType,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotificationConfigurationsAnswer, Unit]
  ): Request[DescribeNotificationConfigurationsAnswer, AWSError] = js.native
  
  /**
    * Describes the policies for the specified Auto Scaling group.
    */
  def describePolicies(): Request[PoliciesType, AWSError] = js.native
  def describePolicies(callback: js.Function2[/* err */ AWSError, /* data */ PoliciesType, Unit]): Request[PoliciesType, AWSError] = js.native
  /**
    * Describes the policies for the specified Auto Scaling group.
    */
  def describePolicies(params: DescribePoliciesType): Request[PoliciesType, AWSError] = js.native
  def describePolicies(
    params: DescribePoliciesType,
    callback: js.Function2[/* err */ AWSError, /* data */ PoliciesType, Unit]
  ): Request[PoliciesType, AWSError] = js.native
  
  /**
    * Describes one or more scaling activities for the specified Auto Scaling group.
    */
  def describeScalingActivities(): Request[ActivitiesType, AWSError] = js.native
  def describeScalingActivities(callback: js.Function2[/* err */ AWSError, /* data */ ActivitiesType, Unit]): Request[ActivitiesType, AWSError] = js.native
  /**
    * Describes one or more scaling activities for the specified Auto Scaling group.
    */
  def describeScalingActivities(params: DescribeScalingActivitiesType): Request[ActivitiesType, AWSError] = js.native
  def describeScalingActivities(
    params: DescribeScalingActivitiesType,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivitiesType, Unit]
  ): Request[ActivitiesType, AWSError] = js.native
  
  /**
    * Describes the scaling process types for use with the ResumeProcesses and SuspendProcesses APIs.
    */
  def describeScalingProcessTypes(): Request[ProcessesType, AWSError] = js.native
  def describeScalingProcessTypes(callback: js.Function2[/* err */ AWSError, /* data */ ProcessesType, Unit]): Request[ProcessesType, AWSError] = js.native
  
  /**
    * Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end time. To describe the actions that have already run, call the DescribeScalingActivities API.
    */
  def describeScheduledActions(): Request[ScheduledActionsType, AWSError] = js.native
  def describeScheduledActions(callback: js.Function2[/* err */ AWSError, /* data */ ScheduledActionsType, Unit]): Request[ScheduledActionsType, AWSError] = js.native
  /**
    * Describes the actions scheduled for your Auto Scaling group that haven't run or that have not reached their end time. To describe the actions that have already run, call the DescribeScalingActivities API.
    */
  def describeScheduledActions(params: DescribeScheduledActionsType): Request[ScheduledActionsType, AWSError] = js.native
  def describeScheduledActions(
    params: DescribeScheduledActionsType,
    callback: js.Function2[/* err */ AWSError, /* data */ ScheduledActionsType, Unit]
  ): Request[ScheduledActionsType, AWSError] = js.native
  
  /**
    * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned. For more information, see Tagging Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeTags(): Request[TagsType, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ TagsType, Unit]): Request[TagsType, AWSError] = js.native
  /**
    * Describes the specified tags. You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results. You can also specify multiple filters. The result includes information for a particular tag only if it matches all the filters. If there's no match, no special message is returned. For more information, see Tagging Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeTags(params: DescribeTagsType): Request[TagsType, AWSError] = js.native
  def describeTags(params: DescribeTagsType, callback: js.Function2[/* err */ AWSError, /* data */ TagsType, Unit]): Request[TagsType, AWSError] = js.native
  
  /**
    * Describes the termination policies supported by Amazon EC2 Auto Scaling. For more information, see Controlling which Auto Scaling instances terminate during scale in in the Amazon EC2 Auto Scaling User Guide.
    */
  def describeTerminationPolicyTypes(): Request[DescribeTerminationPolicyTypesAnswer, AWSError] = js.native
  def describeTerminationPolicyTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTerminationPolicyTypesAnswer, Unit]): Request[DescribeTerminationPolicyTypesAnswer, AWSError] = js.native
  
  /**
    * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def detachInstances(): Request[DetachInstancesAnswer, AWSError] = js.native
  def detachInstances(callback: js.Function2[/* err */ AWSError, /* data */ DetachInstancesAnswer, Unit]): Request[DetachInstancesAnswer, AWSError] = js.native
  /**
    * Removes one or more instances from the specified Auto Scaling group. After the instances are detached, you can manage them independent of the Auto Scaling group. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are detached. If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from the target groups. For more information, see Detach EC2 instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def detachInstances(params: DetachInstancesQuery): Request[DetachInstancesAnswer, AWSError] = js.native
  def detachInstances(
    params: DetachInstancesQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachInstancesAnswer, Unit]
  ): Request[DetachInstancesAnswer, AWSError] = js.native
  
  /**
    * Detaches one or more target groups from the specified Auto Scaling group.
    */
  def detachLoadBalancerTargetGroups(): Request[DetachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  def detachLoadBalancerTargetGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ DetachLoadBalancerTargetGroupsResultType, Unit]
  ): Request[DetachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  /**
    * Detaches one or more target groups from the specified Auto Scaling group.
    */
  def detachLoadBalancerTargetGroups(params: DetachLoadBalancerTargetGroupsType): Request[DetachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  def detachLoadBalancerTargetGroups(
    params: DetachLoadBalancerTargetGroupsType,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachLoadBalancerTargetGroupsResultType, Unit]
  ): Request[DetachLoadBalancerTargetGroupsResultType, AWSError] = js.native
  
  /**
    * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use the DetachLoadBalancerTargetGroups API instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using the DescribeLoadBalancers API call. The instances remain running.
    */
  def detachLoadBalancers(): Request[DetachLoadBalancersResultType, AWSError] = js.native
  def detachLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ DetachLoadBalancersResultType, Unit]): Request[DetachLoadBalancersResultType, AWSError] = js.native
  /**
    * Detaches one or more Classic Load Balancers from the specified Auto Scaling group. This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load Balancers, use the DetachLoadBalancerTargetGroups API instead. When you detach a load balancer, it enters the Removing state while deregistering the instances in the group. When all instances are deregistered, then you can no longer describe the load balancer using the DescribeLoadBalancers API call. The instances remain running.
    */
  def detachLoadBalancers(params: DetachLoadBalancersType): Request[DetachLoadBalancersResultType, AWSError] = js.native
  def detachLoadBalancers(
    params: DetachLoadBalancersType,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachLoadBalancersResultType, Unit]
  ): Request[DetachLoadBalancersResultType, AWSError] = js.native
  
  /**
    * Disables group metrics for the specified Auto Scaling group.
    */
  def disableMetricsCollection(): Request[js.Object, AWSError] = js.native
  def disableMetricsCollection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables group metrics for the specified Auto Scaling group.
    */
  def disableMetricsCollection(params: DisableMetricsCollectionQuery): Request[js.Object, AWSError] = js.native
  def disableMetricsCollection(
    params: DisableMetricsCollectionQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring CloudWatch metrics for your Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def enableMetricsCollection(): Request[js.Object, AWSError] = js.native
  def enableMetricsCollection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables group metrics for the specified Auto Scaling group. For more information, see Monitoring CloudWatch metrics for your Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def enableMetricsCollection(params: EnableMetricsCollectionQuery): Request[js.Object, AWSError] = js.native
  def enableMetricsCollection(
    params: EnableMetricsCollectionQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Moves the specified instances into the standby state. If you choose to decrement the desired capacity of the Auto Scaling group, the instances can enter standby as long as the desired capacity of the Auto Scaling group after the instances are placed into standby is equal to or greater than the minimum capacity of the group. If you choose not to decrement the desired capacity of the Auto Scaling group, the Auto Scaling group launches new instances to replace the instances on standby. For more information, see Temporarily removing instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def enterStandby(): Request[EnterStandbyAnswer, AWSError] = js.native
  def enterStandby(callback: js.Function2[/* err */ AWSError, /* data */ EnterStandbyAnswer, Unit]): Request[EnterStandbyAnswer, AWSError] = js.native
  /**
    * Moves the specified instances into the standby state. If you choose to decrement the desired capacity of the Auto Scaling group, the instances can enter standby as long as the desired capacity of the Auto Scaling group after the instances are placed into standby is equal to or greater than the minimum capacity of the group. If you choose not to decrement the desired capacity of the Auto Scaling group, the Auto Scaling group launches new instances to replace the instances on standby. For more information, see Temporarily removing instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def enterStandby(params: EnterStandbyQuery): Request[EnterStandbyAnswer, AWSError] = js.native
  def enterStandby(
    params: EnterStandbyQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ EnterStandbyAnswer, Unit]
  ): Request[EnterStandbyAnswer, AWSError] = js.native
  
  /**
    * Executes the specified policy. This can be useful for testing the design of your scaling policy.
    */
  def executePolicy(): Request[js.Object, AWSError] = js.native
  def executePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Executes the specified policy. This can be useful for testing the design of your scaling policy.
    */
  def executePolicy(params: ExecutePolicyType): Request[js.Object, AWSError] = js.native
  def executePolicy(params: ExecutePolicyType, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Moves the specified instances out of the standby state. After you put the instances back in service, the desired capacity is incremented. For more information, see Temporarily removing instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def exitStandby(): Request[ExitStandbyAnswer, AWSError] = js.native
  def exitStandby(callback: js.Function2[/* err */ AWSError, /* data */ ExitStandbyAnswer, Unit]): Request[ExitStandbyAnswer, AWSError] = js.native
  /**
    * Moves the specified instances out of the standby state. After you put the instances back in service, the desired capacity is incremented. For more information, see Temporarily removing instances from your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  def exitStandby(params: ExitStandbyQuery): Request[ExitStandbyAnswer, AWSError] = js.native
  def exitStandby(
    params: ExitStandbyQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ ExitStandbyAnswer, Unit]
  ): Request[ExitStandbyAnswer, AWSError] = js.native
  
  /**
    * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before it is put into service) or as the instance terminates (before it is fully terminated). This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using the RecordLifecycleActionHeartbeat API call.   If you finish before the timeout period ends, complete the lifecycle action using the CompleteLifecycleAction API call.   For more information, see Amazon EC2 Auto Scaling lifecycle hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. You can view the lifecycle hooks for an Auto Scaling group using the DescribeLifecycleHooks API call. If you are no longer using a lifecycle hook, you can delete it by calling the DeleteLifecycleHook API.
    */
  def putLifecycleHook(): Request[PutLifecycleHookAnswer, AWSError] = js.native
  def putLifecycleHook(callback: js.Function2[/* err */ AWSError, /* data */ PutLifecycleHookAnswer, Unit]): Request[PutLifecycleHookAnswer, AWSError] = js.native
  /**
    * Creates or updates a lifecycle hook for the specified Auto Scaling group. A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches (before it is put into service) or as the instance terminates (before it is fully terminated). This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.    Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using the RecordLifecycleActionHeartbeat API call.   If you finish before the timeout period ends, complete the lifecycle action using the CompleteLifecycleAction API call.   For more information, see Amazon EC2 Auto Scaling lifecycle hooks in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call fails. You can view the lifecycle hooks for an Auto Scaling group using the DescribeLifecycleHooks API call. If you are no longer using a lifecycle hook, you can delete it by calling the DeleteLifecycleHook API.
    */
  def putLifecycleHook(params: PutLifecycleHookType): Request[PutLifecycleHookAnswer, AWSError] = js.native
  def putLifecycleHook(
    params: PutLifecycleHookType,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecycleHookAnswer, Unit]
  ): Request[PutLifecycleHookAnswer, AWSError] = js.native
  
  /**
    * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting Amazon SNS notifications when your Auto Scaling group scales in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of SNS topics, which is 10 per Auto Scaling group, the call fails.
    */
  def putNotificationConfiguration(): Request[js.Object, AWSError] = js.native
  def putNotificationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the specified topic can have messages delivered to an endpoint such as a web server or an email address. This configuration overwrites any existing configuration. For more information, see Getting Amazon SNS notifications when your Auto Scaling group scales in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of SNS topics, which is 10 per Auto Scaling group, the call fails.
    */
  def putNotificationConfiguration(params: PutNotificationConfigurationType): Request[js.Object, AWSError] = js.native
  def putNotificationConfiguration(
    params: PutNotificationConfigurationType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates a scaling policy for an Auto Scaling group. For more information about using scaling policies to scale your Auto Scaling group, see Target tracking scaling policies and Step and simple scaling policies in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScalingPolicy(): Request[PolicyARNType, AWSError] = js.native
  def putScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PolicyARNType, Unit]): Request[PolicyARNType, AWSError] = js.native
  /**
    * Creates or updates a scaling policy for an Auto Scaling group. For more information about using scaling policies to scale your Auto Scaling group, see Target tracking scaling policies and Step and simple scaling policies in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScalingPolicy(params: PutScalingPolicyType): Request[PolicyARNType, AWSError] = js.native
  def putScalingPolicy(
    params: PutScalingPolicyType,
    callback: js.Function2[/* err */ AWSError, /* data */ PolicyARNType, Unit]
  ): Request[PolicyARNType, AWSError] = js.native
  
  /**
    * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScheduledUpdateGroupAction(): Request[js.Object, AWSError] = js.native
  def putScheduledUpdateGroupAction(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified when updating a scheduled scaling action, the corresponding value remains unchanged. For more information, see Scheduled scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def putScheduledUpdateGroupAction(params: PutScheduledUpdateGroupActionType): Request[js.Object, AWSError] = js.native
  def putScheduledUpdateGroupAction(
    params: PutScheduledUpdateGroupActionType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using the PutLifecycleHook API call. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling lifecycle in the Amazon EC2 Auto Scaling User Guide.
    */
  def recordLifecycleActionHeartbeat(): Request[RecordLifecycleActionHeartbeatAnswer, AWSError] = js.native
  def recordLifecycleActionHeartbeat(callback: js.Function2[/* err */ AWSError, /* data */ RecordLifecycleActionHeartbeatAnswer, Unit]): Request[RecordLifecycleActionHeartbeatAnswer, AWSError] = js.native
  /**
    * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the timeout by the length of time defined using the PutLifecycleHook API call. This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:   (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when Amazon EC2 Auto Scaling launches or terminates instances.   (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.   Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.    If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.    If you finish before the timeout period ends, complete the lifecycle action.   For more information, see Auto Scaling lifecycle in the Amazon EC2 Auto Scaling User Guide.
    */
  def recordLifecycleActionHeartbeat(params: RecordLifecycleActionHeartbeatType): Request[RecordLifecycleActionHeartbeatAnswer, AWSError] = js.native
  def recordLifecycleActionHeartbeat(
    params: RecordLifecycleActionHeartbeatType,
    callback: js.Function2[/* err */ AWSError, /* data */ RecordLifecycleActionHeartbeatAnswer, Unit]
  ): Request[RecordLifecycleActionHeartbeatAnswer, AWSError] = js.native
  
  /**
    * Resumes the specified suspended auto scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and resuming scaling processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def resumeProcesses(): Request[js.Object, AWSError] = js.native
  def resumeProcesses(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resumes the specified suspended auto scaling processes, or all suspended process, for the specified Auto Scaling group. For more information, see Suspending and resuming scaling processes in the Amazon EC2 Auto Scaling User Guide.
    */
  def resumeProcesses(params: ScalingProcessQuery): Request[js.Object, AWSError] = js.native
  def resumeProcesses(
    params: ScalingProcessQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the size of the specified Auto Scaling group. If a scale-in activity occurs as a result of a new DesiredCapacity value that is lower than the current size of the group, the Auto Scaling group uses its termination policy to determine which instances to terminate.  For more information, see Manual scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def setDesiredCapacity(): Request[js.Object, AWSError] = js.native
  def setDesiredCapacity(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the size of the specified Auto Scaling group. If a scale-in activity occurs as a result of a new DesiredCapacity value that is lower than the current size of the group, the Auto Scaling group uses its termination policy to determine which instances to terminate.  For more information, see Manual scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  def setDesiredCapacity(params: SetDesiredCapacityType): Request[js.Object, AWSError] = js.native
  def setDesiredCapacity(
    params: SetDesiredCapacityType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the health status of the specified instance. For more information, see Health checks for Auto Scaling instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceHealth(): Request[js.Object, AWSError] = js.native
  def setInstanceHealth(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the health status of the specified instance. For more information, see Health checks for Auto Scaling instances in the Amazon EC2 Auto Scaling User Guide.
    */
  def setInstanceHealth(params: SetInstanceHealthQuery): Request[js.Object, AWSError] = js.native
  def setInstanceHealth(
    params: SetInstanceHealthQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the instance protection settings of the specified instances. For more information about preventing instances that are part of an Auto Scaling group from terminating on scale in, see Instance scale-in protection in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of instance IDs, which is 50 per Auto Scaling group, the call fails.
    */
  def setInstanceProtection(): Request[SetInstanceProtectionAnswer, AWSError] = js.native
  def setInstanceProtection(callback: js.Function2[/* err */ AWSError, /* data */ SetInstanceProtectionAnswer, Unit]): Request[SetInstanceProtectionAnswer, AWSError] = js.native
  /**
    * Updates the instance protection settings of the specified instances. For more information about preventing instances that are part of an Auto Scaling group from terminating on scale in, see Instance scale-in protection in the Amazon EC2 Auto Scaling User Guide. If you exceed your maximum limit of instance IDs, which is 50 per Auto Scaling group, the call fails.
    */
  def setInstanceProtection(params: SetInstanceProtectionQuery): Request[SetInstanceProtectionAnswer, AWSError] = js.native
  def setInstanceProtection(
    params: SetInstanceProtectionQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ SetInstanceProtectionAnswer, Unit]
  ): Request[SetInstanceProtectionAnswer, AWSError] = js.native
  
  /**
    * Starts a new instance refresh operation, which triggers a rolling replacement of all previously launched instances in the Auto Scaling group with a new group of instances. If successful, this call creates a new instance refresh request with a unique ID that you can use to track its progress. To query its status, call the DescribeInstanceRefreshes API. To describe the instance refreshes that have already run, call the DescribeInstanceRefreshes API. To cancel an instance refresh operation in progress, use the CancelInstanceRefresh API.  For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def startInstanceRefresh(): Request[StartInstanceRefreshAnswer, AWSError] = js.native
  def startInstanceRefresh(callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceRefreshAnswer, Unit]): Request[StartInstanceRefreshAnswer, AWSError] = js.native
  /**
    * Starts a new instance refresh operation, which triggers a rolling replacement of all previously launched instances in the Auto Scaling group with a new group of instances. If successful, this call creates a new instance refresh request with a unique ID that you can use to track its progress. To query its status, call the DescribeInstanceRefreshes API. To describe the instance refreshes that have already run, call the DescribeInstanceRefreshes API. To cancel an instance refresh operation in progress, use the CancelInstanceRefresh API.  For more information, see Replacing Auto Scaling Instances Based on an Instance Refresh.
    */
  def startInstanceRefresh(params: StartInstanceRefreshType): Request[StartInstanceRefreshAnswer, AWSError] = js.native
  def startInstanceRefresh(
    params: StartInstanceRefreshType,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInstanceRefreshAnswer, Unit]
  ): Request[StartInstanceRefreshAnswer, AWSError] = js.native
  
  /**
    * Suspends the specified auto scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. For more information, see Suspending and resuming scaling processes in the Amazon EC2 Auto Scaling User Guide. To resume processes that have been suspended, call the ResumeProcesses API.
    */
  def suspendProcesses(): Request[js.Object, AWSError] = js.native
  def suspendProcesses(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Suspends the specified auto scaling processes, or all processes, for the specified Auto Scaling group. If you suspend either the Launch or Terminate process types, it can prevent other process types from functioning properly. For more information, see Suspending and resuming scaling processes in the Amazon EC2 Auto Scaling User Guide. To resume processes that have been suspended, call the ResumeProcesses API.
    */
  def suspendProcesses(params: ScalingProcessQuery): Request[js.Object, AWSError] = js.native
  def suspendProcesses(
    params: ScalingProcessQuery,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Terminates the specified instance and optionally adjusts the desired group size.  This call simply makes a termination request. The instance is not terminated immediately. When an instance is terminated, the instance status changes to terminated. You can't connect to or start an instance after you've terminated it. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are terminated.  By default, Amazon EC2 Auto Scaling balances instances across all Availability Zones. If you decrement the desired capacity, your Auto Scaling group can become unbalanced between Availability Zones. Amazon EC2 Auto Scaling tries to rebalance the group, and rebalancing might terminate instances in other zones. For more information, see Rebalancing activities in the Amazon EC2 Auto Scaling User Guide.
    */
  def terminateInstanceInAutoScalingGroup(): Request[ActivityType, AWSError] = js.native
  def terminateInstanceInAutoScalingGroup(callback: js.Function2[/* err */ AWSError, /* data */ ActivityType, Unit]): Request[ActivityType, AWSError] = js.native
  /**
    * Terminates the specified instance and optionally adjusts the desired group size.  This call simply makes a termination request. The instance is not terminated immediately. When an instance is terminated, the instance status changes to terminated. You can't connect to or start an instance after you've terminated it. If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to replace the ones that are terminated.  By default, Amazon EC2 Auto Scaling balances instances across all Availability Zones. If you decrement the desired capacity, your Auto Scaling group can become unbalanced between Availability Zones. Amazon EC2 Auto Scaling tries to rebalance the group, and rebalancing might terminate instances in other zones. For more information, see Rebalancing activities in the Amazon EC2 Auto Scaling User Guide.
    */
  def terminateInstanceInAutoScalingGroup(params: TerminateInstanceInAutoScalingGroupType): Request[ActivityType, AWSError] = js.native
  def terminateInstanceInAutoScalingGroup(
    params: TerminateInstanceInAutoScalingGroupType,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivityType, Unit]
  ): Request[ActivityType, AWSError] = js.native
  
  /**
    * Updates the configuration for the specified Auto Scaling group. To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any parameters that you don't specify are not changed by this update request. The new settings take effect on any scaling activities after this call returns.  If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get the updated configuration. Existing instances continue to run with the configuration that they were originally launched with. When you update a group to specify a mixed instances policy instead of a launch configuration or template, existing instances may be replaced to match the new purchasing options that you specified in the policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies 50% Spot capacity, this means that half of your instances will be gradually terminated and relaunched as Spot Instances. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that updating your group does not compromise the performance or availability of your application. Note the following about changing DesiredCapacity, MaxSize, or MinSize:   If a scale-in activity occurs as a result of a new DesiredCapacity value that is lower than the current size of the group, the Auto Scaling group uses its termination policy to determine which instances to terminate.   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, this sets the group's DesiredCapacity to the new MinSize value.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, this sets the group's DesiredCapacity to the new MaxSize value.   To see which parameters have been set, call the DescribeAutoScalingGroups API. To view the scaling policies for an Auto Scaling group, call the DescribePolicies API. If the group has scaling policies, you can update them by calling the PutScalingPolicy API.
    */
  def updateAutoScalingGroup(): Request[js.Object, AWSError] = js.native
  def updateAutoScalingGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the configuration for the specified Auto Scaling group. To update an Auto Scaling group, specify the name of the group and the parameter that you want to change. Any parameters that you don't specify are not changed by this update request. The new settings take effect on any scaling activities after this call returns.  If you associate a new launch configuration or template with an Auto Scaling group, all new instances will get the updated configuration. Existing instances continue to run with the configuration that they were originally launched with. When you update a group to specify a mixed instances policy instead of a launch configuration or template, existing instances may be replaced to match the new purchasing options that you specified in the policy. For example, if the group currently has 100% On-Demand capacity and the policy specifies 50% Spot capacity, this means that half of your instances will be gradually terminated and relaunched as Spot Instances. When replacing instances, Amazon EC2 Auto Scaling launches new instances before terminating the old ones, so that updating your group does not compromise the performance or availability of your application. Note the following about changing DesiredCapacity, MaxSize, or MinSize:   If a scale-in activity occurs as a result of a new DesiredCapacity value that is lower than the current size of the group, the Auto Scaling group uses its termination policy to determine which instances to terminate.   If you specify a new value for MinSize without specifying a value for DesiredCapacity, and the new MinSize is larger than the current size of the group, this sets the group's DesiredCapacity to the new MinSize value.   If you specify a new value for MaxSize without specifying a value for DesiredCapacity, and the new MaxSize is smaller than the current size of the group, this sets the group's DesiredCapacity to the new MaxSize value.   To see which parameters have been set, call the DescribeAutoScalingGroups API. To view the scaling policies for an Auto Scaling group, call the DescribePolicies API. If the group has scaling policies, you can update them by calling the PutScalingPolicy API.
    */
  def updateAutoScalingGroup(params: UpdateAutoScalingGroupType): Request[js.Object, AWSError] = js.native
  def updateAutoScalingGroup(
    params: UpdateAutoScalingGroupType,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
