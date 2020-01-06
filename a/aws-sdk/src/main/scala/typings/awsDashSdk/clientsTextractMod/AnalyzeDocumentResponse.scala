package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeDocumentResponse extends js.Object {
  /**
    * The version of the model used to analyze the document.
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.native
  /**
    * The items that are detected and analyzed by AnalyzeDocument.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * Metadata about the analyzed document. An example is the number of pages.
    */
  var DocumentMetadata: js.UndefOr[typings.awsDashSdk.clientsTextractMod.DocumentMetadata] = js.native
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsDashSdk.clientsTextractMod.HumanLoopActivationOutput] = js.native
}

object AnalyzeDocumentResponse {
  @scala.inline
  def apply(
    AnalyzeDocumentModelVersion: String = null,
    Blocks: BlockList = null,
    DocumentMetadata: DocumentMetadata = null,
    HumanLoopActivationOutput: HumanLoopActivationOutput = null
  ): AnalyzeDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (AnalyzeDocumentModelVersion != null) __obj.updateDynamic("AnalyzeDocumentModelVersion")(AnalyzeDocumentModelVersion.asInstanceOf[js.Any])
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks.asInstanceOf[js.Any])
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata.asInstanceOf[js.Any])
    if (HumanLoopActivationOutput != null) __obj.updateDynamic("HumanLoopActivationOutput")(HumanLoopActivationOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeDocumentResponse]
  }
}

