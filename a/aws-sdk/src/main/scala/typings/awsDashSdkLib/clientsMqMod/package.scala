package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMqMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATION_FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.DELETION_IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.REBOOT_IN_PROGRESS
    - java.lang.String
  */
  type BrokerState = _BrokerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE
    - java.lang.String
  */
  type ChangeType = _ChangeType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MONDAY
    - awsDashSdkLib.awsDashSdkLibStrings.TUESDAY
    - awsDashSdkLib.awsDashSdkLibStrings.WEDNESDAY
    - awsDashSdkLib.awsDashSdkLibStrings.THURSDAY
    - awsDashSdkLib.awsDashSdkLibStrings.FRIDAY
    - awsDashSdkLib.awsDashSdkLibStrings.SATURDAY
    - awsDashSdkLib.awsDashSdkLibStrings.SUNDAY
    - java.lang.String
  */
  type DayOfWeek = _DayOfWeek | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SINGLE_INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE_STANDBY_MULTI_AZ
    - java.lang.String
  */
  type DeploymentMode = _DeploymentMode | java.lang.String
  type EngineType = awsDashSdkLib.awsDashSdkLibStrings.ACTIVEMQ | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DISALLOWED_ELEMENT_REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.DISALLOWED_ATTRIBUTE_REMOVED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_ATTRIBUTE_VALUE_REMOVED
    - java.lang.String
  */
  type SanitizationWarningReason = _SanitizationWarningReason | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __integerMin5Max100 = scala.Double
  type __listOfAvailabilityZone = js.Array[AvailabilityZone]
  type __listOfBrokerEngineType = js.Array[BrokerEngineType]
  type __listOfBrokerInstance = js.Array[BrokerInstance]
  type __listOfBrokerInstanceOption = js.Array[BrokerInstanceOption]
  type __listOfBrokerSummary = js.Array[BrokerSummary]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationId = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfEngineVersion = js.Array[EngineVersion]
  type __listOfSanitizationWarning = js.Array[SanitizationWarning]
  type __listOfUser = js.Array[User]
  type __listOfUserSummary = js.Array[UserSummary]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  type __timestampIso8601 = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
