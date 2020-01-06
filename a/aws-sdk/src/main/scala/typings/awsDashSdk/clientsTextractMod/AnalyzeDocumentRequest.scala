package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeDocumentRequest extends js.Object {
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG or PNG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typings.awsDashSdk.clientsTextractMod.Document = js.native
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected form data. To perform both types of analysis, add TABLES and FORMS to FeatureTypes. All lines and words detected in the document are included in the response (including text that isn't related to the value of FeatureTypes). 
    */
  var FeatureTypes: typings.awsDashSdk.clientsTextractMod.FeatureTypes = js.native
  /**
    * Sets the configuration for the human in the loop workflow for analyzing documents.
    */
  var HumanLoopConfig: js.UndefOr[typings.awsDashSdk.clientsTextractMod.HumanLoopConfig] = js.native
}

object AnalyzeDocumentRequest {
  @scala.inline
  def apply(Document: Document, FeatureTypes: FeatureTypes, HumanLoopConfig: HumanLoopConfig = null): AnalyzeDocumentRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], FeatureTypes = FeatureTypes.asInstanceOf[js.Any])
    if (HumanLoopConfig != null) __obj.updateDynamic("HumanLoopConfig")(HumanLoopConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeDocumentRequest]
  }
}

