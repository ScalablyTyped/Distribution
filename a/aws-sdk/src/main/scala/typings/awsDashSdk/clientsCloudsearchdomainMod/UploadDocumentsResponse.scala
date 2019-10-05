package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadDocumentsResponse extends js.Object {
  /**
    * The number of documents that were added to the search domain.
    */
  var adds: js.UndefOr[Adds] = js.undefined
  /**
    * The number of documents that were deleted from the search domain.
    */
  var deletes: js.UndefOr[Deletes] = js.undefined
  /**
    * The status of an UploadDocumentsRequest.
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Any warnings returned by the document service about the documents being uploaded.
    */
  var warnings: js.UndefOr[DocumentServiceWarnings] = js.undefined
}

object UploadDocumentsResponse {
  @scala.inline
  def apply(
    adds: Int | scala.Double = null,
    deletes: Int | scala.Double = null,
    status: String = null,
    warnings: DocumentServiceWarnings = null
  ): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (adds != null) __obj.updateDynamic("adds")(adds.asInstanceOf[js.Any])
    if (deletes != null) __obj.updateDynamic("deletes")(deletes.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
}

