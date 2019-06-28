package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentExportJobsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The maximum number of items to include on each page in a paginated response.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: __string
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[__string] = js.undefined
}

object GetSegmentExportJobsRequest {
  @scala.inline
  def apply(ApplicationId: __string, SegmentId: __string, PageSize: __string = null, Token: __string = null): GetSegmentExportJobsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SegmentId = SegmentId)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetSegmentExportJobsRequest]
  }
}

