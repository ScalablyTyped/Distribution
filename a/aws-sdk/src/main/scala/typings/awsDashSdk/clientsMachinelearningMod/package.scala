package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMachinelearningMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.sgd
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Algorithm = sgd | String
  type AwsUserArn = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreatedAt
    - typings.awsDashSdk.awsDashSdkStrings.LastUpdatedAt
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.IAMUser
    - typings.awsDashSdk.awsDashSdkStrings.MLModelId
    - typings.awsDashSdk.awsDashSdkStrings.DataSourceId
    - typings.awsDashSdk.awsDashSdkStrings.DataURI
    - java.lang.String
  */
  type BatchPredictionFilterVariable = _BatchPredictionFilterVariable | String
  type BatchPredictions = js.Array[BatchPrediction]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ComparatorValue = String
  type ComputeStatistics = Boolean
  type DataRearrangement = String
  type DataSchema = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreatedAt
    - typings.awsDashSdk.awsDashSdkStrings.LastUpdatedAt
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.DataLocationS3
    - typings.awsDashSdk.awsDashSdkStrings.IAMUser
    - java.lang.String
  */
  type DataSourceFilterVariable = _DataSourceFilterVariable | String
  type DataSources = js.Array[DataSource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PredictiveModelType
    - typings.awsDashSdk.awsDashSdkStrings.Algorithm
    - java.lang.String
  */
  type DetailsAttributes = _DetailsAttributes | String
  type DetailsMap = StringDictionary[DetailsValue]
  type DetailsValue = String
  type EDPPipelineId = String
  type EDPResourceRole = String
  type EDPSecurityGroupId = String
  type EDPSecurityGroupIds = js.Array[EDPSecurityGroupId]
  type EDPServiceRole = String
  type EDPSubnetId = String
  type EntityId = String
  type EntityName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.INPROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type EntityStatus = _EntityStatus | String
  type EpochTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreatedAt
    - typings.awsDashSdk.awsDashSdkStrings.LastUpdatedAt
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.IAMUser
    - typings.awsDashSdk.awsDashSdkStrings.MLModelId
    - typings.awsDashSdk.awsDashSdkStrings.DataSourceId
    - typings.awsDashSdk.awsDashSdkStrings.DataURI
    - java.lang.String
  */
  type EvaluationFilterVariable = _EvaluationFilterVariable | String
  type Evaluations = js.Array[Evaluation]
  type IntegerType = Double
  type Label = String
  type LongType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreatedAt
    - typings.awsDashSdk.awsDashSdkStrings.LastUpdatedAt
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.IAMUser
    - typings.awsDashSdk.awsDashSdkStrings.TrainingDataSourceId
    - typings.awsDashSdk.awsDashSdkStrings.RealtimeEndpointStatus
    - typings.awsDashSdk.awsDashSdkStrings.MLModelType
    - typings.awsDashSdk.awsDashSdkStrings.Algorithm
    - typings.awsDashSdk.awsDashSdkStrings.TrainingDataURI
    - java.lang.String
  */
  type MLModelFilterVariable = _MLModelFilterVariable | String
  type MLModelName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGRESSION
    - typings.awsDashSdk.awsDashSdkStrings.BINARY
    - typings.awsDashSdk.awsDashSdkStrings.MULTICLASS
    - java.lang.String
  */
  type MLModelType = _MLModelType | String
  type MLModels = js.Array[MLModel]
  type Message = String
  type PageLimit = Double
  type PerformanceMetricsProperties = StringDictionary[PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey = String
  type PerformanceMetricsPropertyValue = String
  type PresignedS3Url = String
  type RDSDatabaseName = String
  type RDSDatabasePassword = String
  type RDSDatabaseUsername = String
  type RDSInstanceIdentifier = String
  type RDSSelectSqlQuery = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RealtimeEndpointStatus = _RealtimeEndpointStatus | String
  type Recipe = String
  type Record = StringDictionary[VariableValue]
  type RedshiftClusterIdentifier = String
  type RedshiftDatabaseName = String
  type RedshiftDatabasePassword = String
  type RedshiftDatabaseUsername = String
  type RedshiftSelectSqlQuery = String
  type RoleARN = String
  type S3Url = String
  type ScoreThreshold = Double
  type ScoreValue = Double
  type ScoreValuePerLabelMap = StringDictionary[ScoreValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.asc
    - typings.awsDashSdk.awsDashSdkStrings.dsc
    - java.lang.String
  */
  type SortOrder = _SortOrder | String
  type StringType = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BatchPrediction
    - typings.awsDashSdk.awsDashSdkStrings.DataSource
    - typings.awsDashSdk.awsDashSdkStrings.Evaluation
    - typings.awsDashSdk.awsDashSdkStrings.MLModel
    - java.lang.String
  */
  type TaggableResourceType = _TaggableResourceType | String
  type TrainingParameters = StringDictionary[StringType]
  type VariableName = String
  type VariableValue = String
  type Verbose = Boolean
  type VipURL = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-12-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type floatLabel = Double
}
