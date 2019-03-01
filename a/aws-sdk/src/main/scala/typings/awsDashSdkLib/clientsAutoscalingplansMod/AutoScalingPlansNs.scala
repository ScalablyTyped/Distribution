package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/autoscalingplans", "AutoScalingPlans")
@js.native
object AutoScalingPlansNs extends js.Object {
  trait ApplicationSource extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
      */
    var CloudFormationStackARN: js.UndefOr[XmlString] = js.undefined
    /**
      * A set of tags (up to 50).
      */
    var TagFilters: js.UndefOr[TagFilters] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateScalingPlanRequest extends js.Object {
    /**
      * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
      */
    var ApplicationSource: ApplicationSource
    /**
      * The scaling instructions.
      */
    var ScalingInstructions: ScalingInstructions
    /**
      * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
      */
    var ScalingPlanName: ScalingPlanName
  }
  
  trait CreateScalingPlanResponse extends js.Object {
    /**
      * The version number of the scaling plan. This value is always 1. Currently, you cannot specify multiple scaling plan versions.
      */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  trait CustomizedLoadMetricSpecification extends js.Object {
    /**
      * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized load metric specification.
      */
    var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
    /**
      * The name of the metric.
      */
    var MetricName: MetricName
    /**
      * The namespace of the metric.
      */
    var Namespace: MetricNamespace
    /**
      * The statistic of the metric. Currently, the value must always be Sum. 
      */
    var Statistic: MetricStatistic
    /**
      * The unit of the metric.
      */
    var Unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  trait CustomizedScalingMetricSpecification extends js.Object {
    /**
      * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized scaling metric specification.
      */
    var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
    /**
      * The name of the metric.
      */
    var MetricName: MetricName
    /**
      * The namespace of the metric.
      */
    var Namespace: MetricNamespace
    /**
      * The statistic of the metric.
      */
    var Statistic: MetricStatistic
    /**
      * The unit of the metric. 
      */
    var Unit: js.UndefOr[MetricUnit] = js.undefined
  }
  
  trait Datapoint extends js.Object {
    /**
      * The time stamp for the data point in UTC format.
      */
    var Timestamp: js.UndefOr[TimestampType] = js.undefined
    /**
      * The value of the data point.
      */
    var Value: js.UndefOr[MetricScale] = js.undefined
  }
  
  trait DeleteScalingPlanRequest extends js.Object {
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  trait DeleteScalingPlanResponse extends js.Object
  
  trait DescribeScalingPlanResourcesRequest extends js.Object {
    /**
      * The maximum number of scalable resources to return. The value must be between 1 and 50. The default value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  trait DescribeScalingPlanResourcesResponse extends js.Object {
    /**
      * The token required to get the next set of results. This value is null if there are no more results to return.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the scalable resources.
      */
    var ScalingPlanResources: js.UndefOr[ScalingPlanResources] = js.undefined
  }
  
  trait DescribeScalingPlansRequest extends js.Object {
    /**
      * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
      */
    var ApplicationSources: js.UndefOr[ApplicationSources] = js.undefined
    /**
      * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token for the next set of results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
      */
    var ScalingPlanNames: js.UndefOr[ScalingPlanNames] = js.undefined
    /**
      * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
      */
    var ScalingPlanVersion: js.UndefOr[ScalingPlanVersion] = js.undefined
  }
  
  trait DescribeScalingPlansResponse extends js.Object {
    /**
      * The token required to get the next set of results. This value is null if there are no more results to return.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the scaling plans.
      */
    var ScalingPlans: js.UndefOr[ScalingPlans] = js.undefined
  }
  
  trait GetScalingPlanResourceForecastDataRequest extends js.Object {
    /**
      * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the start and end time is seven days.  Although this parameter can accept a date and time that is more than two days in the future, the availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
      */
    var EndTime: TimestampType
    /**
      * The type of forecast data to get.    LoadForecast: The load metric forecast.     CapacityForecast: The capacity forecast.     ScheduledActionMinCapacity: The minimum capacity for each scheduled scaling action. This data is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.    ScheduledActionMaxCapacity: The maximum capacity for each scheduled scaling action. The calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.  
      */
    var ForecastDataType: ForecastDataType
    /**
      * The ID of the resource. This string consists of the resource type and unique identifier.    Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
      */
    var ResourceId: XmlString
    /**
      * The scalable dimension for the resource.
      */
    var ScalableDimension: ScalableDimension
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
    /**
      * The namespace of the AWS service.
      */
    var ServiceNamespace: ServiceNamespace
    /**
      * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days before the current date and time. 
      */
    var StartTime: TimestampType
  }
  
  trait GetScalingPlanResourceForecastDataResponse extends js.Object {
    /**
      * The data points to return.
      */
    var Datapoints: Datapoints
  }
  
  trait MetricDimension extends js.Object {
    /**
      * The name of the dimension.
      */
    var Name: MetricDimensionName
    /**
      * The value of the dimension.
      */
    var Value: MetricDimensionValue
  }
  
  trait PredefinedLoadMetricSpecification extends js.Object {
    /**
      * The metric type.
      */
    var PredefinedLoadMetricType: LoadMetricType
    /**
      * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
      */
    var ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
  }
  
  trait PredefinedScalingMetricSpecification extends js.Object {
    /**
      * The metric type. The ALBRequestCountPerTarget metric type applies only to Auto Scaling groups, Spot Fleet requests, and ECS services.
      */
    var PredefinedScalingMetricType: ScalingMetricType
    /**
      * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
      */
    var ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
  }
  
  trait ScalingInstruction extends js.Object {
    /**
      * The customized load metric to use for predictive scaling. This parameter or a PredefinedLoadMetricSpecification is required when configuring predictive scaling, and cannot be used otherwise. 
      */
    var CustomizedLoadMetricSpecification: js.UndefOr[CustomizedLoadMetricSpecification] = js.undefined
    /**
      * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto Scaling creates target tracking scaling policies based on the specified target tracking configurations.  The default is enabled (false). 
      */
    var DisableDynamicScaling: js.UndefOr[DisableDynamicScaling] = js.undefined
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
    var PredefinedLoadMetricSpecification: js.UndefOr[PredefinedLoadMetricSpecification] = js.undefined
    /**
      * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource. The default value is SetForecastCapacityToMaxCapacity. The following are possible values:    SetForecastCapacityToMaxCapacity - AWS Auto Scaling cannot scale resource capacity higher than the maximum capacity. The maximum capacity is enforced as a hard limit.     SetMaxCapacityToForecastCapacity - AWS Auto Scaling may scale resource capacity higher than the maximum capacity to equal but not exceed forecast capacity.    SetMaxCapacityAboveForecastCapacity - AWS Auto Scaling may scale resource capacity higher than the maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra capacity if unexpected traffic occurs.    Only valid when configuring predictive scaling.
      */
    var PredictiveScalingMaxCapacityBehavior: js.UndefOr[PredictiveScalingMaxCapacityBehavior] = js.undefined
    /**
      * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the effective maximum capacity is 55. Only valid when configuring predictive scaling. Required if the PredictiveScalingMaxCapacityBehavior is set to SetMaxCapacityAboveForecastCapacity, and cannot be used otherwise. The range is 1-100.
      */
    var PredictiveScalingMaxCapacityBuffer: js.UndefOr[ResourceCapacity] = js.undefined
    /**
      * The predictive scaling mode. The default value is ForecastAndScale. Otherwise, AWS Auto Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast. 
      */
    var PredictiveScalingMode: js.UndefOr[PredictiveScalingMode] = js.undefined
    /**
      * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
      */
    var ResourceId: ResourceIdMaxLen1600
    /**
      * The scalable dimension associated with the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.  
      */
    var ScalableDimension: ScalableDimension
    /**
      * Controls whether a resource's externally created scaling policies are kept or replaced.  The default value is KeepExternalPolicies. If the parameter is set to ReplaceExternalPolicies, any scaling policies that are external to AWS Auto Scaling are deleted and new target tracking scaling policies created.  Only valid when configuring dynamic scaling.  Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
      */
    var ScalingPolicyUpdateBehavior: js.UndefOr[ScalingPolicyUpdateBehavior] = js.undefined
    /**
      * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required depends on several factors, such as the size of the instance and whether there are startup scripts to complete.  The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300 seconds.  Only valid when configuring predictive scaling. 
      */
    var ScheduledActionBufferTime: js.UndefOr[ScheduledActionBufferTime] = js.undefined
    /**
      * The namespace of the AWS service.
      */
    var ServiceNamespace: ServiceNamespace
    /**
      * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.  With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that provides the largest capacity for both scale in and scale out.  Condition: The scaling metric must be unique across target tracking configurations.
      */
    var TargetTrackingConfigurations: TargetTrackingConfigurations
  }
  
  trait ScalingPlan extends js.Object {
    /**
      * The application source.
      */
    var ApplicationSource: ApplicationSource
    /**
      * The Unix time stamp when the scaling plan was created.
      */
    var CreationTime: js.UndefOr[TimestampType] = js.undefined
    /**
      * The scaling instructions.
      */
    var ScalingInstructions: ScalingInstructions
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
    /**
      * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.    UpdateInProgress - The scaling plan is being updated.    UpdateFailed - The scaling plan could not be updated.  
      */
    var StatusCode: ScalingPlanStatusCode
    /**
      * A simple message about the current status of the scaling plan.
      */
    var StatusMessage: js.UndefOr[XmlString] = js.undefined
    /**
      * The Unix time stamp when the scaling plan entered the current status.
      */
    var StatusStartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  trait ScalingPlanResource extends js.Object {
    /**
      * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot Fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot Fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
      */
    var ResourceId: ResourceIdMaxLen1600
    /**
      * The scalable dimension for the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot Fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.  
      */
    var ScalableDimension: ScalableDimension
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
    /**
      * The scaling policies.
      */
    var ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
    /**
      * The scaling status of the resource.    Active - The scaling configuration is active.    Inactive - The scaling configuration is not active because the scaling plan is being created or the scaling configuration could not be applied. Check the status message for more information.    PartiallyActive - The scaling configuration is partially active because the scaling plan is being created or deleted or the scaling configuration could not be fully applied. Check the status message for more information.  
      */
    var ScalingStatusCode: ScalingStatusCode
    /**
      * A simple message about the current scaling status of the resource.
      */
    var ScalingStatusMessage: js.UndefOr[XmlString] = js.undefined
    /**
      * The namespace of the AWS service.
      */
    var ServiceNamespace: ServiceNamespace
  }
  
  trait ScalingPolicy extends js.Object {
    /**
      * The name of the scaling policy.
      */
    var PolicyName: PolicyName
    /**
      * The type of scaling policy.
      */
    var PolicyType: PolicyType
    /**
      * The target tracking scaling policy. Includes support for predefined or customized metrics.
      */
    var TargetTrackingConfiguration: js.UndefOr[TargetTrackingConfiguration] = js.undefined
  }
  
  trait TagFilter extends js.Object {
    /**
      * The tag key.
      */
    var Key: js.UndefOr[XmlStringMaxLen128] = js.undefined
    /**
      * The tag values (0 to 20).
      */
    var Values: js.UndefOr[TagValues] = js.undefined
  }
  
  trait TargetTrackingConfiguration extends js.Object {
    /**
      * A customized metric. You can specify either a predefined metric or a customized metric. 
      */
    var CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification] = js.undefined
    /**
      * Indicates whether scale in by the target tracking scaling policy is disabled. If the value is true, scale in is disabled and the target tracking scaling policy doesn't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking scaling policy can remove capacity from the scalable resource.  The default value is false.
      */
    var DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined
    /**
      * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This value is used only if the resource is an Auto Scaling group.
      */
    var EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined
    /**
      * A predefined metric. You can specify either a predefined metric or a customized metric.
      */
    var PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification] = js.undefined
    /**
      * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. This value is not used if the scalable resource is an Auto Scaling group. The cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale-out policy during the cooldown period after a scale-in, AWS Auto Scaling scales out your scalable target immediately.
      */
    var ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
      * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start. This value is not used if the scalable resource is an Auto Scaling group. While the cooldown period is in effect, the capacity that has been added by the previous scale-out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
      */
    var ScaleOutCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
      * The target value for the metric. The range is 8.515920e-109 to 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
      */
    var TargetValue: MetricScale
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a scaling plan.
      */
    def createScalingPlan(): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a scaling plan.
      */
    def createScalingPlan(params: CreateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createScalingPlan(
      params: CreateScalingPlanRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
      */
    def deleteScalingPlan(): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
      */
    def deleteScalingPlan(params: DeleteScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScalingPlan(
      params: DeleteScalingPlanRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the scalable resources in the specified scaling plan.
      */
    def describeScalingPlanResources(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlanResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPlanResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlanResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlanResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the scalable resources in the specified scaling plan.
      */
    def describeScalingPlanResources(params: DescribeScalingPlanResourcesRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlanResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPlanResources(
      params: DescribeScalingPlanResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlanResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlanResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your scaling plans.
      */
    def describeScalingPlans(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPlans(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlansResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your scaling plans.
      */
    def describeScalingPlans(params: DescribeScalingPlansRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPlans(
      params: DescribeScalingPlansRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlansResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
      */
    def getScalingPlanResourceForecastData(): awsDashSdkLib.libRequestMod.Request[GetScalingPlanResourceForecastDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getScalingPlanResourceForecastData(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetScalingPlanResourceForecastDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetScalingPlanResourceForecastDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
      */
    def getScalingPlanResourceForecastData(params: GetScalingPlanResourceForecastDataRequest): awsDashSdkLib.libRequestMod.Request[GetScalingPlanResourceForecastDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getScalingPlanResourceForecastData(
      params: GetScalingPlanResourceForecastDataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetScalingPlanResourceForecastDataResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetScalingPlanResourceForecastDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
      */
    def updateScalingPlan(): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
      */
    def updateScalingPlan(params: UpdateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateScalingPlan(
      params: UpdateScalingPlanRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateScalingPlanRequest extends js.Object {
    /**
      * A CloudFormation stack or set of tags.
      */
    var ApplicationSource: js.UndefOr[ApplicationSource] = js.undefined
    /**
      * The scaling instructions.
      */
    var ScalingInstructions: js.UndefOr[ScalingInstructions] = js.undefined
    /**
      * The name of the scaling plan.
      */
    var ScalingPlanName: ScalingPlanName
    /**
      * The version number of the scaling plan.
      */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  trait UpdateScalingPlanResponse extends js.Object
  
  trait _ForecastDataType extends js.Object
  
  trait _LoadMetricType extends js.Object
  
  trait _MetricStatistic extends js.Object
  
  trait _PredictiveScalingMaxCapacityBehavior extends js.Object
  
  trait _PredictiveScalingMode extends js.Object
  
  trait _ScalableDimension extends js.Object
  
  trait _ScalingMetricType extends js.Object
  
  trait _ScalingPlanStatusCode extends js.Object
  
  trait _ScalingPolicyUpdateBehavior extends js.Object
  
  trait _ScalingStatusCode extends js.Object
  
  trait _ServiceNamespace extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ApplicationSources = js.Array[ApplicationSource]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type Datapoints = js.Array[Datapoint]
  type DisableDynamicScaling = scala.Boolean
  type DisableScaleIn = scala.Boolean
  type ForecastDataType = _ForecastDataType | java.lang.String
  type LoadMetricType = _LoadMetricType | java.lang.String
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricStatistic = _MetricStatistic | java.lang.String
  type MetricUnit = java.lang.String
  type NextToken = java.lang.String
  type PolicyName = java.lang.String
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.TargetTrackingScaling | java.lang.String
  type PredictiveScalingMaxCapacityBehavior = _PredictiveScalingMaxCapacityBehavior | java.lang.String
  type PredictiveScalingMode = _PredictiveScalingMode | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceLabel = java.lang.String
  type ScalableDimension = _ScalableDimension | java.lang.String
  type ScalingInstructions = js.Array[ScalingInstruction]
  type ScalingMetricType = _ScalingMetricType | java.lang.String
  type ScalingPlanName = java.lang.String
  type ScalingPlanNames = js.Array[ScalingPlanName]
  type ScalingPlanResources = js.Array[ScalingPlanResource]
  type ScalingPlanStatusCode = _ScalingPlanStatusCode | java.lang.String
  type ScalingPlanVersion = scala.Double
  type ScalingPlans = js.Array[ScalingPlan]
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingPolicyUpdateBehavior = _ScalingPolicyUpdateBehavior | java.lang.String
  type ScalingStatusCode = _ScalingStatusCode | java.lang.String
  type ScheduledActionBufferTime = scala.Double
  type ServiceNamespace = _ServiceNamespace | java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagValues = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType = stdLib.Date
  type XmlString = java.lang.String
  type XmlStringMaxLen128 = java.lang.String
  type XmlStringMaxLen256 = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

