package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsFrauddetectorMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.DETECTORPL
  import typings.awsDashSdk.awsDashSdkStrings.ONLINE_FRAUD_INSIGHTS
  import typings.awsDashSdk.awsDashSdkStrings.SAGEMAKER
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type BatchCreateVariableErrorList = js.Array[BatchCreateVariableError]
  type BatchGetVariableErrorList = js.Array[BatchGetVariableError]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CsvIndexToVariableMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - typings.awsDashSdk.awsDashSdkStrings.MODEL_SCORE
    - typings.awsDashSdk.awsDashSdkStrings.EXTERNAL_MODEL_SCORE
    - java.lang.String
  */
  type DataSource = _DataSource | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STRING
    - typings.awsDashSdk.awsDashSdkStrings.INTEGER
    - typings.awsDashSdk.awsDashSdkStrings.FLOAT
    - typings.awsDashSdk.awsDashSdkStrings.BOOLEAN
    - java.lang.String
  */
  type DataType = _DataType | String
  type DetectorList = js.Array[Detector]
  type DetectorVersionMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DRAFT
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - java.lang.String
  */
  type DetectorVersionStatus = _DetectorVersionStatus | String
  type DetectorVersionSummaryList = js.Array[DetectorVersionSummary]
  type DetectorsMaxResults = Double
  type EventAttributeMap = StringDictionary[attributeValue]
  type ExternalModelEndpointDataBlobMap = StringDictionary[ModelEndpointDataBlob]
  type ExternalModelList = js.Array[ExternalModel]
  type ExternalModelsMaxResults = Double
  type IsOpaque = Boolean
  type JsonKeyToVariableMap = StringDictionary[String]
  type LabelMapper = StringDictionary[ListOfStrings]
  type Language = DETECTORPL | String
  type ListOfModelScores = js.Array[ModelScores]
  type ListOfModelVersions = js.Array[ModelVersion]
  type ListOfStrings = js.Array[String]
  type MaxResults = Double
  type MetricsMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATED
    - typings.awsDashSdk.awsDashSdkStrings.DISSOCIATED
    - java.lang.String
  */
  type ModelEndpointStatus = _ModelEndpointStatus | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TEXT_CSV
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION_JSON
    - java.lang.String
  */
  type ModelInputDataFormat = _ModelInputDataFormat | String
  type ModelList = js.Array[Model]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TEXT_CSV
    - typings.awsDashSdk.awsDashSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = _ModelOutputDataFormat | String
  type ModelPredictionMap = StringDictionary[float]
  type ModelSource = SAGEMAKER | String
  type ModelTypeEnum = ONLINE_FRAUD_INSIGHTS | String
  type ModelVariableIndex = Double
  type ModelVariablesList = js.Array[ModelVariable]
  type ModelVersionDetailList = js.Array[ModelVersionDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING_COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATE_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVATE_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type ModelVersionStatus = _ModelVersionStatus | String
  type NameList = js.Array[String]
  type NonEmptyListOfStrings = js.Array[String]
  type OutcomeList = js.Array[Outcome]
  type OutcomesMaxResults = Double
  type RuleDetailList = js.Array[RuleDetail]
  type RuleList = js.Array[Rule]
  type RulesMaxResults = Double
  type VariableEntryList = js.Array[VariableEntry]
  type VariableList = js.Array[Variable]
  type VariablesMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-11-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type attributeKey = String
  type attributeValue = String
  type blob = Buffer | Uint8Array | Blob | String
  type contentType = String
  type description = String
  type float = Double
  type iamRoleArn = String
  type identifier = String
  type integer = Double
  type nonEmptyString = String
  type ruleExpression = String
  type s3BucketLocation = String
  type time = String
}
