package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLexruntimeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Uint8Array

  type Accept = java.lang.String
  type AttributesString = java.lang.String
  type BlobStream = Buffer | Uint8Array | Blob | java.lang.String | Readable
  type BotAlias = java.lang.String
  type BotName = java.lang.String
  type ButtonTextStringWithLength = java.lang.String
  type ButtonValueStringWithLength = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Confirmed_
    - typings.awsDashSdk.awsDashSdkStrings.Denied_
    - java.lang.String
  */
  type ConfirmationStatus = _ConfirmationStatus | java.lang.String
  type ContentType = applicationSlashvndDotamazonawsDotcardDotgeneric | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ElicitIntent
    - typings.awsDashSdk.awsDashSdkStrings.ConfirmIntent
    - typings.awsDashSdk.awsDashSdkStrings.ElicitSlot
    - typings.awsDashSdk.awsDashSdkStrings.Close
    - typings.awsDashSdk.awsDashSdkStrings.Delegate
    - java.lang.String
  */
  type DialogActionType = _DialogActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ElicitIntent
    - typings.awsDashSdk.awsDashSdkStrings.ConfirmIntent
    - typings.awsDashSdk.awsDashSdkStrings.ElicitSlot
    - typings.awsDashSdk.awsDashSdkStrings.Fulfilled_
    - typings.awsDashSdk.awsDashSdkStrings.ReadyForFulfillment
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type DialogState = _DialogState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Fulfilled_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.ReadyForFulfillment
    - java.lang.String
  */
  type FulfillmentState = _FulfillmentState | java.lang.String
  type HttpContentType = java.lang.String
  type IntentName = java.lang.String
  type IntentSummaryCheckpointLabel = java.lang.String
  type IntentSummaryList = js.Array[IntentSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PlainText_
    - typings.awsDashSdk.awsDashSdkStrings.CustomPayload
    - typings.awsDashSdk.awsDashSdkStrings.SSML
    - typings.awsDashSdk.awsDashSdkStrings.Composite
    - java.lang.String
  */
  type MessageFormatType = _MessageFormatType | java.lang.String
  type SentimentLabel = java.lang.String
  type SentimentScore = java.lang.String
  type String = java.lang.String
  type StringMap = StringDictionary[String]
  type StringUrlWithLength = java.lang.String
  type StringWithLength = java.lang.String
  type Text = java.lang.String
  type UserId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-11-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type genericAttachmentList = js.Array[GenericAttachment]
  type listOfButtons = js.Array[Button]
}
