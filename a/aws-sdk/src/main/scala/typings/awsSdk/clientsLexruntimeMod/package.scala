package typings.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accept = java.lang.String

type ActiveContextName = java.lang.String

type ActiveContextParametersMap = StringDictionary[Text]

type ActiveContextTimeToLiveInSeconds = scala.Double

type ActiveContextTurnsToLive = scala.Double

type ActiveContextsList = js.Array[ActiveContext]

type ActiveContextsString = java.lang.String

type AttributesString = java.lang.String

type BlobStream = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String | Readable

type BotAlias = java.lang.String

type BotName = java.lang.String

type BotVersion = java.lang.String

type ButtonTextStringWithLength = java.lang.String

type ButtonValueStringWithLength = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Confirmed_
  - typings.awsSdk.awsSdkStrings.Denied_
  - java.lang.String
*/
type ConfirmationStatus = _ConfirmationStatus | java.lang.String

type ContentType = applicationSlashvndDotamazonawsDotcardDotgeneric | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.Close_
  - typings.awsSdk.awsSdkStrings.Delegate
  - java.lang.String
*/
type DialogActionType = _DialogActionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.Fulfilled_
  - typings.awsSdk.awsSdkStrings.ReadyForFulfillment
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DialogState = _DialogState | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Fulfilled_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.ReadyForFulfillment
  - java.lang.String
*/
type FulfillmentState = _FulfillmentState | java.lang.String

type HttpContentType = java.lang.String

type IntentList = js.Array[PredictedIntent]

type IntentName = java.lang.String

type IntentSummaryCheckpointLabel = java.lang.String

type IntentSummaryList = js.Array[IntentSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PlainText_
  - typings.awsSdk.awsSdkStrings.CustomPayload
  - typings.awsSdk.awsSdkStrings.SSML
  - typings.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type MessageFormatType = _MessageFormatType | java.lang.String

type ParameterName = java.lang.String

type SensitiveString = java.lang.String

type SensitiveStringUnbounded = java.lang.String

type SentimentLabel = java.lang.String

type SentimentScore = java.lang.String

type String = java.lang.String

type StringMap = StringDictionary[String]

type StringUrlWithLength = java.lang.String

type StringWithLength = java.lang.String

type Text = java.lang.String

type UserId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-11-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type genericAttachmentList = js.Array[GenericAttachment]

type listOfButtons = js.Array[Button]
