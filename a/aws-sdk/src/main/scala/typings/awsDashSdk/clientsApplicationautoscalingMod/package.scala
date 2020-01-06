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
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - typings.awsDashSdk.awsDashSdkStrings.Minimum_
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
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
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - typings.awsDashSdk.awsDashSdkStrings.Minimum_
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Sum_
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
    - typings.awsDashSdk.awsDashSdkStrings.AppStreamAverageCapacityUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ComprehendInferenceUtilization
    - typings.awsDashSdk.awsDashSdkStrings.LambdaProvisionedConcurrencyUtilization
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
    - typings.awsDashSdk.awsDashSdkStrings.ecsColonserviceColonDesiredCount
    - typings.awsDashSdk.awsDashSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typings.awsDashSdk.awsDashSdkStrings.elasticmapreduceColoninstancegroupColonInstanceCount
    - typings.awsDashSdk.awsDashSdkStrings.appstreamColonfleetColonDesiredCapacity
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - typings.awsDashSdk.awsDashSdkStrings.rdsColonclusterColonReadReplicaCount
    - typings.awsDashSdk.awsDashSdkStrings.sagemakerColonvariantColonDesiredInstanceCount
    - typings.awsDashSdk.awsDashSdkStrings.`custom-resourceColonResourceTypeColonProperty`
    - typings.awsDashSdk.awsDashSdkStrings.`comprehendColondocument-classifier-endpointColonDesiredInferenceUnits`
    - typings.awsDashSdk.awsDashSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
    - java.lang.String
  */
  type ScalableDimension = _ScalableDimension | String
  type ScalableTargets = js.Array[ScalableTarget]
  type ScalingActivities = js.Array[ScalingActivity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Successful_
    - typings.awsDashSdk.awsDashSdkStrings.Overridden_
    - typings.awsDashSdk.awsDashSdkStrings.Unfulfilled
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type ScalingActivityStatusCode = _ScalingActivityStatusCode | String
  type ScalingAdjustment = Double
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScalingSuspended = Boolean
  type ScheduledActionName = String
  type ScheduledActions = js.Array[ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ecs_
    - typings.awsDashSdk.awsDashSdkStrings.elasticmapreduce
    - typings.awsDashSdk.awsDashSdkStrings.ec2_
    - typings.awsDashSdk.awsDashSdkStrings.appstream
    - typings.awsDashSdk.awsDashSdkStrings.dynamodb
    - typings.awsDashSdk.awsDashSdkStrings.rds_
    - typings.awsDashSdk.awsDashSdkStrings.sagemaker_
    - typings.awsDashSdk.awsDashSdkStrings.`custom-resource`
    - typings.awsDashSdk.awsDashSdkStrings.comprehend
    - typings.awsDashSdk.awsDashSdkStrings.lambda__
    - java.lang.String
  */
  type ServiceNamespace = _ServiceNamespace | String
  type StepAdjustments = js.Array[StepAdjustment]
  type TimestampType = Date
  type XmlString = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-02-06`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
