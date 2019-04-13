package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeDocumentRequest extends js.Object {
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
    */
  var Document: awsDashSdkLib.clientsTextractMod.Document
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables detected in the input document. Add FORMS to return detected fields and the associated text. To perform both types of analysis, add TABLES and FORMS to FeatureTypes.
    */
  var FeatureTypes: awsDashSdkLib.clientsTextractMod.FeatureTypes
}

object AnalyzeDocumentRequest {
  @scala.inline
  def apply(Document: Document, FeatureTypes: FeatureTypes): AnalyzeDocumentRequest = {
    val __obj = js.Dynamic.literal(Document = Document, FeatureTypes = FeatureTypes)
  
    __obj.asInstanceOf[AnalyzeDocumentRequest]
  }
}

