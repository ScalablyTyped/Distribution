package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageState extends js.Object {
  /**
    *  The reason for the image's status. 
    */
  var reason: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The status of the image. 
    */
  var status: js.UndefOr[ImageStatus] = js.native
}

object ImageState {
  @scala.inline
  def apply(reason: NonEmptyString = null, status: ImageStatus = null): ImageState = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageState]
  }
}

