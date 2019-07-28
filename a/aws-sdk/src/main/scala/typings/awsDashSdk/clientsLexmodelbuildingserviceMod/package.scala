package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLexmodelbuildingserviceMod {
  type AliasName = java.lang.String
  type AliasNameOrListAll = java.lang.String
  type Boolean = scala.Boolean
  type BotAliasMetadataList = js.Array[BotAliasMetadata]
  type BotChannelAssociationList = js.Array[BotChannelAssociation]
  type BotChannelName = java.lang.String
  type BotMetadataList = js.Array[BotMetadata]
  type BotName = java.lang.String
  type BotVersions = js.Array[Version]
  type BuiltinIntentMetadataList = js.Array[BuiltinIntentMetadata]
  type BuiltinIntentSignature = java.lang.String
  type BuiltinIntentSlotList = js.Array[BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature = java.lang.String
  type ChannelConfigurationMap = StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ChannelStatus = _ChannelStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Facebook
    - typings.awsDashSdk.awsDashSdkStrings.Slack
    - typings.awsDashSdk.awsDashSdkStrings.`Twilio-Sms`
    - typings.awsDashSdk.awsDashSdkStrings.Kik
    - java.lang.String
  */
  type ChannelType = _ChannelType | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PlainText
    - typings.awsDashSdk.awsDashSdkStrings.SSML
    - typings.awsDashSdk.awsDashSdkStrings.CustomPayload
    - java.lang.String
  */
  type ContentType = _ContentType | java.lang.String
  type Count = Double
  type CustomOrBuiltinSlotTypeName = java.lang.String
  type Description = java.lang.String
  type EnumerationValues = js.Array[EnumerationValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = _ExportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALEXA_SKILLS_KIT
    - typings.awsDashSdk.awsDashSdkStrings.LEX
    - java.lang.String
  */
  type ExportType = _ExportType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ReturnIntent
    - typings.awsDashSdk.awsDashSdkStrings.CodeHook
    - java.lang.String
  */
  type FulfillmentActivityType = _FulfillmentActivityType | java.lang.String
  type GroupNumber = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type ImportStatus = _ImportStatus | java.lang.String
  type IntentList = js.Array[Intent]
  type IntentMetadataList = js.Array[IntentMetadata]
  type IntentName = java.lang.String
  type IntentUtteranceList = js.Array[Utterance]
  type LambdaARN = java.lang.String
  type ListOfUtterance = js.Array[UtteranceData]
  type ListsOfUtterances = js.Array[UtteranceList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`en-US`
    - typings.awsDashSdk.awsDashSdkStrings.`en-GB`
    - typings.awsDashSdk.awsDashSdkStrings.`de-DE`
    - java.lang.String
  */
  type Locale = _Locale | java.lang.String
  type LocaleList = js.Array[Locale]
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OVERWRITE_LATEST
    - typings.awsDashSdk.awsDashSdkStrings.FAIL_ON_CONFLICT
    - java.lang.String
  */
  type MergeStrategy = _MergeStrategy | java.lang.String
  type MessageList = js.Array[Message]
  type MessageVersion = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumericalVersion = java.lang.String
  type Priority = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SAVE
    - typings.awsDashSdk.awsDashSdkStrings.BUILD
    - java.lang.String
  */
  type ProcessBehavior = _ProcessBehavior | java.lang.String
  type PromptMaxAttempts = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BOT
    - typings.awsDashSdk.awsDashSdkStrings.INTENT
    - typings.awsDashSdk.awsDashSdkStrings.SLOT_TYPE
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseCard = java.lang.String
  type SessionTTL = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Required
    - typings.awsDashSdk.awsDashSdkStrings.Optional
    - java.lang.String
  */
  type SlotConstraint = _SlotConstraint | java.lang.String
  type SlotList = js.Array[Slot]
  type SlotName = java.lang.String
  type SlotTypeMetadataList = js.Array[SlotTypeMetadata]
  type SlotTypeName = java.lang.String
  type SlotUtteranceList = js.Array[Utterance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORIGINAL_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.TOP_RESOLUTION
    - java.lang.String
  */
  type SlotValueSelectionStrategy = _SlotValueSelectionStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BUILDING
    - typings.awsDashSdk.awsDashSdkStrings.READY
    - typings.awsDashSdk.awsDashSdkStrings.READY_BASIC_TESTING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.NOT_BUILT
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Detected
    - typings.awsDashSdk.awsDashSdkStrings.Missed
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SynonymList = js.Array[Value]
  type Timestamp = Date
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type UtteranceString = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type _Blob = Buffer | Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-04-19`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
