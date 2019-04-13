package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAutoScaling
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApplicationAutoScaling: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def deleteScalingPolicy(): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def deleteScalingPolicy(params: DeleteScalingPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScalingPolicy(
    params: DeleteScalingPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Application Auto Scaling scheduled action.
    */
  def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Application Auto Scaling scheduled action.
    */
  def deleteScheduledAction(params: DeleteScheduledActionRequest): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScheduledAction(
    params: DeleteScheduledActionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget. 
    */
  def deregisterScalableTarget(): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterScalableTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget. 
    */
  def deregisterScalableTarget(params: DeregisterScalableTargetRequest): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deregisterScalableTarget(
    params: DeregisterScalableTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeregisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeregisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def describeScalableTargets(): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalableTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalableTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def describeScalableTargets(params: DescribeScalableTargetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalableTargets(
    params: DescribeScalableTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalableTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalableTargetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
    */
  def describeScalingActivities(params: DescribeScalingActivitiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingActivities(
    params: DescribeScalingActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingActivitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
    */
  def describeScalingPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
    */
  def describeScalingPolicies(params: DescribeScalingPoliciesRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScalingPolicies(
    params: DescribeScalingPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScalingPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
    */
  def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduledActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
    */
  def describeScheduledActions(params: DescribeScheduledActionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeScheduledActions(
    params: DescribeScheduledActionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeScheduledActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeScheduledActionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you have registered the resource as a scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy. Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that multiple policies could conflict, instructing the scalable target to scale out or in at the same time. Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale in and scale out. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent, and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity (200% of 10 = 20) and scales out to 30.  Learn more about how to work with scaling policies in the Application Auto Scaling User Guide.
    */
  def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you have registered the resource as a scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy. Multiple scaling policies can be in force at the same time for the same scalable target. You can have one or more target tracking scaling policies, one or more step scaling policies, or both. However, there is a chance that multiple policies could conflict, instructing the scalable target to scale out or in at the same time. Application Auto Scaling gives precedence to the policy that provides the largest capacity for both scale in and scale out. For example, if one policy increases capacity by 3, another policy increases capacity by 200 percent, and the current capacity is 10, Application Auto Scaling uses the policy with the highest calculated capacity (200% of 10 = 20) and scales out to 30.  Learn more about how to work with scaling policies in the Application Auto Scaling User Guide.
    */
  def putScalingPolicy(params: PutScalingPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScalingPolicy(
    params: PutScalingPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you have registered the resource as a scalable target using RegisterScalableTarget.  To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction. Learn more about how to work with scheduled actions in the Application Auto Scaling User Guide.
    */
  def putScheduledAction(): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you have registered the resource as a scalable target using RegisterScalableTarget.  To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction. Learn more about how to work with scheduled actions in the Application Auto Scaling User Guide.
    */
  def putScheduledAction(params: PutScheduledActionRequest): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putScheduledAction(
    params: PutScheduledActionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutScheduledActionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values for minimum and maximum capacity.  After you register a scalable target, you do not need to register it again to use other Application Auto Scaling operations. To see which resources have been registered, use DescribeScalableTargets. You can also view the scaling policies for a service namespace using DescribeScalableTargets.  If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def registerScalableTarget(): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerScalableTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out and scale in. Each scalable target has a resource ID, scalable dimension, and namespace, as well as values for minimum and maximum capacity.  After you register a scalable target, you do not need to register it again to use other Application Auto Scaling operations. To see which resources have been registered, use DescribeScalableTargets. You can also view the scaling policies for a service namespace using DescribeScalableTargets.  If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
    */
  def registerScalableTarget(params: RegisterScalableTargetRequest): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerScalableTarget(
    params: RegisterScalableTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterScalableTargetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

