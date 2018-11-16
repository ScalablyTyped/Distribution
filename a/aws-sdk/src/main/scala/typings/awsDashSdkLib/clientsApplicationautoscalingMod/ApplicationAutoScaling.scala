package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAutoScaling
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApplicationAutoScaling: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.ClientConfiguration = js.native
  /**
     * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def deleteScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def deleteScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def deleteScalingPolicy(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scaling policy. Deleting a policy deletes the underlying alarm action, but does not delete the CloudWatch alarm associated with the scaling policy, even if it no longer has an associated action. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def deleteScalingPolicy(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scheduled action.
     */
  def deleteScheduledAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scheduled action.
     */
  def deleteScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scheduled action.
     */
  def deleteScheduledAction(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Application Auto Scaling scheduled action.
     */
  def deleteScheduledAction(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeleteScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
     */
  def deregisterScalableTarget(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
     */
  def deregisterScalableTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
     */
  def deregisterScalableTarget(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deregisters a scalable target. Deregistering a scalable target deletes the scaling policies that are associated with it. To create a scalable target or update an existing one, see RegisterScalableTarget.
     */
  def deregisterScalableTarget(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DeregisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def describeScalableTargets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def describeScalableTargets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def describeScalableTargets(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about the scalable targets in the specified namespace. You can filter the results using the ResourceIds and ScalableDimension parameters. To create a scalable target or update an existing one, see RegisterScalableTarget. If you are no longer using a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def describeScalableTargets(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalableTargetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def describeScalingActivities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def describeScalingActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def describeScalingActivities(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides descriptive information about the scaling activities in the specified namespace from the previous six weeks. You can filter the results using the ResourceId and ScalableDimension parameters. Scaling activities are triggered by CloudWatch alarms that are associated with scaling policies. To view the scaling policies for a service namespace, see DescribeScalingPolicies. To create a scaling policy or update an existing one, see PutScalingPolicy.
     */
  def describeScalingActivities(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingActivitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def describeScalingPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def describeScalingPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def describeScalingPolicies(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scaling policies for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and PolicyNames parameters. To create a scaling policy or update an existing one, see PutScalingPolicy. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def describeScalingPolicies(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScalingPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def describeScheduledActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def describeScheduledActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def describeScheduledActions(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the scheduled actions for the specified service namespace. You can filter the results using the ResourceId, ScalableDimension, and ScheduledActionNames parameters. To create a scheduled action or update an existing one, see PutScheduledAction. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def describeScheduledActions(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.DescribeScheduledActionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def putScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def putScalingPolicy(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a policy for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scaling policy applies to the scalable target identified by those three attributes. You cannot create a scaling policy until you register the scalable target using RegisterScalableTarget. To update a policy, specify its policy name and the parameters that you want to change. Any parameters that you don't specify are not changed by this update request. You can view the scaling policies for a service namespace using DescribeScalingPolicies. If you are no longer using a scaling policy, you can delete it using DeleteScalingPolicy.
     */
  def putScalingPolicy(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScalingPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def putScheduledAction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def putScheduledAction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def putScheduledAction(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or updates a scheduled action for an Application Auto Scaling scalable target. Each scalable target is identified by a service namespace, resource ID, and scalable dimension. A scheduled action applies to the scalable target identified by those three attributes. You cannot create a scheduled action until you register the scalable target using RegisterScalableTarget. To update an action, specify its name and the parameters that you want to change. If you don't specify start and end times, the old values are deleted. Any other parameters that you don't specify are not changed by this update request. You can view the scheduled actions using DescribeScheduledActions. If you are no longer using a scheduled action, you can delete it using DeleteScheduledAction.
     */
  def putScheduledAction(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.PutScheduledActionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def registerScalableTarget(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def registerScalableTarget(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def registerScalableTarget(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers or updates a scalable target. A scalable target is a resource that Application Auto Scaling can scale out or scale in. After you have registered a scalable target, you can use this operation to update the minimum and maximum values for its scalable dimension. After you register a scalable target, you can create and apply scaling policies using PutScalingPolicy. You can view the scaling policies for a service namespace using DescribeScalableTargets. If you no longer need a scalable target, you can deregister it using DeregisterScalableTarget.
     */
  def registerScalableTarget(
    params: awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsApplicationautoscalingMod.ApplicationAutoScalingNs.RegisterScalableTargetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

