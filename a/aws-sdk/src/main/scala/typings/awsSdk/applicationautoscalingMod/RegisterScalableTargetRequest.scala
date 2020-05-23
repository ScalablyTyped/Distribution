package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterScalableTargetRequest extends js.Object {
  /**
    * The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed to the maximum capacity limit in response to changing demand.  This parameter is required if you are registering a scalable target.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.native
  /**
    * The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as needed to the minimum capacity limit in response to changing demand.  This parameter is required if you are registering a scalable target. For Lambda provisioned concurrency, the minimum value allowed is 0. For all other resources, the minimum value allowed is 1.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.native
  /**
    * The identifier of the resource that is associated with the scalable target. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.   Amazon Keyspaces table - The resource type is table and the unique identifier is the table name. Example: keyspace/mykeyspace/table/mytable.  
    */
  var ResourceId: ResourceIdMaxLen1600 = js.native
  /**
    * This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and it must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your behalf.  If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which it creates if it does not yet exist. For more information, see Application Auto Scaling IAM Roles.
    */
  var RoleARN: js.UndefOr[ResourceIdMaxLen1600] = js.native
  /**
    * The scalable dimension associated with the scalable target. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.    cassandra:table:ReadCapacityUnits - The provisioned read capacity for an Amazon Keyspaces table.    cassandra:table:WriteCapacityUnits - The provisioned write capacity for an Amazon Keyspaces table.  
    */
  var ScalableDimension: typings.awsSdk.applicationautoscalingMod.ScalableDimension = js.native
  /**
    * The namespace of the AWS service that provides the resource. For a resource provided by your own application or service, use custom-resource instead.
    */
  var ServiceNamespace: typings.awsSdk.applicationautoscalingMod.ServiceNamespace = js.native
  /**
    * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic scaling. Setting the value of an attribute to true suspends the specified scaling activities. Setting it to false (default) resumes the specified scaling activities.   Suspension Outcomes    For DynamicScalingInSuspended, while a suspension is in effect, all scale-in activities that are triggered by a scaling policy are suspended.   For DynamicScalingOutSuspended, while a suspension is in effect, all scale-out activities that are triggered by a scaling policy are suspended.   For ScheduledScalingSuspended, while a suspension is in effect, all scaling activities that involve scheduled actions are suspended.    For more information, see Suspending and Resuming Scaling in the Application Auto Scaling User Guide.
    */
  var SuspendedState: js.UndefOr[typings.awsSdk.applicationautoscalingMod.SuspendedState] = js.native
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
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity.get.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (SuspendedState != null) __obj.updateDynamic("SuspendedState")(SuspendedState.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterScalableTargetRequest]
  }
}

