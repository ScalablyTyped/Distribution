package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.native
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
}

object BatchDeleteImageResponse {
  @scala.inline
  def apply(failures: ImageFailureList = null, imageIds: ImageIdentifierList = null): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (imageIds != null) __obj.updateDynamic("imageIds")(imageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
}

