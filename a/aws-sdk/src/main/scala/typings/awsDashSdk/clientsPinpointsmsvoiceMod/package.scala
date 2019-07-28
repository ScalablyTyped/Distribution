package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointsmsvoiceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationSets = js.Array[WordCharactersWithDelimiters]
  type EventDestinations = js.Array[EventDestination]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INITIATED_CALL
    - typings.awsDashSdk.awsDashSdkStrings.RINGING
    - typings.awsDashSdk.awsDashSdkStrings.ANSWERED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED_CALL
    - typings.awsDashSdk.awsDashSdkStrings.BUSY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.NO_ANSWER
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type EventTypes = js.Array[EventType]
  type NextTokenString = java.lang.String
  type NonEmptyString = java.lang.String
  type String = java.lang.String
  type WordCharactersWithDelimiters = java.lang.String
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-09-05`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
