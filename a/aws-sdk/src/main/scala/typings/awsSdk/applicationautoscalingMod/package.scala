package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object applicationautoscalingMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ChangeInCapacity
    - typings.awsSdk.awsSdkStrings.PercentChangeInCapacity
    - typings.awsSdk.awsSdkStrings.ExactCapacity
    - java.lang.String
  */
  type AdjustmentType = typings.awsSdk.applicationautoscalingMod._AdjustmentType | java.lang.String
  type Alarms = js.Array[typings.awsSdk.applicationautoscalingMod.Alarm]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.applicationautoscalingMod.ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.Minimum_
    - typings.awsSdk.awsSdkStrings.Maximum_
    - java.lang.String
  */
  type MetricAggregationType = typings.awsSdk.applicationautoscalingMod._MetricAggregationType | java.lang.String
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[typings.awsSdk.applicationautoscalingMod.MetricDimension]
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
  type MetricStatistic = typings.awsSdk.applicationautoscalingMod._MetricStatistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DynamoDBReadCapacityUtilization
    - typings.awsSdk.awsSdkStrings.DynamoDBWriteCapacityUtilization
    - typings.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - typings.awsSdk.awsSdkStrings.RDSReaderAverageCPUUtilization
    - typings.awsSdk.awsSdkStrings.RDSReaderAverageDatabaseConnections
    - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageCPUUtilization
    - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkIn
    - typings.awsSdk.awsSdkStrings.EC2SpotFleetRequestAverageNetworkOut
    - typings.awsSdk.awsSdkStrings.SageMakerVariantInvocationsPerInstance
    - typings.awsSdk.awsSdkStrings.ECSServiceAverageCPUUtilization
    - typings.awsSdk.awsSdkStrings.ECSServiceAverageMemoryUtilization
    - typings.awsSdk.awsSdkStrings.AppStreamAverageCapacityUtilization
    - typings.awsSdk.awsSdkStrings.ComprehendInferenceUtilization
    - typings.awsSdk.awsSdkStrings.LambdaProvisionedConcurrencyUtilization
    - typings.awsSdk.awsSdkStrings.CassandraReadCapacityUtilization
    - typings.awsSdk.awsSdkStrings.CassandraWriteCapacityUtilization
    - java.lang.String
  */
  type MetricType = typings.awsSdk.applicationautoscalingMod._MetricType | java.lang.String
  type MetricUnit = java.lang.String
  type MinAdjustmentMagnitude = scala.Double
  type PolicyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.StepScaling
    - typings.awsSdk.awsSdkStrings.TargetTrackingScaling
    - java.lang.String
  */
  type PolicyType = typings.awsSdk.applicationautoscalingMod._PolicyType | java.lang.String
  type ResourceCapacity = scala.Double
  type ResourceId = java.lang.String
  type ResourceIdMaxLen1600 = java.lang.String
  type ResourceIdsMaxLen1600 = js.Array[typings.awsSdk.applicationautoscalingMod.ResourceIdMaxLen1600]
  type ResourceLabel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
    - typings.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
    - typings.awsSdk.awsSdkStrings.elasticmapreduceColoninstancegroupColonInstanceCount
    - typings.awsSdk.awsSdkStrings.appstreamColonfleetColonDesiredCapacity
    - typings.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
    - typings.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
    - typings.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
    - typings.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
    - typings.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
    - typings.awsSdk.awsSdkStrings.sagemakerColonvariantColonDesiredInstanceCount
    - typings.awsSdk.awsSdkStrings.`custom-resourceColonResourceTypeColonProperty`
    - typings.awsSdk.awsSdkStrings.`comprehendColondocument-classifier-endpointColonDesiredInferenceUnits`
    - typings.awsSdk.awsSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
    - typings.awsSdk.awsSdkStrings.cassandraColontableColonReadCapacityUnits
    - typings.awsSdk.awsSdkStrings.cassandraColontableColonWriteCapacityUnits
    - java.lang.String
  */
  type ScalableDimension = typings.awsSdk.applicationautoscalingMod._ScalableDimension | java.lang.String
  type ScalableTargets = js.Array[typings.awsSdk.applicationautoscalingMod.ScalableTarget]
  type ScalingActivities = js.Array[typings.awsSdk.applicationautoscalingMod.ScalingActivity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Overridden_
    - typings.awsSdk.awsSdkStrings.Unfulfilled
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ScalingActivityStatusCode = typings.awsSdk.applicationautoscalingMod._ScalingActivityStatusCode | java.lang.String
  type ScalingAdjustment = scala.Double
  type ScalingPolicies = js.Array[typings.awsSdk.applicationautoscalingMod.ScalingPolicy]
  type ScalingSuspended = scala.Boolean
  type ScheduledActionName = java.lang.String
  type ScheduledActions = js.Array[typings.awsSdk.applicationautoscalingMod.ScheduledAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ecs_
    - typings.awsSdk.awsSdkStrings.elasticmapreduce
    - typings.awsSdk.awsSdkStrings.ec2_
    - typings.awsSdk.awsSdkStrings.appstream
    - typings.awsSdk.awsSdkStrings.dynamodb
    - typings.awsSdk.awsSdkStrings.rds_
    - typings.awsSdk.awsSdkStrings.sagemaker_
    - typings.awsSdk.awsSdkStrings.`custom-resource`
    - typings.awsSdk.awsSdkStrings.comprehend
    - typings.awsSdk.awsSdkStrings.lambda__
    - typings.awsSdk.awsSdkStrings.cassandra
    - java.lang.String
  */
  type ServiceNamespace = typings.awsSdk.applicationautoscalingMod._ServiceNamespace | java.lang.String
  type StepAdjustments = js.Array[typings.awsSdk.applicationautoscalingMod.StepAdjustment]
  type TimestampType = typings.std.Date
  type XmlString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-02-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.applicationautoscalingMod._apiVersion | java.lang.String
}
