package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsForecastserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.filling
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Arn = java.lang.String
  type ArnList = js.Array[Arn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.string__
    - typings.awsDashSdk.awsDashSdkStrings.integer__
    - typings.awsDashSdk.awsDashSdkStrings.float_
    - typings.awsDashSdk.awsDashSdkStrings.timestamp_
    - java.lang.String
  */
  type AttributeType = _AttributeType | java.lang.String
  type Boolean = scala.Boolean
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type DatasetGroups = js.Array[DatasetGroupSummary]
  type DatasetImportJobs = js.Array[DatasetImportJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TARGET_TIME_SERIES
    - typings.awsDashSdk.awsDashSdkStrings.RELATED_TIME_SERIES
    - typings.awsDashSdk.awsDashSdkStrings.ITEM_METADATA
    - java.lang.String
  */
  type DatasetType = _DatasetType | java.lang.String
  type Datasets = js.Array[DatasetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RETAIL
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM
    - typings.awsDashSdk.awsDashSdkStrings.INVENTORY_PLANNING
    - typings.awsDashSdk.awsDashSdkStrings.EC2_CAPACITY
    - typings.awsDashSdk.awsDashSdkStrings.WORK_FORCE
    - typings.awsDashSdk.awsDashSdkStrings.WEB_TRAFFIC
    - typings.awsDashSdk.awsDashSdkStrings.METRICS
    - java.lang.String
  */
  type Domain = _Domain | java.lang.String
  type Double = scala.Double
  type ErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUMMARY
    - typings.awsDashSdk.awsDashSdkStrings.COMPUTED
    - java.lang.String
  */
  type EvaluationType = _EvaluationType | java.lang.String
  type FeaturizationMethodName = filling | java.lang.String
  type FeaturizationMethodParameters = StringDictionary[ParameterValue]
  type FeaturizationPipeline = js.Array[FeaturizationMethod]
  type Featurizations = js.Array[Featurization]
  type FieldStatistics = StringDictionary[Statistics]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IS
    - typings.awsDashSdk.awsDashSdkStrings.IS_NOT
    - java.lang.String
  */
  type FilterConditionString = _FilterConditionString | java.lang.String
  type Filters = js.Array[Filter]
  type ForecastDimensions = js.Array[Name]
  type ForecastExportJobs = js.Array[ForecastExportJobSummary]
  type ForecastType = java.lang.String
  type ForecastTypes = js.Array[ForecastType]
  type Forecasts = js.Array[ForecastSummary]
  type Frequency = java.lang.String
  type Integer = scala.Double
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type KMSKeyArn = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterValue = java.lang.String
  type PredictorEvaluationResults = js.Array[EvaluationResult]
  type PredictorExecutions = js.Array[PredictorExecution]
  type Predictors = js.Array[PredictorSummary]
  type S3Path = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto_
    - typings.awsDashSdk.awsDashSdkStrings.Linear_
    - typings.awsDashSdk.awsDashSdkStrings.Logarithmic
    - typings.awsDashSdk.awsDashSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type ScalingType = _ScalingType | java.lang.String
  type SchemaAttributes = js.Array[SchemaAttribute]
  type Status = java.lang.String
  type String = java.lang.String
  type SupplementaryFeatures = js.Array[SupplementaryFeature]
  type TestWindowDetails = js.Array[TestWindowSummary]
  type TestWindows = js.Array[WindowSummary]
  type Timestamp = Date
  type TimestampFormat = java.lang.String
  type TrainingParameters = StringDictionary[ParameterValue]
  type Value = java.lang.String
  type Values = js.Array[Value]
  type WeightedQuantileLosses = js.Array[WeightedQuantileLoss]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-06-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
