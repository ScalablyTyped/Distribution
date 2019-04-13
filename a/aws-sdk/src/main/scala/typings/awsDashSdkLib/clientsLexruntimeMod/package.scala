package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLexruntimeMod {
  type Accept = java.lang.String
  type AttributesString = java.lang.String
  type BlobStream = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type BotAlias = java.lang.String
  type BotName = java.lang.String
  type ButtonTextStringWithLength = java.lang.String
  type ButtonValueStringWithLength = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentType = awsDashSdkLib.awsDashSdkLibStrings.`application/vndDOTamazonawsDOTcardDOTgeneric` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ElicitIntent
    - awsDashSdkLib.awsDashSdkLibStrings.ConfirmIntent
    - awsDashSdkLib.awsDashSdkLibStrings.ElicitSlot
    - awsDashSdkLib.awsDashSdkLibStrings.Fulfilled
    - awsDashSdkLib.awsDashSdkLibStrings.ReadyForFulfillment
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DialogState = _DialogState | java.lang.String
  type HttpContentType = java.lang.String
  type IntentName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PlainText
    - awsDashSdkLib.awsDashSdkLibStrings.CustomPayload
    - awsDashSdkLib.awsDashSdkLibStrings.SSML
    - awsDashSdkLib.awsDashSdkLibStrings.Composite
    - java.lang.String
  */
  type MessageFormatType = _MessageFormatType | java.lang.String
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[String]
  type StringUrlWithLength = java.lang.String
  type StringWithLength = java.lang.String
  type Text = java.lang.String
  type UserId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type genericAttachmentList = js.Array[GenericAttachment]
  type listOfButtons = js.Array[Button]
}
