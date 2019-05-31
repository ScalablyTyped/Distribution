package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIoteventsMod {
  type Actions = js.Array[Action]
  type AmazonResourceName = java.lang.String
  type AttributeJsonPath = java.lang.String
  type Attributes = js.Array[Attribute]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Condition = java.lang.String
  type DetectorDebugOptions = js.Array[DetectorDebugOption]
  type DetectorModelArn = java.lang.String
  type DetectorModelDescription = java.lang.String
  type DetectorModelName = java.lang.String
  type DetectorModelSummaries = js.Array[DetectorModelSummary]
  type DetectorModelVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVATING
    - awsDashSdkLib.awsDashSdkLibStrings.INACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DEPRECATED
    - awsDashSdkLib.awsDashSdkLibStrings.DRAFT
    - awsDashSdkLib.awsDashSdkLibStrings.PAUSED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DetectorModelVersionStatus = _DetectorModelVersionStatus | java.lang.String
  type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]
  type EventName = java.lang.String
  type Events = js.Array[Event]
  type InputArn = java.lang.String
  type InputDescription = java.lang.String
  type InputName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - java.lang.String
  */
  type InputStatus = _InputStatus | java.lang.String
  type InputSummaries = js.Array[InputSummary]
  type KeyValue = java.lang.String
  type LoggingEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - java.lang.String
  */
  type LoggingLevel = _LoggingLevel | java.lang.String
  type MQTTTopic = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Seconds = scala.Double
  type StateName = java.lang.String
  type States = js.Array[State]
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TimerName = java.lang.String
  type Timestamp = stdLib.Date
  type TransitionEvents = js.Array[TransitionEvent]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-07-27`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
