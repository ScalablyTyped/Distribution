package typings.actionsOnGoogle.responseMediaMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaResponseOptions extends js.Object {
  /**
    * Array of MediaObject held in the MediaResponse.
    * @public
    */
  var objects: js.Array[MediaObjectString] = js.native
  /**
    * Type of the media within this MediaResponse.
    * Defaults to 'AUDIO'
    * @public
    */
  var `type`: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.native
}

object MediaResponseOptions {
  @scala.inline
  def apply(objects: js.Array[MediaObjectString]): MediaResponseOptions = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaResponseOptions]
  }
  @scala.inline
  implicit class MediaResponseOptionsOps[Self <: MediaResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjectsVarargs(value: MediaObjectString*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[MediaObjectString]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GoogleActionsV2MediaResponseMediaType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

