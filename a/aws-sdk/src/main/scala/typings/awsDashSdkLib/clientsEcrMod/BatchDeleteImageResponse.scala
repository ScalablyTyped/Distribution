package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteImageResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.undefined
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
}

object BatchDeleteImageResponse {
  @scala.inline
  def apply(failures: ImageFailureList = null, imageIds: ImageIdentifierList = null): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (imageIds != null) __obj.updateDynamic("imageIds")(imageIds)
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
}

