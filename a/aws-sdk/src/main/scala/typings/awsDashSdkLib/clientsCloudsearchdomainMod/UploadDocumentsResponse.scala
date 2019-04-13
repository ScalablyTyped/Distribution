package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

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
    adds: js.UndefOr[Adds] = js.undefined,
    deletes: js.UndefOr[Deletes] = js.undefined,
    status: String = null,
    warnings: DocumentServiceWarnings = null
  ): UploadDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adds)) __obj.updateDynamic("adds")(adds)
    if (!js.isUndefined(deletes)) __obj.updateDynamic("deletes")(deletes)
    if (status != null) __obj.updateDynamic("status")(status)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[UploadDocumentsResponse]
  }
}

