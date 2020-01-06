package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMqMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ACTIVEMQ
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATION_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.DELETION_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.REBOOT_IN_PROGRESS
    - java.lang.String
  */
  type BrokerState = _BrokerState | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EBS
    - typings.awsDashSdk.awsDashSdkStrings.EFS
    - java.lang.String
  */
  type BrokerStorageType = _BrokerStorageType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATE
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE
    - typings.awsDashSdk.awsDashSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeType = _ChangeType | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MONDAY
    - typings.awsDashSdk.awsDashSdkStrings.TUESDAY
    - typings.awsDashSdk.awsDashSdkStrings.WEDNESDAY
    - typings.awsDashSdk.awsDashSdkStrings.THURSDAY
    - typings.awsDashSdk.awsDashSdkStrings.FRIDAY
    - typings.awsDashSdk.awsDashSdkStrings.SATURDAY
    - typings.awsDashSdk.awsDashSdkStrings.SUNDAY
    - java.lang.String
  */
  type DayOfWeek = _DayOfWeek | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE_STANDBY_MULTI_AZ
    - java.lang.String
  */
  type DeploymentMode = _DeploymentMode | String
  type EngineType = ACTIVEMQ | String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DISALLOWED_ELEMENT_REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.DISALLOWED_ATTRIBUTE_REMOVED
    - typings.awsDashSdk.awsDashSdkStrings.INVALID_ATTRIBUTE_VALUE_REMOVED
    - java.lang.String
  */
  type SanitizationWarningReason = _SanitizationWarningReason | String
  type __boolean = Boolean
  type __integer = Double
  type __integerMin5Max100 = Double
  type __listOfAvailabilityZone = js.Array[AvailabilityZone]
  type __listOfBrokerEngineType = js.Array[BrokerEngineType]
  type __listOfBrokerInstance = js.Array[BrokerInstance]
  type __listOfBrokerInstanceOption = js.Array[BrokerInstanceOption]
  type __listOfBrokerSummary = js.Array[BrokerSummary]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationId = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfDeploymentMode = js.Array[DeploymentMode]
  type __listOfEngineVersion = js.Array[EngineVersion]
  type __listOfSanitizationWarning = js.Array[SanitizationWarning]
  type __listOfUser = js.Array[User]
  type __listOfUserSummary = js.Array[UserSummary]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-11-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
