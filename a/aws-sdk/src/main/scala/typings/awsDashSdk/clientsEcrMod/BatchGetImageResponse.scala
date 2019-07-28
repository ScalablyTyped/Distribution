package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.undefined
  /**
    * A list of image objects corresponding to the image references in the request.
    */
  var images: js.UndefOr[ImageList] = js.undefined
}

object BatchGetImageResponse {
  @scala.inline
  def apply(failures: ImageFailureList = null, images: ImageList = null): BatchGetImageResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[BatchGetImageResponse]
  }
}

