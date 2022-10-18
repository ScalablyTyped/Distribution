package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ChangeInCapacity
  - typings.awsSdk.awsSdkStrings.PercentChangeInCapacity
  - typings.awsSdk.awsSdkStrings.ExactCapacity
  - java.lang.String
*/
type AdjustmentType = _AdjustmentType | String

type Alarms = js.Array[Alarm]

type Cooldown = Double

type DisableScaleIn = Boolean

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
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
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.SampleCount
  - typings.awsSdk.awsSdkStrings.Sum_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

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
  - typings.awsSdk.awsSdkStrings.KafkaBrokerStorageUtilization
  - typings.awsSdk.awsSdkStrings.ElastiCachePrimaryEngineCPUUtilization
  - typings.awsSdk.awsSdkStrings.ElastiCacheReplicaEngineCPUUtilization
  - typings.awsSdk.awsSdkStrings.ElastiCacheDatabaseMemoryUsageCountedForEvictPercentage
  - typings.awsSdk.awsSdkStrings.NeptuneReaderAverageCPUUtilization
  - java.lang.String
*/
type MetricType = _MetricType | String

type MetricUnit = String

type MinAdjustmentMagnitude = Double

type PolicyName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.StepScaling
  - typings.awsSdk.awsSdkStrings.TargetTrackingScaling
  - java.lang.String
*/
type PolicyType = _PolicyType | String

type ResourceCapacity = Double

type ResourceId = String

type ResourceIdMaxLen1600 = String

type ResourceIdsMaxLen1600 = js.Array[ResourceIdMaxLen1600]

type ResourceLabel = String

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
  - / * comprehend:document-classifier-endpoint:DesiredInferenceUnits * / java.lang.String
  - typings.awsSdk.awsSdkStrings.`comprehendColonentity-recognizer-endpointColonDesiredInferenceUnits`
  - typings.awsSdk.awsSdkStrings.lambdaColonfunctionColonProvisionedConcurrency
  - typings.awsSdk.awsSdkStrings.cassandraColontableColonReadCapacityUnits
  - typings.awsSdk.awsSdkStrings.cassandraColontableColonWriteCapacityUnits
  - typings.awsSdk.awsSdkStrings.`kafkaColonbroker-storageColonVolumeSize`
  - typings.awsSdk.awsSdkStrings.`elasticacheColonreplication-groupColonNodeGroups`
  - typings.awsSdk.awsSdkStrings.`elasticacheColonreplication-groupColonReplicas`
  - typings.awsSdk.awsSdkStrings.neptuneColonclusterColonReadReplicaCount
*/
type ScalableDimension = _ScalableDimension | (/* comprehend:document-classifier-endpoint:DesiredInferenceUnits */ String)

type ScalableTargets = js.Array[ScalableTarget]

type ScalingActivities = js.Array[ScalingActivity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Overridden_
  - typings.awsSdk.awsSdkStrings.Unfulfilled
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type ScalingActivityStatusCode = _ScalingActivityStatusCode | String

type ScalingAdjustment = Double

type ScalingPolicies = js.Array[ScalingPolicy]

type ScalingSuspended = Boolean

type ScheduledActionName = String

type ScheduledActions = js.Array[ScheduledAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ecs_
  - typings.awsSdk.awsSdkStrings.elasticmapreduce
  - typings.awsSdk.awsSdkStrings.ec2_
  - typings.awsSdk.awsSdkStrings.appstream_
  - typings.awsSdk.awsSdkStrings.dynamodb
  - typings.awsSdk.awsSdkStrings.rds_
  - typings.awsSdk.awsSdkStrings.sagemaker__
  - typings.awsSdk.awsSdkStrings.`custom-resource`
  - typings.awsSdk.awsSdkStrings.comprehend
  - typings.awsSdk.awsSdkStrings.lambda__
  - typings.awsSdk.awsSdkStrings.cassandra
  - typings.awsSdk.awsSdkStrings.kafka_
  - typings.awsSdk.awsSdkStrings.elasticache
  - typings.awsSdk.awsSdkStrings.neptune
  - java.lang.String
*/
type ServiceNamespace = _ServiceNamespace | String

type StepAdjustments = js.Array[StepAdjustment]

type TimestampType = js.Date

type XmlString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-02-06`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
