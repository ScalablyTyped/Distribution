package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagePipelineImagesRequest extends js.Object {
  /**
    *  
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline whose images you wish to view. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListImagePipelineImagesRequest {
  @scala.inline
  def apply(
    filters: FilterList = null,
    imagePipelineArn: ImagePipelineArn = null,
    maxResults: Int | Double = null,
    nextToken: NonEmptyString = null
  ): ListImagePipelineImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (imagePipelineArn != null) __obj.updateDynamic("imagePipelineArn")(imagePipelineArn.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImagePipelineImagesRequest]
  }
}

