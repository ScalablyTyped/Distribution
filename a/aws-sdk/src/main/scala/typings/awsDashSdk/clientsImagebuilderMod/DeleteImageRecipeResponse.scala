package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageRecipeResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that was deleted. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteImageRecipeResponse {
  @scala.inline
  def apply(imageRecipeArn: ImageRecipeArn = null, requestId: NonEmptyString = null): DeleteImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    if (imageRecipeArn != null) __obj.updateDynamic("imageRecipeArn")(imageRecipeArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRecipeResponse]
  }
}

