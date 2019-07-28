package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzeDocumentResponse extends js.Object {
  /**
    * The text that's detected and analyzed by AnalyzeDocument.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  /**
    * Metadata about the analyzed document. An example is the number of pages.
    */
  var DocumentMetadata: js.UndefOr[typings.awsDashSdk.clientsTextractMod.DocumentMetadata] = js.undefined
}

object AnalyzeDocumentResponse {
  @scala.inline
  def apply(Blocks: BlockList = null, DocumentMetadata: DocumentMetadata = null): AnalyzeDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks)
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata)
    __obj.asInstanceOf[AnalyzeDocumentResponse]
  }
}

