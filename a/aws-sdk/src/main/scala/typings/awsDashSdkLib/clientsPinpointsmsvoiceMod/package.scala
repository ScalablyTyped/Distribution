package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPinpointsmsvoiceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationSets = js.Array[WordCharactersWithDelimiters]
  type EventDestinations = js.Array[EventDestination]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIATED_CALL
    - awsDashSdkLib.awsDashSdkLibStrings.RINGING
    - awsDashSdkLib.awsDashSdkLibStrings.ANSWERED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED_CALL
    - awsDashSdkLib.awsDashSdkLibStrings.BUSY
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.NO_ANSWER
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
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-09-05`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
