package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingPlanResource extends js.Object {
  /**
    * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
    */
  var ResourceId: ResourceIdMaxLen1600
  /**
    * The scalable dimension for the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.  
    */
  var ScalableDimension: awsDashSdkLib.clientsAutoscalingplansMod.ScalableDimension
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanName
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: awsDashSdkLib.clientsAutoscalingplansMod.ScalingPlanVersion
  /**
    * The scaling policies.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
  /**
    * The scaling status of the resource.    Active - The scaling configuration is active.    Inactive - The scaling configuration is not active because the scaling plan is being created or the scaling configuration could not be applied. Check the status message for more information.    PartiallyActive - The scaling configuration is partially active because the scaling plan is being created or deleted or the scaling configuration could not be fully applied. Check the status message for more information.  
    */
  var ScalingStatusCode: awsDashSdkLib.clientsAutoscalingplansMod.ScalingStatusCode
  /**
    * A simple message about the current scaling status of the resource.
    */
  var ScalingStatusMessage: js.UndefOr[XmlString] = js.undefined
  /**
    * The namespace of the AWS service.
    */
  var ServiceNamespace: awsDashSdkLib.clientsAutoscalingplansMod.ServiceNamespace
}

object ScalingPlanResource {
  @scala.inline
  def apply(
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ScalingPlanName: ScalingPlanName,
    ScalingPlanVersion: ScalingPlanVersion,
    ScalingStatusCode: ScalingStatusCode,
    ServiceNamespace: ServiceNamespace,
    ScalingPolicies: ScalingPolicies = null,
    ScalingStatusMessage: XmlString = null
  ): ScalingPlanResource = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ScalingPlanName = ScalingPlanName, ScalingPlanVersion = ScalingPlanVersion, ScalingStatusCode = ScalingStatusCode.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies)
    if (ScalingStatusMessage != null) __obj.updateDynamic("ScalingStatusMessage")(ScalingStatusMessage)
    __obj.asInstanceOf[ScalingPlanResource]
  }
}

