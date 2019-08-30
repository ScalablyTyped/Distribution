package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApplicationautoscalingMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ChangeInCapacity
    - typings.awsDashSdk.awsDashSdkStrings.PercentChangeInCapacity
    - typings.awsDashSdk.awsDashSdkStrings.ExactCapacity
    - java.lang.String
  */
  type AdjustmentType = _AdjustmentType | String
  type Alarms = js.Array[Alarm]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = Double
  type DisableScaleIn = Boolean
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Average
    - typings.awsDashSdk.awsDashSdkStrings.Minimum
    - typings.awsDashSdk.awsDashSdkStrings.Maximum
    - java.lang.String
  */
  type MetricAggregationType = _MetricAggregationType | String
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
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DynamoDBReadCapacityUtilization
    - typings.awsDashSdk.awsDashSdkStrings.DynamoDBWriteCapacityUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ALBRequestCountPerTarget
    - typings.awsDashSdk.awsDashSdkStrings.RDSReaderAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.RDSReaderAverageDatabaseConnections
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - typings.awsDashSdk.awsDashSdkStrings.SageMakerVariantInvocationsPerInstance
    - typings.awsDashSdk.awsDashSdkStrings.ECSServiceAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ECSServiceAverageMemoryUtilization
    - java.lang.String
  */
  type MetricType = _MetricType | String
  type MetricUnit = String
  type MinAdjustmentMagnitude = Double
  type PolicyName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.StepScaling
    - typings.awsDashSdk.awsDashSdkStrings.TargetTrackingScaling
    - java.lang.String
  */
  type PolicyType = _PolicyType | String
  type ResourceCapacity = Double
  type ResourceId = String
  type ResourceIdMaxLen1600 = String
  type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]
  type ResourceLabel = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`ecs:service:DesiredCount`
    - typings.awsDashSdk.awsDashSdkStrings.`ec2:spot-fleet-request:TargetCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.`elasticmapreduce:instancegroup:InstanceCount`
    - typings.awsDashSdk.awsDashSdkStrings.`appstream:fleet:DesiredCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:table:ReadCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:table:WriteCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:index:ReadCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`dynamodb:index:WriteCapacityUnits`
    - typings.awsDashSdk.awsDashSdkStrings.`rds:cluster:ReadReplicaCount`
    - typings.awsDashSdk.awsDashSdkStrings.`sagemaker:variant:DesiredInstanceCount`
    - typings.awsDashSdk.awsDashSdkStrings.`custom-resource:ResourceType:Property`
    - java.lang.String
  */
  type ScalableDimension = _ScalableDimension | String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Successful
    - typings.awsDashSdk.awsDashSdkStrings.Overridden
    - typings.awsDashSdk.awsDashSdkStrings.Unfulfilled
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type ScalingActivityStatusCode = _ScalingActivityStatusCode | String
  type ScalingAdjustment = Double
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingSuspended = Boolean
  type ScheduledActionName = String
  type ScheduledActions = js.Array[ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ecs
    - typings.awsDashSdk.awsDashSdkStrings.elasticmapreduce
    - typings.awsDashSdk.awsDashSdkStrings.ec2
    - typings.awsDashSdk.awsDashSdkStrings.appstream
    - typings.awsDashSdk.awsDashSdkStrings.dynamodb
    - typings.awsDashSdk.awsDashSdkStrings.rds
    - typings.awsDashSdk.awsDashSdkStrings.sagemaker
    - typings.awsDashSdk.awsDashSdkStrings.`custom-resource`
    - java.lang.String
  */
  type ServiceNamespace = _ServiceNamespace | String
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = Date
  type XmlString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-02-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
