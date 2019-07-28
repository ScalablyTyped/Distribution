package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.TargetTrackingScaling
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAutoscalingplansMod {
  type ApplicationSources = js.Array[ApplicationSource]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = Double
  type Datapoints = js.Array[Datapoint]
  type DisableDynamicScaling = Boolean
  type DisableScaleIn = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CapacityForecast
    - typings.awsDashSdk.awsDashSdkStrings.LoadForecast
    - typings.awsDashSdk.awsDashSdkStrings.ScheduledActionMinCapacity
    - typings.awsDashSdk.awsDashSdkStrings.ScheduledActionMaxCapacity
    - java.lang.String
  */
  type ForecastDataType = _ForecastDataType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASGTotalCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ASGTotalNetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.ASGTotalNetworkOut
    - typings.awsDashSdk.awsDashSdkStrings.ALBTargetGroupRequestCount
    - java.lang.String
  */
  type LoadMetricType = _LoadMetricType | String
  type MaxResults = Double
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Average
    - typings.awsDashSdk.awsDashSdkStrings.Minimum
    - typings.awsDashSdk.awsDashSdkStrings.Maximum
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Sum
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | String
  type MetricUnit = String
  type NextToken = String
  type PolicyName = String
  type PolicyType = TargetTrackingScaling | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SetForecastCapacityToMaxCapacity
    - typings.awsDashSdk.awsDashSdkStrings.SetMaxCapacityToForecastCapacity
    - typings.awsDashSdk.awsDashSdkStrings.SetMaxCapacityAboveForecastCapacity
    - java.lang.String
  */
  type PredictiveScalingMaxCapacityBehavior = _PredictiveScalingMaxCapacityBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ForecastAndScale
    - typings.awsDashSdk.awsDashSdkStrings.ForecastOnly
    - java.lang.String
  */
  type PredictiveScalingMode = _PredictiveScalingMode | String
  type ResourceCapacity = Double
  type ResourceIdMaxLen1600 = String
  type ResourceLabel = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`autoscaling:autoScalingGroup:DesiredCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.`ecs:service:DesiredCount`
    - typings.awsDashSdk.awsDashSdkStrings.`ec2:spot-fleet-request:TargetCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.`rds:cluster:ReadReplicaCount`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:table:ReadCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:table:WriteCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:index:ReadCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:index:WriteCapacityUnits`
    - java.lang.String
  */
  type ScalableDimension = _ScalableDimension | String
  type ScalingInstructions = js.Array[ScalingInstruction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageNetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageNetworkOut
    - typings.awsDashSdk.awsDashSdkStrings.DynamoDBReadCapacityUtilization
    - typings.awsDashSdk.awsDashSdkStrings.DynamoDBWriteCapacityUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ECSServiceAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ECSServiceAverageMemoryUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ALBRequestCountPerTarget
    - typings.awsDashSdk.awsDashSdkStrings.RDSReaderAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.RDSReaderAverageDatabaseConnections
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - java.lang.String
  */
  type ScalingMetricType = _ScalingMetricType | String
  type ScalingPlanName = String
  type ScalingPlanNames = js.Array[ScalingPlanName]
  type ScalingPlanResources = js.Array[ScalingPlanResource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.ActiveWithProblems
    - typings.awsDashSdk.awsDashSdkStrings.CreationInProgress
    - typings.awsDashSdk.awsDashSdkStrings.CreationFailed
    - typings.awsDashSdk.awsDashSdkStrings.DeletionInProgress
    - typings.awsDashSdk.awsDashSdkStrings.DeletionFailed
    - typings.awsDashSdk.awsDashSdkStrings.UpdateInProgress
    - typings.awsDashSdk.awsDashSdkStrings.UpdateFailed
    - java.lang.String
  */
  type ScalingPlanStatusCode = _ScalingPlanStatusCode | String
  type ScalingPlanVersion = Double
  type ScalingPlans = js.Array[ScalingPlan]
  type ScalingPolicies = js.Array[ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.KeepExternalPolicies
    - typings.awsDashSdk.awsDashSdkStrings.ReplaceExternalPolicies
    - java.lang.String
  */
  type ScalingPolicyUpdateBehavior = _ScalingPolicyUpdateBehavior | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Inactive
    - typings.awsDashSdk.awsDashSdkStrings.PartiallyActive
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - java.lang.String
  */
  type ScalingStatusCode = _ScalingStatusCode | String
  type ScheduledActionBufferTime = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.autoscaling
    - typings.awsDashSdk.awsDashSdkStrings.ecs
    - typings.awsDashSdk.awsDashSdkStrings.ec2
    - typings.awsDashSdk.awsDashSdkStrings.rds
    - typings.awsDashSdk.awsDashSdkStrings.dynamodb
    - java.lang.String
  */
  type ServiceNamespace = _ServiceNamespace | String
  type TagFilters = js.Array[TagFilter]
  type TagValues = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType = Date
  type XmlString = String
  type XmlStringMaxLen128 = String
  type XmlStringMaxLen256 = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-01-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
