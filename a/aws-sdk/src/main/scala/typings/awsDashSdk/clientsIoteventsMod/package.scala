package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIoteventsMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Actions = js.Array[Action]
  type AmazonResourceName = String
  type AttributeJsonPath = String
  type Attributes = js.Array[Attribute]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Condition = String
  type DeliveryStreamName = String
  type DetectorDebugOptions = js.Array[DetectorDebugOption]
  type DetectorModelArn = String
  type DetectorModelDescription = String
  type DetectorModelName = String
  type DetectorModelSummaries = js.Array[DetectorModelSummary]
  type DetectorModelVersion = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVATING
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DEPRECATED
    - typings.awsDashSdk.awsDashSdkStrings.DRAFT
    - typings.awsDashSdk.awsDashSdkStrings.PAUSED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DetectorModelVersionStatus = _DetectorModelVersionStatus | String
  type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BATCH
    - typings.awsDashSdk.awsDashSdkStrings.SERIAL
    - java.lang.String
  */
  type EvaluationMethod = _EvaluationMethod | String
  type EventName = String
  type Events = js.Array[Event]
  type FirehoseSeparator = String
  type InputArn = String
  type InputDescription = String
  type InputName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type InputStatus = _InputStatus | String
  type InputSummaries = js.Array[InputSummary]
  type KeyValue = String
  type LoggingEnabled = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - java.lang.String
  */
  type LoggingLevel = _LoggingLevel | String
  type MQTTTopic = String
  type MaxResults = Double
  type NextToken = String
  type QueueUrl = String
  type Seconds = Double
  type StateName = String
  type States = js.Array[State]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TimerName = String
  type Timestamp = Date
  type TransitionEvents = js.Array[TransitionEvent]
  type UseBase64 = Boolean
  type VariableName = String
  type VariableValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-07-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
