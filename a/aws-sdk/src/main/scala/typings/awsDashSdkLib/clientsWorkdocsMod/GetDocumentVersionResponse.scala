package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentVersionResponse extends js.Object {
  /**
    * The custom metadata on the document version.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  /**
    * The version metadata.
    */
  var Metadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
}

object GetDocumentVersionResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: DocumentVersionMetadata = null): GetDocumentVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    __obj.asInstanceOf[GetDocumentVersionResponse]
  }
}

