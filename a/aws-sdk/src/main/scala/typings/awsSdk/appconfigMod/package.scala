package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appconfigMod {
  type ApplicationList = js.Array[typings.awsSdk.appconfigMod.Application]
  type Arn = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.appconfigMod.ClientApiVersions
  type ConfigurationProfileSummaryList = js.Array[typings.awsSdk.appconfigMod.ConfigurationProfileSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PERCENTAGE_UPDATED
    - typings.awsSdk.awsSdkStrings.ROLLBACK_STARTED
    - typings.awsSdk.awsSdkStrings.ROLLBACK_COMPLETED
    - typings.awsSdk.awsSdkStrings.BAKE_TIME_STARTED
    - typings.awsSdk.awsSdkStrings.DEPLOYMENT_STARTED
    - typings.awsSdk.awsSdkStrings.DEPLOYMENT_COMPLETED
    - java.lang.String
  */
  type DeploymentEventType = typings.awsSdk.appconfigMod._DeploymentEventType | java.lang.String
  type DeploymentEvents = js.Array[typings.awsSdk.appconfigMod.DeploymentEvent]
  type DeploymentList = js.Array[typings.awsSdk.appconfigMod.DeploymentSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BAKING
    - typings.awsSdk.awsSdkStrings.VALIDATING
    - typings.awsSdk.awsSdkStrings.DEPLOYING
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.ROLLING_BACK
    - typings.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type DeploymentState = typings.awsSdk.appconfigMod._DeploymentState | java.lang.String
  type DeploymentStrategyId = java.lang.String
  type DeploymentStrategyList = js.Array[typings.awsSdk.appconfigMod.DeploymentStrategy]
  type Description = java.lang.String
  type EnvironmentList = js.Array[typings.awsSdk.appconfigMod.Environment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY_FOR_DEPLOYMENT
    - typings.awsSdk.awsSdkStrings.DEPLOYING
    - typings.awsSdk.awsSdkStrings.ROLLING_BACK
    - typings.awsSdk.awsSdkStrings.ROLLED_BACK
    - java.lang.String
  */
  type EnvironmentState = typings.awsSdk.appconfigMod._EnvironmentState | java.lang.String
  type GrowthFactor = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LINEAR
    - typings.awsSdk.awsSdkStrings.EXPONENTIAL
    - java.lang.String
  */
  type GrowthType = typings.awsSdk.appconfigMod._GrowthType | java.lang.String
  type HostedConfigurationVersionSummaryList = js.Array[typings.awsSdk.appconfigMod.HostedConfigurationVersionSummary]
  type Id = java.lang.String
  type Integer = scala.Double
  type Iso8601DateTime = typings.std.Date
  type MaxResults = scala.Double
  type MinutesBetween0And24Hours = scala.Double
  type MonitorList = js.Array[typings.awsSdk.appconfigMod.Monitor]
  type Name = java.lang.String
  type NextToken = java.lang.String
  type Percentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.SSM_DOCUMENT
    - java.lang.String
  */
  type ReplicateTo = typings.awsSdk.appconfigMod._ReplicateTo | java.lang.String
  type RoleArn = java.lang.String
  type String = java.lang.String
  type StringWithLengthBetween0And32768 = java.lang.String
  type StringWithLengthBetween1And255 = java.lang.String
  type StringWithLengthBetween1And64 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.appconfigMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.appconfigMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.APPCONFIG
    - typings.awsSdk.awsSdkStrings.CLOUDWATCH_ALARM
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type TriggeredBy = typings.awsSdk.appconfigMod._TriggeredBy | java.lang.String
  type Uri = java.lang.String
  type ValidatorList = js.Array[typings.awsSdk.appconfigMod.Validator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JSON_SCHEMA
    - typings.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type ValidatorType = typings.awsSdk.appconfigMod._ValidatorType | java.lang.String
  type ValidatorTypeList = js.Array[typings.awsSdk.appconfigMod.ValidatorType]
  type Version = java.lang.String
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.appconfigMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-10-09`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.appconfigMod._apiVersion | java.lang.String
}
