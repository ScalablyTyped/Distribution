package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceImagesResult extends js.Object {
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[WorkspaceImageList] = js.undefined
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeWorkspaceImagesResult {
  @scala.inline
  def apply(Images: WorkspaceImageList = null, NextToken: PaginationToken = null): DescribeWorkspaceImagesResult = {
    val __obj = js.Dynamic.literal()
    if (Images != null) __obj.updateDynamic("Images")(Images)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeWorkspaceImagesResult]
  }
}

