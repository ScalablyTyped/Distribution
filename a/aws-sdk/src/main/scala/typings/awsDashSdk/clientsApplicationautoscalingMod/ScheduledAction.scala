package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledAction extends js.Object {
  /**
    * The date and time that the scheduled action was created.
    */
  var CreationTime: TimestampType = js.native
  /**
    * The date and time that the action is scheduled to end.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  /**
    * The identifier of the resource associated with the scaling policy. This string consists of the resource type and unique identifier.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   EMR cluster - The resource type is instancegroup and the unique identifier is the cluster ID and instance group ID. Example: instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0.   AppStream 2.0 fleet - The resource type is fleet and the unique identifier is the fleet name. Example: fleet/sample-fleet.   DynamoDB table - The resource type is table and the unique identifier is the table name. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the index name. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.   Amazon SageMaker endpoint variant - The resource type is variant and the unique identifier is the resource ID. Example: endpoint/my-end-point/variant/KMeansClustering.   Custom resources are not supported with a resource type. This parameter must specify the OutputValue from the CloudFormation template stack used to access the resources. The unique identifier is defined by the service provider. More information is available in our GitHub repository.   Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using the endpoint ARN. Example: arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE.   Lambda provisioned concurrency - The resource type is function and the unique identifier is the function name with a function version or alias name suffix that is not $LATEST. Example: function:my-function:prod or function:my-function:1.  
    */
  var ResourceId: ResourceIdMaxLen1600 = js.native
  /**
    * The scalable dimension. This string consists of the service namespace, resource type, and scaling property.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    elasticmapreduce:instancegroup:InstanceCount - The instance count of an EMR Instance Group.    appstream:fleet:DesiredCapacity - The desired capacity of an AppStream 2.0 fleet.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.    sagemaker:variant:DesiredInstanceCount - The number of EC2 instances for an Amazon SageMaker model endpoint variant.    custom-resource:ResourceType:Property - The scalable dimension for a custom resource provided by your own application or service.    comprehend:document-classifier-endpoint:DesiredInferenceUnits - The number of inference units for an Amazon Comprehend document classification endpoint.    lambda:function:ProvisionedConcurrency - The provisioned concurrency for a Lambda function.  
    */
  var ScalableDimension: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableDimension] = js.native
  /**
    * The new minimum and maximum capacity. You can set both values or just one. During the scheduled time, if the current capacity is below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the current capacity is above the maximum capacity, Application Auto Scaling scales in to the maximum capacity.
    */
  var ScalableTargetAction: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableTargetAction] = js.native
  /**
    * The schedule for this action. The following formats are supported:   At expressions - "at(yyyy-mm-ddThh:mm:ss)"   Rate expressions - "rate(value unit)"   Cron expressions - "cron(fields)"   At expressions are useful for one-time schedules. Specify the time, in UTC. For rate expressions, value is a positive integer and unit is minute | minutes | hour | hours | day | days. For more information about cron expressions, see Cron Expressions in the Amazon CloudWatch Events User Guide.
    */
  var Schedule: ResourceIdMaxLen1600 = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  var ScheduledActionARN: ResourceIdMaxLen1600 = js.native
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: typings.awsDashSdk.clientsApplicationautoscalingMod.ScheduledActionName = js.native
  /**
    * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For more information, see AWS Service Namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: typings.awsDashSdk.clientsApplicationautoscalingMod.ServiceNamespace = js.native
  /**
    * The date and time that the action is scheduled to begin.
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
}

object ScheduledAction {
  @scala.inline
  def apply(
    CreationTime: TimestampType,
    ResourceId: ResourceIdMaxLen1600,
    Schedule: ResourceIdMaxLen1600,
    ScheduledActionARN: ResourceIdMaxLen1600,
    ScheduledActionName: ScheduledActionName,
    ServiceNamespace: ServiceNamespace,
    EndTime: TimestampType = null,
    ScalableDimension: ScalableDimension = null,
    ScalableTargetAction: ScalableTargetAction = null,
    StartTime: TimestampType = null
  ): ScheduledAction = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionARN = ScheduledActionARN.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ScalableDimension != null) __obj.updateDynamic("ScalableDimension")(ScalableDimension.asInstanceOf[js.Any])
    if (ScalableTargetAction != null) __obj.updateDynamic("ScalableTargetAction")(ScalableTargetAction.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledAction]
  }
}

