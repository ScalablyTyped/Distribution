package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExclusionsPreviewResponse extends js.Object {
  /**
    * Information about the exclusions included in the preview.
    */
  var exclusionPreviews: js.UndefOr[ExclusionPreviewList] = js.undefined
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Specifies the status of the request to generate an exclusions preview.
    */
  var previewStatus: PreviewStatus
}

object GetExclusionsPreviewResponse {
  @scala.inline
  def apply(
    previewStatus: PreviewStatus,
    exclusionPreviews: ExclusionPreviewList = null,
    nextToken: PaginationToken = null
  ): GetExclusionsPreviewResponse = {
    val __obj = js.Dynamic.literal(previewStatus = previewStatus.asInstanceOf[js.Any])
    if (exclusionPreviews != null) __obj.updateDynamic("exclusionPreviews")(exclusionPreviews)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetExclusionsPreviewResponse]
  }
}

