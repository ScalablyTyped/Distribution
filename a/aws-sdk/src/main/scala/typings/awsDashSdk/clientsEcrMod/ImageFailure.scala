package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFailure extends js.Object {
  /**
    * The code associated with the failure.
    */
  var failureCode: js.UndefOr[ImageFailureCode] = js.undefined
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[ImageFailureReason] = js.undefined
  /**
    * The image ID associated with the failure.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
}

object ImageFailure {
  @scala.inline
  def apply(
    failureCode: ImageFailureCode = null,
    failureReason: ImageFailureReason = null,
    imageId: ImageIdentifier = null
  ): ImageFailure = {
    val __obj = js.Dynamic.literal()
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    __obj.asInstanceOf[ImageFailure]
  }
}

