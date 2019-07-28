package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingInstruction extends js.Object {
  /**
    * The customized load metric to use for predictive scaling. This parameter or a PredefinedLoadMetricSpecification is required when configuring predictive scaling, and cannot be used otherwise. 
    */
  var CustomizedLoadMetricSpecification: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.CustomizedLoadMetricSpecification] = js.undefined
  /**
    * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling policies based on the specified target tracking configurations.  The default is enabled (false). 
    */
  var DisableDynamicScaling: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.DisableDynamicScaling] = js.undefined
  /**
    * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for PredictiveScalingMaxCapacityBehavior. 
    */
  var MaxCapacity: ResourceCapacity
  /**
    * The minimum capacity of the resource. 
    */
  var MinCapacity: ResourceCapacity
  /**
    * The predefined load metric to use for predictive scaling. This parameter or a CustomizedLoadMetricSpecification is required when configuring predictive scaling, and cannot be used otherwise. 
    */
  var PredefinedLoadMetricSpecification: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.PredefinedLoadMetricSpecification] = js.undefined
  /**
    * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource. The default value is SetForecastCapacityToMaxCapacity. The following are possible values:    SetForecastCapacityToMaxCapacity - AWS Auto Scaling cannot scale resource capacity higher than the maximum capacity. The maximum capacity is enforced as a hard limit.     SetMaxCapacityToForecastCapacity - AWS Auto Scaling may scale resource capacity higher than the maximum capacity to equal but not exceed forecast capacity.    SetMaxCapacityAboveForecastCapacity - AWS Auto Scaling may scale resource capacity higher than the maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra capacity if unexpected traffic occurs.    Only valid when configuring predictive scaling.
    */
  var PredictiveScalingMaxCapacityBehavior: js.UndefOr[
    typings.awsDashSdk.clientsAutoscalingplansMod.PredictiveScalingMaxCapacityBehavior
  ] = js.undefined
  /**
    * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the effective maximum capacity is 55. Only valid when configuring predictive scaling. Required if the PredictiveScalingMaxCapacityBehavior is set to SetMaxCapacityAboveForecastCapacity, and cannot be used otherwise. The range is 1-100.
    */
  var PredictiveScalingMaxCapacityBuffer: js.UndefOr[ResourceCapacity] = js.undefined
  /**
    * The predictive scaling mode. The default value is ForecastAndScale. Otherwise, AWS Auto Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast. 
    */
  var PredictiveScalingMode: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.PredictiveScalingMode] = js.undefined
  /**
    * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
    */
  var ResourceId: ResourceIdMaxLen1600
  /**
    * The scalable dimension associated with the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.  
    */
  var ScalableDimension: typings.awsDashSdk.clientsAutoscalingplansMod.ScalableDimension
  /**
    * Controls whether a resource's externally created scaling policies are kept or replaced.  The default value is KeepExternalPolicies. If the parameter is set to ReplaceExternalPolicies, any scaling policies that are external to AWS Auto Scaling are deleted and new target tracking scaling policies created.  Only valid when configuring dynamic scaling.  Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
    */
  var ScalingPolicyUpdateBehavior: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScalingPolicyUpdateBehavior] = js.undefined
  /**
    * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the instance and whether there are startup scripts to complete.  The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300 seconds.  Only valid when configuring predictive scaling. 
    */
  var ScheduledActionBufferTime: js.UndefOr[typings.awsDashSdk.clientsAutoscalingplansMod.ScheduledActionBufferTime] = js.undefined
  /**
    * The namespace of the AWS service.
    */
  var ServiceNamespace: typings.awsDashSdk.clientsAutoscalingplansMod.ServiceNamespace
  /**
    * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.  With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that provides the largest capacity for both scale in and scale out.  Condition: The scaling metric must be unique across target tracking configurations.
    */
  var TargetTrackingConfigurations: typings.awsDashSdk.clientsAutoscalingplansMod.TargetTrackingConfigurations
}

object ScalingInstruction {
  @scala.inline
  def apply(
    MaxCapacity: ResourceCapacity,
    MinCapacity: ResourceCapacity,
    ResourceId: ResourceIdMaxLen1600,
    ScalableDimension: ScalableDimension,
    ServiceNamespace: ServiceNamespace,
    TargetTrackingConfigurations: TargetTrackingConfigurations,
    CustomizedLoadMetricSpecification: CustomizedLoadMetricSpecification = null,
    DisableDynamicScaling: js.UndefOr[DisableDynamicScaling] = js.undefined,
    PredefinedLoadMetricSpecification: PredefinedLoadMetricSpecification = null,
    PredictiveScalingMaxCapacityBehavior: PredictiveScalingMaxCapacityBehavior = null,
    PredictiveScalingMaxCapacityBuffer: js.UndefOr[ResourceCapacity] = js.undefined,
    PredictiveScalingMode: PredictiveScalingMode = null,
    ScalingPolicyUpdateBehavior: ScalingPolicyUpdateBehavior = null,
    ScheduledActionBufferTime: js.UndefOr[ScheduledActionBufferTime] = js.undefined
  ): ScalingInstruction = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity, MinCapacity = MinCapacity, ResourceId = ResourceId, ScalableDimension = ScalableDimension.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any], TargetTrackingConfigurations = TargetTrackingConfigurations)
    if (CustomizedLoadMetricSpecification != null) __obj.updateDynamic("CustomizedLoadMetricSpecification")(CustomizedLoadMetricSpecification)
    if (!js.isUndefined(DisableDynamicScaling)) __obj.updateDynamic("DisableDynamicScaling")(DisableDynamicScaling)
    if (PredefinedLoadMetricSpecification != null) __obj.updateDynamic("PredefinedLoadMetricSpecification")(PredefinedLoadMetricSpecification)
    if (PredictiveScalingMaxCapacityBehavior != null) __obj.updateDynamic("PredictiveScalingMaxCapacityBehavior")(PredictiveScalingMaxCapacityBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(PredictiveScalingMaxCapacityBuffer)) __obj.updateDynamic("PredictiveScalingMaxCapacityBuffer")(PredictiveScalingMaxCapacityBuffer)
    if (PredictiveScalingMode != null) __obj.updateDynamic("PredictiveScalingMode")(PredictiveScalingMode.asInstanceOf[js.Any])
    if (ScalingPolicyUpdateBehavior != null) __obj.updateDynamic("ScalingPolicyUpdateBehavior")(ScalingPolicyUpdateBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(ScheduledActionBufferTime)) __obj.updateDynamic("ScheduledActionBufferTime")(ScheduledActionBufferTime)
    __obj.asInstanceOf[ScalingInstruction]
  }
}

