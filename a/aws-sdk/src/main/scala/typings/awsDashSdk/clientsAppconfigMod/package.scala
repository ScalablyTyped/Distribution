package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAppconfigMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.LINEAR
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ApplicationList = js.Array[Application]
  type Arn = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationProfileSummaryList = js.Array[ConfigurationProfileSummary]
  type DeploymentList = js.Array[DeploymentSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BAKING
    - typings.awsDashSdk.awsDashSdkStrings.VALIDATING
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.ROLLING_BACK
    - typings.awsDashSdk.awsDashSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type DeploymentState = _DeploymentState | java.lang.String
  type DeploymentStrategyId = java.lang.String
  type DeploymentStrategyList = js.Array[DeploymentStrategy]
  type Description = java.lang.String
  type EnvironmentList = js.Array[Environment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.READY_FOR_DEPLOYMENT
    - typings.awsDashSdk.awsDashSdkStrings.DEPLOYING
    - typings.awsDashSdk.awsDashSdkStrings.ROLLING_BACK
    - typings.awsDashSdk.awsDashSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type EnvironmentState = _EnvironmentState | java.lang.String
  type GrowthFactor = Double
  type GrowthType = LINEAR | java.lang.String
  type Id = java.lang.String
  type Integer = Double
  type Iso8601DateTime = Date
  type MaxResults = Double
  type MinutesBetween0And24Hours = Double
  type MonitorList = js.Array[Monitor]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Percentage = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SSM_DOCUMENT
    - java.lang.String
  */
  type ReplicateTo = _ReplicateTo | java.lang.String
  type String = java.lang.String
  type StringWithLengthBetween0And32768 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Uri = java.lang.String
  type ValidatorList = js.Array[Validator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JSON_SCHEMA
    - typings.awsDashSdk.awsDashSdkStrings.LAMBDA
    - java.lang.String
  */
  type ValidatorType = _ValidatorType | java.lang.String
  type ValidatorTypeList = js.Array[ValidatorType]
  type Version = java.lang.String
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2019-10-09`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
