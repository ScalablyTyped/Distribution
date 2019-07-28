package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectDocumentTextResponse extends js.Object {
  /**
    * An array of Block objects containing the text detected in the document.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  /**
    * Metadata about the document. Contains the number of pages that are detected in the document.
    */
  var DocumentMetadata: js.UndefOr[typings.awsDashSdk.clientsTextractMod.DocumentMetadata] = js.undefined
}

object DetectDocumentTextResponse {
  @scala.inline
  def apply(Blocks: BlockList = null, DocumentMetadata: DocumentMetadata = null): DetectDocumentTextResponse = {
    val __obj = js.Dynamic.literal()
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks)
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata)
    __obj.asInstanceOf[DetectDocumentTextResponse]
  }
}

