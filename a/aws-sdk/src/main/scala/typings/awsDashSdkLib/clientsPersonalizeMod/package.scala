package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPersonalizeMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[Arn]
  type AvroSchema = java.lang.String
  type Campaigns = js.Array[CampaignSummary]
  type CategoricalHyperParameterRanges = js.Array[CategoricalHyperParameterRange]
  type CategoricalValue = java.lang.String
  type CategoricalValues = js.Array[CategoricalValue]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContinuousHyperParameterRanges = js.Array[ContinuousHyperParameterRange]
  type ContinuousMaxValue = scala.Double
  type ContinuousMinValue = scala.Double
  type DatasetGroups = js.Array[DatasetGroupSummary]
  type DatasetImportJobs = js.Array[DatasetImportJobSummary]
  type DatasetType = java.lang.String
  type Datasets = js.Array[DatasetSummary]
  type DefaultCategoricalHyperParameterRanges = js.Array[DefaultCategoricalHyperParameterRange]
  type DefaultContinuousHyperParameterRanges = js.Array[DefaultContinuousHyperParameterRange]
  type DefaultIntegerHyperParameterRanges = js.Array[DefaultIntegerHyperParameterRange]
  type Description = java.lang.String
  type DockerURI = java.lang.String
  type EventTrackers = js.Array[EventTrackerSummary]
  type EventType = java.lang.String
  type EventValueThreshold = java.lang.String
  type FailureReason = java.lang.String
  type FeatureTransformationParameters = org.scalablytyped.runtime.StringDictionary[ParameterValue]
  type FeaturizationParameters = org.scalablytyped.runtime.StringDictionary[ParameterValue]
  type HPOObjectiveType = java.lang.String
  type HPOResource = java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[ParameterValue]
  type IntegerHyperParameterRanges = js.Array[IntegerHyperParameterRange]
  type IntegerMaxValue = scala.Double
  type IntegerMinValue = scala.Double
  type KmsKeyArn = java.lang.String
  type MaxResults = scala.Double
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type Metrics = org.scalablytyped.runtime.StringDictionary[MetricValue]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type ParameterName = java.lang.String
  type ParameterValue = java.lang.String
  type PerformAutoML = scala.Boolean
  type PerformHPO = scala.Boolean
  type RecipeProvider = awsDashSdkLib.awsDashSdkLibStrings.SERVICE | java.lang.String
  type RecipeType = java.lang.String
  type Recipes = js.Array[RecipeSummary]
  type ResourceConfig = org.scalablytyped.runtime.StringDictionary[ParameterValue]
  type RoleArn = java.lang.String
  type S3Location = java.lang.String
  type Schemas = js.Array[DatasetSchemaSummary]
  type SolutionVersions = js.Array[SolutionVersionSummary]
  type Solutions = js.Array[SolutionSummary]
  type Status = java.lang.String
  type TrackingId = java.lang.String
  type TrainingInputMode = java.lang.String
  type TransactionsPerSecond = scala.Double
  type Tunable = scala.Boolean
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-05-22`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
