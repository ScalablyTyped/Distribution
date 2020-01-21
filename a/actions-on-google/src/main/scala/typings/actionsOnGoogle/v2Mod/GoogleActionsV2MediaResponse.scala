package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2MediaResponse extends js.Object {
  /**
    * The list of media objects.
    */
  var mediaObjects: js.UndefOr[js.Array[GoogleActionsV2MediaObject]] = js.undefined
  /**
    * Type of the media within this response.
    */
  var mediaType: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.undefined
}

object GoogleActionsV2MediaResponse {
  @scala.inline
  def apply(
    mediaObjects: js.Array[GoogleActionsV2MediaObject] = null,
    mediaType: GoogleActionsV2MediaResponseMediaType = null
  ): GoogleActionsV2MediaResponse = {
    val __obj = js.Dynamic.literal()
    if (mediaObjects != null) __obj.updateDynamic("mediaObjects")(mediaObjects.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2MediaResponse]
  }
}

