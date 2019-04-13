package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAutoscalingplansMod {
  type ApplicationSources = js.Array[ApplicationSource]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type Datapoints = js.Array[Datapoint]
  type DisableDynamicScaling = scala.Boolean
  type DisableScaleIn = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CapacityForecast
    - awsDashSdkLib.awsDashSdkLibStrings.LoadForecast
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduledActionMinCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.ScheduledActionMaxCapacity
    - java.lang.String
  */
  type ForecastDataType = _ForecastDataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASGTotalCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ASGTotalNetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.ASGTotalNetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.ALBTargetGroupRequestCount
    - java.lang.String
  */
  type LoadMetricType = _LoadMetricType | java.lang.String
  type MaxResults = scala.Double
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | java.lang.String
  type MetricUnit = java.lang.String
  type NextToken = java.lang.String
  type PolicyName = java.lang.String
  type PolicyType = awsDashSdkLib.awsDashSdkLibStrings.TargetTrackingScaling | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SetForecastCapacityToMaxCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.SetMaxCapacityToForecastCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.SetMaxCapacityAboveForecastCapacity
    - java.lang.String
  */
  type PredictiveScalingMaxCapacityBehavior = _PredictiveScalingMaxCapacityBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ForecastAndScale
    - awsDashSdkLib.awsDashSdkLibStrings.ForecastOnly
    - java.lang.String
  */
  type PredictiveScalingMode = _PredictiveScalingMode | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceLabel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`autoscaling:autoScalingGroup:DesiredCapacity`
    - awsDashSdkLib.awsDashSdkLibStrings.`ecs:service:DesiredCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`ec2:spot-fleet-request:TargetCapacity`
    - awsDashSdkLib.awsDashSdkLibStrings.`rds:cluster:ReadReplicaCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:ReadCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:WriteCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:ReadCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:WriteCapacityUnits`
    - java.lang.String
  */
  type ScalableDimension = _ScalableDimension | java.lang.String
  type ScalingInstructions = js.Array[ScalingInstruction]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.DynamoDBReadCapacityUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.DynamoDBWriteCapacityUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageMemoryUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget
    - awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageDatabaseConnections
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkOut
    - java.lang.String
  */
  type ScalingMetricType = _ScalingMetricType | java.lang.String
  type ScalingPlanName = java.lang.String
  type ScalingPlanNames = js.Array[ScalingPlanName]
  type ScalingPlanResources = js.Array[ScalingPlanResource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.ActiveWithProblems
    - awsDashSdkLib.awsDashSdkLibStrings.CreationInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.CreationFailed
    - awsDashSdkLib.awsDashSdkLibStrings.DeletionInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.DeletionFailed
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateFailed
    - java.lang.String
  */
  type ScalingPlanStatusCode = _ScalingPlanStatusCode | java.lang.String
  type ScalingPlanVersion = scala.Double
  type ScalingPlans = js.Array[ScalingPlan]
  type ScalingPolicies = js.Array[ScalingPolicy]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.KeepExternalPolicies
    - awsDashSdkLib.awsDashSdkLibStrings.ReplaceExternalPolicies
    - java.lang.String
  */
  type ScalingPolicyUpdateBehavior = _ScalingPolicyUpdateBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - awsDashSdkLib.awsDashSdkLibStrings.PartiallyActive
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - java.lang.String
  */
  type ScalingStatusCode = _ScalingStatusCode | java.lang.String
  type ScheduledActionBufferTime = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.autoscaling
    - awsDashSdkLib.awsDashSdkLibStrings.ecs
    - awsDashSdkLib.awsDashSdkLibStrings.ec2
    - awsDashSdkLib.awsDashSdkLibStrings.rds
    - awsDashSdkLib.awsDashSdkLibStrings.dynamodb
    - java.lang.String
  */
  type ServiceNamespace = _ServiceNamespace | java.lang.String
  type TagFilters = js.Array[TagFilter]
  type TagValues = js.Array[XmlStringMaxLen256]
  type TargetTrackingConfigurations = js.Array[TargetTrackingConfiguration]
  type TimestampType = stdLib.Date
  type XmlString = java.lang.String
  type XmlStringMaxLen128 = java.lang.String
  type XmlStringMaxLen256 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-01-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
