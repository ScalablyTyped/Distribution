package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagesResponse extends js.Object {
  /**
    * A list of ImageDetail objects that contain data about the image.
    */
  var imageDetails: js.UndefOr[ImageDetailList] = js.native
  /**
    * The nextToken value to include in a future DescribeImages request. When the results of a DescribeImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeImagesResponse {
  @scala.inline
  def apply(imageDetails: ImageDetailList = null, nextToken: NextToken = null): DescribeImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (imageDetails != null) __obj.updateDynamic("imageDetails")(imageDetails.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesResponse]
  }
}

