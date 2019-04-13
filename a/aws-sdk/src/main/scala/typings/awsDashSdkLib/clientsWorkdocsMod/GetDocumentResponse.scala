package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentResponse extends js.Object {
  /**
    * The custom metadata on the document.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  /**
    * The metadata details of the document.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
}

object GetDocumentResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: DocumentMetadata = null): GetDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    __obj.asInstanceOf[GetDocumentResponse]
  }
}

