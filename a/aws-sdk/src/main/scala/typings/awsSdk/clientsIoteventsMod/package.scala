package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcknowledgeFlowEnabled = Boolean

type Actions = js.Array[Action]

type AlarmActions = js.Array[AlarmAction]

type AlarmModelArn = String

type AlarmModelDescription = String

type AlarmModelName = String

type AlarmModelSummaries = js.Array[AlarmModelSummary]

type AlarmModelVersion = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AlarmModelVersionStatus = _AlarmModelVersionStatus | String

type AlarmModelVersionSummaries = js.Array[AlarmModelVersionSummary]

type AmazonResourceName = String

type AnalysisId = String

type AnalysisMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.WARNING
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type AnalysisResultLevel = _AnalysisResultLevel | String

type AnalysisResultLocationPath = String

type AnalysisResultLocations = js.Array[AnalysisResultLocation]

type AnalysisResults = js.Array[AnalysisResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AnalysisStatus = _AnalysisStatus | String

type AnalysisType = String

type AssetId = String

type AssetModelId = String

type AssetPropertyAlias = String

type AssetPropertyBooleanValue = String

type AssetPropertyDoubleValue = String

type AssetPropertyEntryId = String

type AssetPropertyId = String

type AssetPropertyIntegerValue = String

type AssetPropertyOffsetInNanos = String

type AssetPropertyQuality = String

type AssetPropertyStringValue = String

type AssetPropertyTimeInSeconds = String

type AttributeJsonPath = String

type Attributes = js.Array[Attribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREATER
  - typings.awsSdk.awsSdkStrings.GREATER_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.LESS
  - typings.awsSdk.awsSdkStrings.LESS_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.EQUAL
  - typings.awsSdk.awsSdkStrings.NOT_EQUAL
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | String

type Condition = String

type ContentExpression = String

type DeliveryStreamName = String

type DetectorDebugOptions = js.Array[DetectorDebugOption]

type DetectorModelArn = String

type DetectorModelDescription = String

type DetectorModelName = String

type DetectorModelSummaries = js.Array[DetectorModelSummary]

type DetectorModelVersion = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.DEPRECATED
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.PAUSED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DetectorModelVersionStatus = _DetectorModelVersionStatus | String

type DetectorModelVersionSummaries = js.Array[DetectorModelVersionSummary]

type DisabledOnInitialization = Boolean

type DynamoKeyField = String

type DynamoKeyType = String

type DynamoKeyValue = String

type DynamoOperation = String

type DynamoTableName = String

type EmailConfigurations = js.Array[EmailConfiguration]

type EmailSubject = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BATCH
  - typings.awsSdk.awsSdkStrings.SERIAL
  - java.lang.String
*/
type EvaluationMethod = _EvaluationMethod | String

type EventName = String

type Events = js.Array[Event]

type FirehoseSeparator = String

type FromEmail = String

type IdentityStoreId = String

type InputArn = String

type InputDescription = String

type InputName = String

type InputProperty = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type InputStatus = _InputStatus | String

type InputSummaries = js.Array[InputSummary]

type KeyValue = String

type LoggingEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.DEBUG
  - java.lang.String
*/
type LoggingLevel = _LoggingLevel | String

type MQTTTopic = String

type MaxAnalysisResults = Double

type MaxResults = Double

type NextToken = String

type NotificationActions = js.Array[NotificationAction]

type NotificationAdditionalMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type PayloadType = _PayloadType | String

type QueueUrl = String

type RecipientDetails = js.Array[RecipientDetail]

type ResourceName = String

type RoutedResources = js.Array[RoutedResource]

type SMSConfigurations = js.Array[SMSConfiguration]

type SMSSenderId = String

type SSOReferenceId = String

type Seconds = Double

type Severity = Double

type StateName = String

type States = js.Array[State]

type StatusMessage = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

type Threshold = String

type TimerName = String

type Timestamp = js.Date

type TransitionEvents = js.Array[TransitionEvent]

type UseBase64 = Boolean

type VariableName = String

type VariableValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-07-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
