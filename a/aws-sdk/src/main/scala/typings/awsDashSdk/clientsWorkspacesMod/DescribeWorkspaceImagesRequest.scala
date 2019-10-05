package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceImagesRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeWorkspaceImagesRequest {
  @scala.inline
  def apply(
    ImageIds: WorkspaceImageIdList = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null
  ): DescribeWorkspaceImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ImageIds != null) __obj.updateDynamic("ImageIds")(ImageIds)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeWorkspaceImagesRequest]
  }
}

