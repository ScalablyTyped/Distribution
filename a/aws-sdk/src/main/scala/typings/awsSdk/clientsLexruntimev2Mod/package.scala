package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveContextName = java.lang.String

type ActiveContextParametersMap = StringDictionary[Text]

type ActiveContextTimeToLiveInSeconds = scala.Double

type ActiveContextTurnsToLive = scala.Double

type ActiveContextsList = js.Array[ActiveContext]

type AttachmentTitle = java.lang.String

type AttachmentUrl = java.lang.String

type BlobStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type BotAliasIdentifier = java.lang.String

type BotIdentifier = java.lang.String

type ButtonText = java.lang.String

type ButtonValue = java.lang.String

type ButtonsList = js.Array[Button]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Confirmed_
  - typings.awsSdk.awsSdkStrings.Denied_
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type ConfirmationState = _ConfirmationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Close_
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.Delegate
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type DialogActionType = _DialogActionType | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Fulfilled_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.ReadyForFulfillment
  - typings.awsSdk.awsSdkStrings.Waiting_
  - typings.awsSdk.awsSdkStrings.FulfillmentInProgress
  - java.lang.String
*/
type IntentState = _IntentState | java.lang.String

type Interpretations = js.Array[Interpretation]

type LocaleId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CustomPayload
  - typings.awsSdk.awsSdkStrings.ImageResponseCard
  - typings.awsSdk.awsSdkStrings.PlainText_
  - typings.awsSdk.awsSdkStrings.SSML
  - java.lang.String
*/
type MessageContentType = _MessageContentType | java.lang.String

type Messages = js.Array[Message]

type Name = java.lang.String

type NonEmptyString = java.lang.String

type ParameterName = java.lang.String

type RuntimeHintPhrase = java.lang.String

type RuntimeHintValuesList = js.Array[RuntimeHintValue]

type SensitiveNonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MIXED
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - typings.awsSdk.awsSdkStrings.NEUTRAL
  - typings.awsSdk.awsSdkStrings.POSITIVE
  - java.lang.String
*/
type SentimentType = _SentimentType | java.lang.String

type SessionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scalar
  - typings.awsSdk.awsSdkStrings.List_
  - typings.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type Shape = _Shape | java.lang.String

type SlotHintsIntentMap = StringDictionary[SlotHintsSlotMap]

type SlotHintsSlotMap = StringDictionary[RuntimeHintDetails]

type Slots = StringDictionary[Slot]

type String = java.lang.String

type StringList = js.Array[NonEmptyString]

type StringMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Default_
  - typings.awsSdk.awsSdkStrings.SpellByLetter
  - typings.awsSdk.awsSdkStrings.SpellByWord
  - java.lang.String
*/
type StyleType = _StyleType | java.lang.String

type Text = java.lang.String

type Values = js.Array[Slot]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
