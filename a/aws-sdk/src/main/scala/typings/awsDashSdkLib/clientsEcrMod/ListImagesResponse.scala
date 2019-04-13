package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListImagesResponse extends js.Object {
  /**
    * The list of image IDs for the requested repository.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
  /**
    * The nextToken value to include in a future ListImages request. When the results of a ListImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListImagesResponse {
  @scala.inline
  def apply(imageIds: ImageIdentifierList = null, nextToken: NextToken = null): ListImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (imageIds != null) __obj.updateDynamic("imageIds")(imageIds)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListImagesResponse]
  }
}

