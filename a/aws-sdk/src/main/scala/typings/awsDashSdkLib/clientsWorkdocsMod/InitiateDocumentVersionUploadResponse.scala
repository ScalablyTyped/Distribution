package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateDocumentVersionUploadResponse extends js.Object {
  /**
    * The document metadata.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
  /**
    * The upload metadata.
    */
  var UploadMetadata: js.UndefOr[UploadMetadata] = js.undefined
}

object InitiateDocumentVersionUploadResponse {
  @scala.inline
  def apply(Metadata: DocumentMetadata = null, UploadMetadata: UploadMetadata = null): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (UploadMetadata != null) __obj.updateDynamic("UploadMetadata")(UploadMetadata)
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
}

