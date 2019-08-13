package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingActivity extends js.Object {
  /**
    * The unique identifier of the scaling activity.
    */
  var ActivityId: ResourceId
  /**
    * A simple description of what caused the scaling activity to happen.
    */
  var Cause: XmlString
  /**
    * A simple description of what action the scaling activity intends to accomplish.
    */
  var Description: XmlString
  /**
    * The details about the scaling activity.
    */
  var Details: js.UndefOr[XmlString] = js.undefined
  /**
    * The Unix timestamp for when the scaling activity ended.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  /**
    * The identifier of the resource associated with the scaling activity. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.  
    */
  var ResourceId: ResourceIdMaxLen1600
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
    */
  var ScalableDimension: typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableDimension
  /**
    * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: typings.awsDashSdk.clientsApplicationautoscalingMod.ServiceNamespace
  /**
    * The Unix timestamp for when the scaling activity began.
    */
  var StartTime: TimestampType
  /**
    * Indicates the status of the scaling activity.
    */
  var StatusCode: ScalingActivityStatusCode
  /**
    * A simple message about the current status of the scaling activity.
    */
  var StatusMessage: js.UndefOr[XmlString] = js.undefined
}

object ScalingActivity {
  @scala.inline
  def apply(
    ActivityId: ResourceId,
    Cause: XmlString,
    Description: XmlString,
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace,
    StartTime: TimestampType,
    StatusCode: ScalingActivityStatusCode,
    Details: XmlString = null,
    EndTime: TimestampType = null,
    StatusMessage: XmlString = null
  ): ScalingActivity = {
    val __obj = js.Dynamic.literal(ActivityId = ActivityId, Cause = Cause, Description = Description, ResourceId = ResourceId, ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any], StartTime = StartTime, StatusCode = StatusCode.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ScalingActivity]
  }
}

