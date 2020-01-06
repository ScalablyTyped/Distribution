package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.SERVICE
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountId = String
  type Arn = String
  type ArnList = js.Array[Arn]
  type AvroSchema = String
  type BatchInferenceJobs = js.Array[BatchInferenceJobSummary]
  type Boolean = scala.Boolean
  type Campaigns = js.Array[CampaignSummary]
  type CategoricalHyperParameterRanges = js.Array[CategoricalHyperParameterRange]
  type CategoricalValue = String
  type CategoricalValues = js.Array[CategoricalValue]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContinuousHyperParameterRanges = js.Array[ContinuousHyperParameterRange]
  type ContinuousMaxValue = Double
  type ContinuousMinValue = Double
  type DatasetGroups = js.Array[DatasetGroupSummary]
  type DatasetImportJobs = js.Array[DatasetImportJobSummary]
  type DatasetType = String
  type Datasets = js.Array[DatasetSummary]
  type DefaultCategoricalHyperParameterRanges = js.Array[DefaultCategoricalHyperParameterRange]
  type DefaultContinuousHyperParameterRanges = js.Array[DefaultContinuousHyperParameterRange]
  type DefaultIntegerHyperParameterRanges = js.Array[DefaultIntegerHyperParameterRange]
  type Description = String
  type DockerURI = String
  type EventTrackers = js.Array[EventTrackerSummary]
  type EventType = String
  type EventValueThreshold = String
  type FailureReason = String
  type FeatureTransformationParameters = StringDictionary[ParameterValue]
  type FeaturizationParameters = StringDictionary[ParameterValue]
  type HPOObjectiveType = String
  type HPOResource = String
  type HyperParameters = StringDictionary[ParameterValue]
  type IntegerHyperParameterRanges = js.Array[IntegerHyperParameterRange]
  type IntegerMaxValue = Double
  type IntegerMinValue = Double
  type KmsKeyArn = String
  type MaxResults = Double
  type MetricName = String
  type MetricRegex = String
  type MetricValue = Double
  type Metrics = StringDictionary[MetricValue]
  type Name = String
  type NextToken = String
  type NumBatchResults = Double
  type ParameterName = String
  type ParameterValue = String
  type PerformAutoML = scala.Boolean
  type PerformHPO = scala.Boolean
  type RecipeProvider = SERVICE | String
  type RecipeType = String
  type Recipes = js.Array[RecipeSummary]
  type ResourceConfig = StringDictionary[ParameterValue]
  type RoleArn = String
  type S3Location = String
  type Schemas = js.Array[DatasetSchemaSummary]
  type SolutionVersions = js.Array[SolutionVersionSummary]
  type Solutions = js.Array[SolutionSummary]
  type Status = String
  type TrackingId = String
  type TrainingHours = Double
  type TrainingInputMode = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE
    - java.lang.String
  */
  type TrainingMode = _TrainingMode | String
  type TransactionsPerSecond = Double
  type Tunable = scala.Boolean
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-22`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
