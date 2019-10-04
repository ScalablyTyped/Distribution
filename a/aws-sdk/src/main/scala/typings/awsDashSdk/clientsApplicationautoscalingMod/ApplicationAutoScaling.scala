package typings.awsDashSdk.clientsApplicationautoscalingMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAutoScaling extends Service {
  @JSName("config")
  var config_ApplicationAutoScaling: ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the specified scaling policy for an Application Auto Scaling scalable target. Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. For more information, see Delete a Step Scaling Policy and Delete a Target Tracking Scaling Policy in the Application Auto Scaling User Guide. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def deleteScalingPolicy(): Request[DeleteScalingPolicyResponse, AWSError] = js.native
  def deleteScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScalingPolicyResponse, Unit]): Request[DeleteScalingPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified scaling policy for an Application Auto Scaling scalable target. Deleting a step scaling policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. For more information, see Delete a Step Scaling Policy and Delete a Target Tracking Scaling Policy in the Application Auto Scaling User Guide. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def deleteScalingPolicy(params: DeleteScalingPolicyRequest): Request[DeleteScalingPolicyResponse, AWSError] = js.native
  def deleteScalingPolicy(
    params: DeleteScalingPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScalingPolicyResponse, Unit]
  ): Request[DeleteScalingPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified scheduled action for an Application Auto Scaling scalable target. For more information, see Delete a Scheduled Action in the Application Auto Scaling User Guide.
    */
  def deleteScheduledAction(): Request[DeleteScheduledActionResponse, AWSError] = js.native
  def deleteScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduledActionResponse, Unit]): Request[DeleteScheduledActionResponse, AWSError] = js.native
  /**
    * Deletes the specified scheduled action for an Application Auto Scaling scalable target. For more information, see Delete a Scheduled Action in the Application Auto Scaling User Guide.
    */
  def deleteScheduledAction(params: DeleteScheduledActionRequest): Request[DeleteScheduledActionResponse, AWSError] = js.native
  def deleteScheduledAction(
    params: DeleteScheduledActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduledActionResponse, Unit]
  ): Request[DeleteScheduledActionResponse, AWSError] = js.native
  /**
    * Deregisters an Application Auto Scaling scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget. 
    */
  def deregisterScalableTarget(): Request[DeregisterScalableTargetResponse, AWSError] = js.native
  def deregisterScalableTarget(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterScalableTargetResponse, Unit]): Request[DeregisterScalableTargetResponse, AWSError] = js.native
  /**
    * Deregisters an Application Auto Scaling scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget. 
    */
  def deregisterScalableTarget(params: DeregisterScalableTargetRequest): Request[DeregisterScalableTargetResponse, AWSError] = js.native
  def deregisterScalableTarget(
    params: DeregisterScalableTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterScalableTargetResponse, Unit]
  ): Request[DeregisterScalableTargetResponse, AWSError] = js.native
  /**
    * Gets information about the scalable targets in the specified namespace. You can filter the results using ResourceIds and ScalableDimension. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def describeScalableTargets(): Request[DescribeScalableTargetsResponse, AWSError] = js.native
  def describeScalableTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalableTargetsResponse, Unit]): Request[DescribeScalableTargetsResponse, AWSError] = js.native
  /**
    * Gets information about the scalable targets in the specified namespace. You can filter the results using ResourceIds and ScalableDimension. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def describeScalableTargets(params: DescribeScalableTargetsRequest): Request[DescribeScalableTargetsResponse, AWSError] = js.native
  def describeScalableTargets(
    params: DescribeScalableTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalableTargetsResponse, Unit]
  ): Request[DescribeScalableTargetsResponse, AWSError] = js.native
  /**
    * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using ResourceId and ScalableDimension. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def describeScalingActivities(): Request[DescribeScalingActivitiesResponse, AWSError] = js.native
  def describeScalingActivities(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingActivitiesResponse, Unit]): Request[DescribeScalingActivitiesResponse, AWSError] = js.native
  /**
    * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using ResourceId and ScalableDimension. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def describeScalingActivities(params: DescribeScalingActivitiesRequest): Request[DescribeScalingActivitiesResponse, AWSError] = js.native
  def describeScalingActivities(
    params: DescribeScalingActivitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingActivitiesResponse, Unit]
  ): Request[DescribeScalingActivitiesResponse, AWSError] = js.native
  /**
    * Describes the Application Auto Scaling scaling policies for the specified service namespace. You can filter the results using ResourceId, ScalableDimension, and PolicyNames. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
    */
  def describeScalingPolicies(): Request[DescribeScalingPoliciesResponse, AWSError] = js.native
  def describeScalingPolicies(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPoliciesResponse, Unit]): Request[DescribeScalingPoliciesResponse, AWSError] = js.native
  /**
    * Describes the Application Auto Scaling scaling policies for the specified service namespace. You can filter the results using ResourceId, ScalableDimension, and PolicyNames. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
    */
  def describeScalingPolicies(params: DescribeScalingPoliciesRequest): Request[DescribeScalingPoliciesResponse, AWSError] = js.native
  def describeScalingPolicies(
    params: DescribeScalingPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPoliciesResponse, Unit]
  ): Request[DescribeScalingPoliciesResponse, AWSError] = js.native
  /**
    * Describes the Application Auto Scaling scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
    */
  def describeScheduledActions(): Request[DescribeScheduledActionsResponse, AWSError] = js.native
  def describeScheduledActions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledActionsResponse, Unit]): Request[DescribeScheduledActionsResponse, AWSError] = js.native
  /**
    * Describes the Application Auto Scaling scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
    */
  def describeScheduledActions(params: DescribeScheduledActionsRequest): Request[DescribeScheduledActionsResponse, AWSError] = js.native
  def describeScheduledActions(
    params: DescribeScheduledActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduledActionsResponse, Unit]
  ): Request[DescribeScheduledActionsResponse, AWSError] = js.native
  /**
    * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you have registered the resource as a scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy. Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that multiple policies could conflict, instructing the scalable target to scale out or in at the same time. Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent, and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity (200% of 10 = 20) and scales out to 30.  Learn more about how to work with scaling policies in the Application Auto Scaling User Guide.
    */
  def putScalingPolicy(): Request[PutScalingPolicyResponse, AWSError] = js.native
  def putScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutScalingPolicyResponse, Unit]): Request[PutScalingPolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you have registered the resource as a scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy. Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that multiple policies could conflict, instructing the scalable target to scale out or in at the same time. Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale out and scale in. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent, and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity (200% of 10 = 20) and scales out to 30.  Learn more about how to work with scaling policies in the Application Auto Scaling User Guide.
    */
  def putScalingPolicy(params: PutScalingPolicyRequest): Request[PutScalingPolicyResponse, AWSError] = js.native
  def putScalingPolicy(
    params: PutScalingPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutScalingPolicyResponse, Unit]
  ): Request[PutScalingPolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you have registered the resource as a scalable target using RegisterScalableTarget.  To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction. Learn more about how to work with scheduled actions in the Application Auto Scaling User Guide.
    */
  def putScheduledAction(): Request[PutScheduledActionResponse, AWSError] = js.native
  def putScheduledAction(callback: js.Function2[/* err */ AWSError, /* data */ PutScheduledActionResponse, Unit]): Request[PutScheduledActionResponse, AWSError] = js.native
  /**
    * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you have registered the resource as a scalable target using RegisterScalableTarget.  To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction. Learn more about how to work with scheduled actions in the Application Auto Scaling User Guide.
    */
  def putScheduledAction(params: PutScheduledActionRequest): Request[PutScheduledActionResponse, AWSError] = js.native
  def putScheduledAction(
    params: PutScheduledActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutScheduledActionResponse, Unit]
  ): Request[PutScheduledActionResponse, AWSError] = js.native
  /**
    * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are uniquely identified by the combination of resource ID, scalable dimension, and namespace.  When you register a new scalable target, you must specify values for minimum and maximum capacity. Application Auto Scaling will not scale capacity to values that are outside of this range.  To update a scalable target, specify the parameter that you want to change as well as the following parameters that identify the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are not changed by this update request.  After you register a scalable target, you do not need to register it again to use other Application Auto Scaling operations. To see which resources have been registered, use DescribeScalableTargets. You can also view the scaling policies for a service namespace by using DescribeScalableTargets.  If you no longer need a scalable target, you can deregister it by using DeregisterScalableTarget.
    */
  def registerScalableTarget(): Request[RegisterScalableTargetResponse, AWSError] = js.native
  def registerScalableTarget(callback: js.Function2[/* err */ AWSError, /* data */ RegisterScalableTargetResponse, Unit]): Request[RegisterScalableTargetResponse, AWSError] = js.native
  /**
    * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out and scale in. Scalable targets are uniquely identified by the combination of resource ID, scalable dimension, and namespace.  When you register a new scalable target, you must specify values for minimum and maximum capacity. Application Auto Scaling will not scale capacity to values that are outside of this range.  To update a scalable target, specify the parameter that you want to change as well as the following parameters that identify the scalable target: resource ID, scalable dimension, and namespace. Any parameters that you don't specify are not changed by this update request.  After you register a scalable target, you do not need to register it again to use other Application Auto Scaling operations. To see which resources have been registered, use DescribeScalableTargets. You can also view the scaling policies for a service namespace by using DescribeScalableTargets.  If you no longer need a scalable target, you can deregister it by using DeregisterScalableTarget.
    */
  def registerScalableTarget(params: RegisterScalableTargetRequest): Request[RegisterScalableTargetResponse, AWSError] = js.native
  def registerScalableTarget(
    params: RegisterScalableTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterScalableTargetResponse, Unit]
  ): Request[RegisterScalableTargetResponse, AWSError] = js.native
}

