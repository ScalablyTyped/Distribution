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
         * The Amazon Resource Name (ARN) of a CloudFormation stack.
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
         * The version of the scaling plan. This value is always 1.
         */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  
  trait CustomizedScalingMetricSpecification extends js.Object {
    /**
         * The dimensions of the metric.
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
  
  
  trait DeleteScalingPlanRequest extends js.Object {
    /**
         * The name of the scaling plan.
         */
    var ScalingPlanName: ScalingPlanName
    /**
         * The version of the scaling plan.
         */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  
  trait DeleteScalingPlanResponse extends js.Object
  
  
  trait DescribeScalingPlanResourcesRequest extends js.Object {
    /**
         * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
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
         * The version of the scaling plan.
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
         * The version of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
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
  
  
  trait PredefinedScalingMetricSpecification extends js.Object {
    /**
         * The metric type. The ALBRequestCountPerTarget metric type applies only to Auto Scaling groups, Sport Fleet requests, and ECS services.
         */
    var PredefinedScalingMetricType: ScalingMetricType
    /**
         * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric type is ALBRequestCountPerTarget and there is a target group for an Application Load Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service. The format is app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:   app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN   targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.  
         */
    var ResourceLabel: js.UndefOr[ResourceLabel] = js.undefined
  }
  
  
  trait ScalingInstruction extends js.Object {
    /**
         * The maximum value to scale to in response to a scale out event.
         */
    var MaxCapacity: ResourceCapacity
    /**
         * The minimum value to scale to in response to a scale in event.
         */
    var MinCapacity: ResourceCapacity
    /**
         * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension associated with the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The namespace of the AWS service.
         */
    var ServiceNamespace: ServiceNamespace
    /**
         * The target tracking scaling policies (up to 10).
         */
    var TargetTrackingConfigurations: TargetTrackingConfigurations
  }
  
  
  trait ScalingPlan extends js.Object {
    /**
         * The application source.
         */
    var ApplicationSource: ApplicationSource
    /**
         * The Unix timestamp when the scaling plan was created.
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
         * The version of the scaling plan.
         */
    var ScalingPlanVersion: ScalingPlanVersion
    /**
         * The status of the scaling plan.    Active - The scaling plan is active.    ActiveWithProblems - The scaling plan is active, but the scaling configuration for one or more resources could not be applied.    CreationInProgress - The scaling plan is being created.    CreationFailed - The scaling plan could not be created.    DeletionInProgress - The scaling plan is being deleted.    DeletionFailed - The scaling plan could not be deleted.  
         */
    var StatusCode: ScalingPlanStatusCode
    /**
         * A simple message about the current status of the scaling plan.
         */
    var StatusMessage: js.UndefOr[XmlString] = js.undefined
    /**
         * The Unix timestamp when the scaling plan entered the current status.
         */
    var StatusStartTime: js.UndefOr[TimestampType] = js.undefined
  }
  
  
  trait ScalingPlanResource extends js.Object {
    /**
         * The ID of the resource. This string consists of the resource type and unique identifier.   Auto Scaling group - The resource type is autoScalingGroup and the unique identifier is the name of the Auto Scaling group. Example: autoScalingGroup/my-asg.   ECS service - The resource type is service and the unique identifier is the cluster name and service name. Example: service/default/sample-webapp.   Spot fleet request - The resource type is spot-fleet-request and the unique identifier is the Spot fleet request ID. Example: spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE.   DynamoDB table - The resource type is table and the unique identifier is the resource ID. Example: table/my-table.   DynamoDB global secondary index - The resource type is index and the unique identifier is the resource ID. Example: table/my-table/index/my-table-index.   Aurora DB cluster - The resource type is cluster and the unique identifier is the cluster name. Example: cluster:my-db-cluster.  
         */
    var ResourceId: ResourceIdMaxLen1600
    /**
         * The scalable dimension for the resource.    autoscaling:autoScalingGroup:DesiredCapacity - The desired capacity of an Auto Scaling group.    ecs:service:DesiredCount - The desired task count of an ECS service.    ec2:spot-fleet-request:TargetCapacity - The target capacity of a Spot fleet request.    dynamodb:table:ReadCapacityUnits - The provisioned read capacity for a DynamoDB table.    dynamodb:table:WriteCapacityUnits - The provisioned write capacity for a DynamoDB table.    dynamodb:index:ReadCapacityUnits - The provisioned read capacity for a DynamoDB global secondary index.    dynamodb:index:WriteCapacityUnits - The provisioned write capacity for a DynamoDB global secondary index.    rds:cluster:ReadReplicaCount - The count of Aurora Replicas in an Aurora DB cluster. Available for Aurora MySQL-compatible edition.  
         */
    var ScalableDimension: ScalableDimension
    /**
         * The name of the scaling plan.
         */
    var ScalingPlanName: ScalingPlanName
    /**
         * The version of the scaling plan.
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
         * The target tracking scaling policy.
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
         * A customized metric.
         */
    var CustomizedScalingMetricSpecification: js.UndefOr[CustomizedScalingMetricSpecification] = js.undefined
    /**
         * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is false.
         */
    var DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined
    /**
         * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics. This value is used only if the resource is an Auto Scaling group.
         */
    var EstimatedInstanceWarmup: js.UndefOr[Cooldown] = js.undefined
    /**
         * A predefined metric.
         */
    var PredefinedScalingMetricSpecification: js.UndefOr[PredefinedScalingMetricSpecification] = js.undefined
    /**
         * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start. This value is not used if the scalable resource is an Auto Scaling group. The cooldown period is used to block subsequent scale in requests until it has expired. The intention is to scale in conservatively to protect your application's availability. However, if another alarm triggers a scale out policy during the cooldown period after a scale-in, AWS Auto Scaling scales out your scalable target immediately.
         */
    var ScaleInCooldown: js.UndefOr[Cooldown] = js.undefined
    /**
         * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start. This value is not used if the scalable resource is an Auto Scaling group. While the cooldown period is in effect, the capacity that has been added by the previous scale out event that initiated the cooldown is calculated as part of the desired capacity for the next scale out. The intention is to continuously (but not excessively) scale out.
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
       * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
       */
    def createScalingPlan(): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
       */
    def createScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
       */
    def createScalingPlan(params: CreateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
       */
    def createScalingPlan(
      params: CreateScalingPlanRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scaling plan.
       */
    def deleteScalingPlan(): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scaling plan.
       */
    def deleteScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scaling plan.
       */
    def deleteScalingPlan(params: DeleteScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[DeleteScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified scaling plan.
       */
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
    /**
       * Describes the scalable resources in the specified scaling plan.
       */
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
    /**
       * Describes the scalable resources in the specified scaling plan.
       */
    def describeScalingPlanResources(
      params: DescribeScalingPlanResourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlanResourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlanResourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified scaling plans or all of your scaling plans.
       */
    def describeScalingPlans(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified scaling plans or all of your scaling plans.
       */
    def describeScalingPlans(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlansResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified scaling plans or all of your scaling plans.
       */
    def describeScalingPlans(params: DescribeScalingPlansRequest): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Describes the specified scaling plans or all of your scaling plans.
       */
    def describeScalingPlans(
      params: DescribeScalingPlansRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPlansResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPlansResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
       */
    def updateScalingPlan(): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
       */
    def updateScalingPlan(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateScalingPlanResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
       */
    def updateScalingPlan(params: UpdateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[UpdateScalingPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
       */
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
         * The version number.
         */
    var ScalingPlanVersion: ScalingPlanVersion
  }
  
  
  trait UpdateScalingPlanResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type ApplicationSources = js.Array[ApplicationSource]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  type MetricStatistic = awsDashSdkLib.awsDashSdkLibStrings.Average | awsDashSdkLib.awsDashSdkLibStrings.Minimum | awsDashSdkLib.awsDashSdkLibStrings.Maximum | awsDashSdkLib.awsDashSdkLibStrings.SampleCount | awsDashSdkLib.awsDashSdkLibStrings.Sum | java.lang.String
  type MetricUnit = java.lang.String
  type NextToken = java.lang.String
  type PolicyName = java.lang.String
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.TargetTrackingScaling | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceLabel = java.lang.String
  type ScalableDimension = awsDashSdkLib.awsDashSdkLibStrings.`autoscaling:autoScalingGroup:DesiredCapacity` | awsDashSdkLib.awsDashSdkLibStrings.`ecs:service:DesiredCount` | awsDashSdkLib.awsDashSdkLibStrings.`ec2:spot-fleet-request:TargetCapacity` | awsDashSdkLib.awsDashSdkLibStrings.`rds:cluster:ReadReplicaCount` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:ReadCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:WriteCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:ReadCapacityUnits` | awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:WriteCapacityUnits` | java.lang.String
  type ScalingInstructions = js.Array[ScalingInstruction]
  type ScalingMetricType = awsDashSdkLib.awsDashSdkLibStrings.ASGAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkIn | awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkOut | awsDashSdkLib.awsDashSdkLibStrings.DynamoDBReadCapacityUtilization | awsDashSdkLib.awsDashSdkLibStrings.DynamoDBWriteCapacityUtilization | awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageMemoryUtilization | awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget | awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageDatabaseConnections | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageCPUUtilization | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkIn | awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkOut | java.lang.String
  type ScalingPlanName = java.lang.String
  type ScalingPlanNames = js.Array[ScalingPlanName]
  type ScalingPlanResources = js.Array[ScalingPlanResource]
  type ScalingPlanStatusCode = awsDashSdkLib.awsDashSdkLibStrings.Active | awsDashSdkLib.awsDashSdkLibStrings.ActiveWithProblems | awsDashSdkLib.awsDashSdkLibStrings.CreationInProgress | awsDashSdkLib.awsDashSdkLibStrings.CreationFailed | awsDashSdkLib.awsDashSdkLibStrings.DeletionInProgress | awsDashSdkLib.awsDashSdkLibStrings.DeletionFailed | awsDashSdkLib.awsDashSdkLibStrings.UpdateInProgress | awsDashSdkLib.awsDashSdkLibStrings.UpdateFailed | java.lang.String
  type ScalingPlanVersion = scala.Double
  type ScalingPlans = js.Array[ScalingPlan]
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingStatusCode = awsDashSdkLib.awsDashSdkLibStrings.Inactive | awsDashSdkLib.awsDashSdkLibStrings.PartiallyActive | awsDashSdkLib.awsDashSdkLibStrings.Active | java.lang.String
  type ServiceNamespace = awsDashSdkLib.awsDashSdkLibStrings.autoscaling | awsDashSdkLib.awsDashSdkLibStrings.ecs | awsDashSdkLib.awsDashSdkLibStrings.ec2 | awsDashSdkLib.awsDashSdkLibStrings.rds | awsDashSdkLib.awsDashSdkLibStrings.dynamodb | java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagValues = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType = stdLib.Date
  type XmlString = java.lang.String
  type XmlStringMaxLen128 = java.lang.String
  type XmlStringMaxLen256 = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-01-06` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

