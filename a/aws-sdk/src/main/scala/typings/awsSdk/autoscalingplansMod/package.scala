package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object autoscalingplansMod {
  
  type ApplicationSources = js.Array[typings.awsSdk.autoscalingplansMod.ApplicationSource]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.autoscalingplansMod.ClientApiVersions
  
  type Cooldown = scala.Double
  
  type Datapoints = js.Array[typings.awsSdk.autoscalingplansMod.Datapoint]
  
  type DisableDynamicScaling = scala.Boolean
  
  type DisableScaleIn = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CapacityForecast
    - typings.awsSdk.awsSdkStrings.LoadForecast
    - typings.awsSdk.awsSdkStrings.ScheduledActionMinCapacity
    - typings.awsSdk.awsSdkStrings.ScheduledActionMaxCapacity
    - java.lang.String
  */
  type ForecastDataType = typings.awsSdk.autoscalingplansMod._ForecastDataType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
    - typings.awsSdk.awsSdkStrings.ASGTotalNetworkIn
    - typings.awsSdk.awsSdkStrings.ASGTotalNetworkOut
    - typings.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
    - java.lang.String
  */
  type LoadMetricType = typings.awsSdk.autoscalingplansMod._LoadMetricType | java.lang.String
  
  type MaxResults = scala.Double
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensions = js.Array[typings.awsSdk.autoscalingplansMod.MetricDimension]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricScale = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.Minimum_
    - typings.awsSdk.awsSdkStrings.Maximum_
    - typings.awsSdk.awsSdkStrings.SampleCount
    - typings.awsSdk.awsSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = typings.awsSdk.autoscalingplansMod._MetricStatistic | java.lang.String
  
  type MetricUnit = java.lang.String
  
  type NextToken = java.lang.String
  
  type PolicyName = java.lang.String
  
  type PolicyType = typings.awsSdk.awsSdkStrings.TargetTrackingScaling | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SetForecastCapacityToMaxCapacity
    - typings.awsSdk.awsSdkStrings.SetMaxCapacityToForecastCapacity
    - typings.awsSdk.awsSdkStrings.SetMaxCapacityAboveForecastCapacity
    - java.lang.String
  */
  type PredictiveScalingMaxCapacityBehavior = typings.awsSdk.autoscalingplansMod._PredictiveScalingMaxCapacityBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ForecastAndScale
    - typings.awsSdk.awsSdkStrings.ForecastOnly
    - java.lang.String
  */
  type PredictiveScalingMode = typings.awsSdk.autoscalingplansMod._PredictiveScalingMode | java.lang.String
  
  type ResourceCapacity = scala.Double
  
  type ResourceIdMaxLen1600 = java.lang.String
  
  type ResourceLabel = java.lang.String
  
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
  type ScalableDimension = typings.awsSdk.autoscalingplansMod._ScalableDimension | java.lang.String
  
  type ScalingInstructions = js.Array[typings.awsSdk.autoscalingplansMod.ScalingInstruction]
  
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
  type ScalingMetricType = typings.awsSdk.autoscalingplansMod._ScalingMetricType | java.lang.String
  
  type ScalingPlanName = java.lang.String
  
  type ScalingPlanNames = js.Array[typings.awsSdk.autoscalingplansMod.ScalingPlanName]
  
  type ScalingPlanResources = js.Array[typings.awsSdk.autoscalingplansMod.ScalingPlanResource]
  
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
  type ScalingPlanStatusCode = typings.awsSdk.autoscalingplansMod._ScalingPlanStatusCode | java.lang.String
  
  type ScalingPlanVersion = scala.Double
  
  type ScalingPlans = js.Array[typings.awsSdk.autoscalingplansMod.ScalingPlan]
  
  type ScalingPolicies = js.Array[typings.awsSdk.autoscalingplansMod.ScalingPolicy]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KeepExternalPolicies
    - typings.awsSdk.awsSdkStrings.ReplaceExternalPolicies
    - java.lang.String
  */
  type ScalingPolicyUpdateBehavior = typings.awsSdk.autoscalingplansMod._ScalingPolicyUpdateBehavior | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Inactive_
    - typings.awsSdk.awsSdkStrings.PartiallyActive
    - typings.awsSdk.awsSdkStrings.Active_
    - java.lang.String
  */
  type ScalingStatusCode = typings.awsSdk.autoscalingplansMod._ScalingStatusCode | java.lang.String
  
  type ScheduledActionBufferTime = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.autoscaling_
    - typings.awsSdk.awsSdkStrings.ecs_
    - typings.awsSdk.awsSdkStrings.ec2_
    - typings.awsSdk.awsSdkStrings.rds_
    - typings.awsSdk.awsSdkStrings.dynamodb
    - java.lang.String
  */
  type ServiceNamespace = typings.awsSdk.autoscalingplansMod._ServiceNamespace | java.lang.String
  
  type TagFilters = js.Array[typings.awsSdk.autoscalingplansMod.TagFilter]
  
  type TagValues = js.Array[typings.awsSdk.autoscalingplansMod.XmlStringMaxLen256]
  
  type TargetTrackingConfigurations = js.Array[typings.awsSdk.autoscalingplansMod.TargetTrackingConfiguration]
  
  type TimestampType = typings.std.Date
  
  type XmlString = java.lang.String
  
  type XmlStringMaxLen128 = java.lang.String
  
  type XmlStringMaxLen256 = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-01-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.autoscalingplansMod._apiVersion | java.lang.String
}
