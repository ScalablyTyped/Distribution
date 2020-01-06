package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentResponse extends js.Object {
  /**
    * The custom metadata on the document.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The metadata details of the document.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
}

object GetDocumentResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: DocumentMetadata = null): GetDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResponse]
  }
}

