package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterScalableTargetRequest extends js.Object {
  /**
    * The maximum value to scale to in response to a scale-out event. MaxCapacity is required to register a scalable target.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  /**
    * The minimum value to scale to in response to a scale-in event. MinCapacity is required to register a scalable target.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  /**
    * The identifier of the resource that is associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variants - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.  
    */
  var ResourceId: ResourceIdMaxLen1600
  /**
    * Application Auto Scaling creates a service-linked role that grants it permissions to modify the scalable target on your behalf. For more information, see Service-Linked Roles for Application Auto Scaling. For Amazon EMR, this parameter is required, and it must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your behalf.
    */
  var RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.undefined
  /**
    * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.  
    */
  var ScalableDimension: typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableDimension
  /**
    * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference. 
    */
  var ServiceNamespace: typings.awsDashSdk.clientsApplicationautoscalingMod.ServiceNamespace
  /**
    * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic scaling. Setting the value of an attribute to true suspends the specified scaling activities. Setting it to false (default) resumes the specified scaling activities.   Suspension Outcomes    For DynamicScalingInSuspended, while a suspension is in effect, all scale-in activities that are triggered by a scaling policy are suspended.   For DynamicScalingOutSuspended, while a suspension is in effect, all scale-out activities that are triggered by a scaling policy are suspended.   For ScheduledScalingSuspended, while a suspension is in effect, all scaling activities that involve scheduled actions are suspended.    For more information, see Suspend and Resume Application Auto Scaling in the Application Auto Scaling User Guide.
    */
  var SuspendedState: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.SuspendedState] = js.undefined
}

object RegisterScalableTargetRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace,
    MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
    MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined,
    RoleARN: ResourceIdMaxLen1600 = null,
    SuspendedState: SuspendedState = null
  ): RegisterScalableTargetRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (SuspendedState != null) __obj.updateDynamic("SuspendedState")(SuspendedState)
    __obj.asInstanceOf[RegisterScalableTargetRequest]
  }
}

