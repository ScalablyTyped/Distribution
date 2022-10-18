package typings.awsSdk.clientsAutoscalingplansMod

import typings.awsSdk.awsSdkStrings.TargetTrackingScaling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationSources = js.Array[ApplicationSource]

type Cooldown = Double

type Datapoints = js.Array[Datapoint]

type DisableDynamicScaling = Boolean

type DisableScaleIn = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CapacityForecast
  - typings.awsSdk.awsSdkStrings.LoadForecast
  - typings.awsSdk.awsSdkStrings.ScheduledActionMinCapacity
  - typings.awsSdk.awsSdkStrings.ScheduledActionMaxCapacity
  - java.lang.String
*/
type ForecastDataType = _ForecastDataType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGTotalNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGTotalNetworkOut
  - typings.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
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
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.SampleCount
  - typings.awsSdk.awsSdkStrings.Sum_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricUnit = String

type NextToken = String

type PolicyName = String

type PolicyType = TargetTrackingScaling | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SetForecastCapacityToMaxCapacity
  - typings.awsSdk.awsSdkStrings.SetMaxCapacityToForecastCapacity
  - typings.awsSdk.awsSdkStrings.SetMaxCapacityAboveForecastCapacity
  - java.lang.String
*/
type PredictiveScalingMaxCapacityBehavior = _PredictiveScalingMaxCapacityBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ForecastAndScale
  - typings.awsSdk.awsSdkStrings.ForecastOnly
  - java.lang.String
*/
type PredictiveScalingMode = _PredictiveScalingMode | String

type ResourceCapacity = Double

type ResourceIdMaxLen1600 = String

type ResourceLabel = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity
  - typings.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
  - typings.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
  - typings.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
  - typings.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
  - typings.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
  - typings.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
  - typings.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
  - java.lang.String
*/
type ScalableDimension = _ScalableDimension | String

type ScalingInstructions = js.Array[ScalingInstruction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typings.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
  - typings.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
  - typings.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
  - typings.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
  - typings.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
  - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
  - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
  - java.lang.String
*/
type ScalingMetricType = _ScalingMetricType | String

type ScalingPlanName = String

type ScalingPlanNames = js.Array[ScalingPlanName]

type ScalingPlanResources = js.Array[ScalingPlanResource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.ActiveWithProblems
  - typings.awsSdk.awsSdkStrings.CreationInProgress
  - typings.awsSdk.awsSdkStrings.CreationFailed
  - typings.awsSdk.awsSdkStrings.DeletionInProgress
  - typings.awsSdk.awsSdkStrings.DeletionFailed
  - typings.awsSdk.awsSdkStrings.UpdateInProgress
  - typings.awsSdk.awsSdkStrings.UpdateFailed
  - java.lang.String
*/
type ScalingPlanStatusCode = _ScalingPlanStatusCode | String

type ScalingPlanVersion = Double

type ScalingPlans = js.Array[ScalingPlan]

type ScalingPolicies = js.Array[ScalingPolicy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KeepExternalPolicies
  - typings.awsSdk.awsSdkStrings.ReplaceExternalPolicies
  - java.lang.String
*/
type ScalingPolicyUpdateBehavior = _ScalingPolicyUpdateBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Inactive_
  - typings.awsSdk.awsSdkStrings.PartiallyActive
  - typings.awsSdk.awsSdkStrings.Active_
  - java.lang.String
*/
type ScalingStatusCode = _ScalingStatusCode | String

type ScheduledActionBufferTime = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.autoscaling_
  - typings.awsSdk.awsSdkStrings.ecs_
  - typings.awsSdk.awsSdkStrings.ec2_
  - typings.awsSdk.awsSdkStrings.rds_
  - typings.awsSdk.awsSdkStrings.dynamodb
  - java.lang.String
*/
type ServiceNamespace = _ServiceNamespace | String

type TagFilters = js.Array[TagFilter]

type TagValues = js.Array[XmlStringMaxLen256]

type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]

type TimestampType = js.Date

type XmlString = String

type XmlStringMaxLen128 = String

type XmlStringMaxLen256 = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-01-06`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
