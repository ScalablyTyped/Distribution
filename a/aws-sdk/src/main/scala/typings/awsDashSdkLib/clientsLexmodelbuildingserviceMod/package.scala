package typings
package awsDashSdkLib

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
  type ChannelConfigurationMap = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ChannelStatus = _ChannelStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Facebook
    - awsDashSdkLib.awsDashSdkLibStrings.Slack
    - awsDashSdkLib.awsDashSdkLibStrings.`Twilio-Sms`
    - awsDashSdkLib.awsDashSdkLibStrings.Kik
    - java.lang.String
  */
  type ChannelType = _ChannelType | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PlainText
    - awsDashSdkLib.awsDashSdkLibStrings.SSML
    - awsDashSdkLib.awsDashSdkLibStrings.CustomPayload
    - java.lang.String
  */
  type ContentType = _ContentType | java.lang.String
  type Count = scala.Double
  type CustomOrBuiltinSlotTypeName = java.lang.String
  type Description = java.lang.String
  type EnumerationValues = js.Array[EnumerationValue]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = _ExportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALEXA_SKILLS_KIT
    - awsDashSdkLib.awsDashSdkLibStrings.LEX
    - java.lang.String
  */
  type ExportType = _ExportType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ReturnIntent
    - awsDashSdkLib.awsDashSdkLibStrings.CodeHook
    - java.lang.String
  */
  type FulfillmentActivityType = _FulfillmentActivityType | java.lang.String
  type GroupNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
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
    - awsDashSdkLib.awsDashSdkLibStrings.`en-US`
    - awsDashSdkLib.awsDashSdkLibStrings.`en-GB`
    - awsDashSdkLib.awsDashSdkLibStrings.`de-DE`
    - java.lang.String
  */
  type Locale = _Locale | java.lang.String
  type LocaleList = js.Array[Locale]
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OVERWRITE_LATEST
    - awsDashSdkLib.awsDashSdkLibStrings.FAIL_ON_CONFLICT
    - java.lang.String
  */
  type MergeStrategy = _MergeStrategy | java.lang.String
  type MessageList = js.Array[Message]
  type MessageVersion = java.lang.String
  type Name = java.lang.String
  type NextToken = java.lang.String
  type NumericalVersion = java.lang.String
  type Priority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SAVE
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD
    - java.lang.String
  */
  type ProcessBehavior = _ProcessBehavior | java.lang.String
  type PromptMaxAttempts = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BOT
    - awsDashSdkLib.awsDashSdkLibStrings.INTENT
    - awsDashSdkLib.awsDashSdkLibStrings.SLOT_TYPE
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseCard = java.lang.String
  type SessionTTL = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Required
    - awsDashSdkLib.awsDashSdkLibStrings.Optional
    - java.lang.String
  */
  type SlotConstraint = _SlotConstraint | java.lang.String
  type SlotList = js.Array[Slot]
  type SlotName = java.lang.String
  type SlotTypeMetadataList = js.Array[SlotTypeMetadata]
  type SlotTypeName = java.lang.String
  type SlotUtteranceList = js.Array[Utterance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL_VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.TOP_RESOLUTION
    - java.lang.String
  */
  type SlotValueSelectionStrategy = _SlotValueSelectionStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.READY_BASIC_TESTING
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_BUILT
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Detected
    - awsDashSdkLib.awsDashSdkLibStrings.Missed
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SynonymList = js.Array[Value]
  type Timestamp = stdLib.Date
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type UtteranceString = java.lang.String
  type Value = java.lang.String
  type Version = java.lang.String
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-04-19`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
