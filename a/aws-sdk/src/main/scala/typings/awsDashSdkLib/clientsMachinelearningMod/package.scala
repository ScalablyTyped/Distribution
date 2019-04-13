package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMachinelearningMod {
  type Algorithm = awsDashSdkLib.awsDashSdkLibStrings.sgd | java.lang.String
  type AwsUserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.IAMUser
    - awsDashSdkLib.awsDashSdkLibStrings.MLModelId
    - awsDashSdkLib.awsDashSdkLibStrings.DataSourceId
    - awsDashSdkLib.awsDashSdkLibStrings.DataURI
    - java.lang.String
  */
  type BatchPredictionFilterVariable = _BatchPredictionFilterVariable | java.lang.String
  type BatchPredictions = js.Array[BatchPrediction]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparatorValue = java.lang.String
  type ComputeStatistics = scala.Boolean
  type DataRearrangement = java.lang.String
  type DataSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.DataLocationS3
    - awsDashSdkLib.awsDashSdkLibStrings.IAMUser
    - java.lang.String
  */
  type DataSourceFilterVariable = _DataSourceFilterVariable | java.lang.String
  type DataSources = js.Array[DataSource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PredictiveModelType
    - awsDashSdkLib.awsDashSdkLibStrings.Algorithm
    - java.lang.String
  */
  type DetailsAttributes = _DetailsAttributes | java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[DetailsValue]
  type DetailsValue = java.lang.String
  type EDPPipelineId = java.lang.String
  type EDPResourceRole = java.lang.String
  type EDPSecurityGroupId = java.lang.String
  type EDPSecurityGroupIds = js.Array[EDPSecurityGroupId]
  type EDPServiceRole = java.lang.String
  type EDPSubnetId = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.INPROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type EntityStatus = _EntityStatus | java.lang.String
  type EpochTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.IAMUser
    - awsDashSdkLib.awsDashSdkLibStrings.MLModelId
    - awsDashSdkLib.awsDashSdkLibStrings.DataSourceId
    - awsDashSdkLib.awsDashSdkLibStrings.DataURI
    - java.lang.String
  */
  type EvaluationFilterVariable = _EvaluationFilterVariable | java.lang.String
  type Evaluations = js.Array[Evaluation]
  type IntegerType = scala.Double
  type Label = java.lang.String
  type LongType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CreatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.IAMUser
    - awsDashSdkLib.awsDashSdkLibStrings.TrainingDataSourceId
    - awsDashSdkLib.awsDashSdkLibStrings.RealtimeEndpointStatus
    - awsDashSdkLib.awsDashSdkLibStrings.MLModelType
    - awsDashSdkLib.awsDashSdkLibStrings.Algorithm
    - awsDashSdkLib.awsDashSdkLibStrings.TrainingDataURI
    - java.lang.String
  */
  type MLModelFilterVariable = _MLModelFilterVariable | java.lang.String
  type MLModelName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGRESSION
    - awsDashSdkLib.awsDashSdkLibStrings.BINARY
    - awsDashSdkLib.awsDashSdkLibStrings.MULTICLASS
    - java.lang.String
  */
  type MLModelType = _MLModelType | java.lang.String
  type MLModels = js.Array[MLModel]
  type Message = java.lang.String
  type PageLimit = scala.Double
  type PerformanceMetricsProperties = org.scalablytyped.runtime.StringDictionary[PerformanceMetricsPropertyValue]
  type PerformanceMetricsPropertyKey = java.lang.String
  type PerformanceMetricsPropertyValue = java.lang.String
  type PresignedS3Url = java.lang.String
  type RDSDatabaseName = java.lang.String
  type RDSDatabasePassword = java.lang.String
  type RDSDatabaseUsername = java.lang.String
  type RDSInstanceIdentifier = java.lang.String
  type RDSSelectSqlQuery = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RealtimeEndpointStatus = _RealtimeEndpointStatus | java.lang.String
  type Recipe = java.lang.String
  type Record = org.scalablytyped.runtime.StringDictionary[VariableValue]
  type RedshiftClusterIdentifier = java.lang.String
  type RedshiftDatabaseName = java.lang.String
  type RedshiftDatabasePassword = java.lang.String
  type RedshiftDatabaseUsername = java.lang.String
  type RedshiftSelectSqlQuery = java.lang.String
  type RoleARN = java.lang.String
  type S3Url = java.lang.String
  type ScoreThreshold = scala.Double
  type ScoreValue = scala.Double
  type ScoreValuePerLabelMap = org.scalablytyped.runtime.StringDictionary[ScoreValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.asc
    - awsDashSdkLib.awsDashSdkLibStrings.dsc
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type StringType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BatchPrediction
    - awsDashSdkLib.awsDashSdkLibStrings.DataSource
    - awsDashSdkLib.awsDashSdkLibStrings.Evaluation
    - awsDashSdkLib.awsDashSdkLibStrings.MLModel
    - java.lang.String
  */
  type TaggableResourceType = _TaggableResourceType | java.lang.String
  type TrainingParameters = org.scalablytyped.runtime.StringDictionary[StringType]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Verbose = scala.Boolean
  type VipURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-12-12`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type floatLabel = scala.Double
}
