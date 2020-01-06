package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAutoscalingplansMod {
  import typings.awsDashSdk.awsDashSdkStrings.TargetTrackingScaling
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

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
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - typings.awsDashSdk.awsDashSdkStrings.Minimum_
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Sum_
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
    - typings.awsDashSdk.awsDashSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity
    - typings.awsDashSdk.awsDashSdkStrings.ecsColonserviceColonDesiredCount
    - typings.awsDashSdk.awsDashSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.rdsColonclusterColonReadReplicaCount
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColonindexColonWriteCapacityUnits
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
    - typings.awsDashSdk.awsDashSdkStrings.Active_
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
    - typings.awsDashSdk.awsDashSdkStrings.Inactive_
    - typings.awsDashSdk.awsDashSdkStrings.PartiallyActive
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - java.lang.String
  */
  type ScalingStatusCode = _ScalingStatusCode | String
  type ScheduledActionBufferTime = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.autoscaling
    - typings.awsDashSdk.awsDashSdkStrings.ecs_
    - typings.awsDashSdk.awsDashSdkStrings.ec2_
    - typings.awsDashSdk.awsDashSdkStrings.rds_
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
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
