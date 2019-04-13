package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApplicationautoscalingMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ChangeInCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.PercentChangeInCapacity
    - awsDashSdkLib.awsDashSdkLibStrings.ExactCapacity
    - java.lang.String
  */
  type AdjustmentType = _AdjustmentType | java.lang.String
  type Alarms = js.Array[Alarm]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - java.lang.String
  */
  type MetricAggregationType = _MetricAggregationType | java.lang.String
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DynamoDBReadCapacityUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.DynamoDBWriteCapacityUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget
    - awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.RDSReaderAverageDatabaseConnections
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.EC2SpotFleetRequestAverageNetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.SageMakerVariantInvocationsPerInstance
    - awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ECSServiceAverageMemoryUtilization
    - java.lang.String
  */
  type MetricType = _MetricType | java.lang.String
  type MetricUnit = java.lang.String
  type MinAdjustmentMagnitude = scala.Double
  type PolicyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.StepScaling
    - awsDashSdkLib.awsDashSdkLibStrings.TargetTrackingScaling
    - java.lang.String
  */
  type PolicyType = _PolicyType | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceId = java.lang.String
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`ecs:service:DesiredCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`ec2:spot-fleet-request:TargetCapacity`
    - awsDashSdkLib.awsDashSdkLibStrings.`elasticmapreduce:instancegroup:InstanceCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`appstream:fleet:DesiredCapacity`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:ReadCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:table:WriteCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:ReadCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`dynamodb:index:WriteCapacityUnits`
    - awsDashSdkLib.awsDashSdkLibStrings.`rds:cluster:ReadReplicaCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`sagemaker:variant:DesiredInstanceCount`
    - awsDashSdkLib.awsDashSdkLibStrings.`custom-resource:ResourceType:Property`
    - java.lang.String
  */
  type ScalableDimension = _ScalableDimension | java.lang.String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - awsDashSdkLib.awsDashSdkLibStrings.Overridden
    - awsDashSdkLib.awsDashSdkLibStrings.Unfulfilled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type ScalingActivityStatusCode = _ScalingActivityStatusCode | java.lang.String
  type ScalingAdjustment = scala.Double
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionName = java.lang.String
  type ScheduledActions = js.Array[ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ecs
    - awsDashSdkLib.awsDashSdkLibStrings.elasticmapreduce
    - awsDashSdkLib.awsDashSdkLibStrings.ec2
    - awsDashSdkLib.awsDashSdkLibStrings.appstream
    - awsDashSdkLib.awsDashSdkLibStrings.dynamodb
    - awsDashSdkLib.awsDashSdkLibStrings.rds
    - awsDashSdkLib.awsDashSdkLibStrings.sagemaker
    - awsDashSdkLib.awsDashSdkLibStrings.`custom-resource`
    - java.lang.String
  */
  type ServiceNamespace = _ServiceNamespace | java.lang.String
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = stdLib.Date
  type XmlString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-02-06`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
