package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectDocumentTextRequest extends js.Object {
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
    */
  var Document: awsDashSdkLib.clientsTextractMod.Document
}

object DetectDocumentTextRequest {
  @scala.inline
  def apply(Document: Document): DetectDocumentTextRequest = {
    val __obj = js.Dynamic.literal(Document = Document)
  
    __obj.asInstanceOf[DetectDocumentTextRequest]
  }
}

