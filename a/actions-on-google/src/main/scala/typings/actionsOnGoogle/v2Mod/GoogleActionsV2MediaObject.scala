package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2MediaObject extends js.Object {
  /**
    * The url pointing to the media content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * Description of this media object.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A small image icon displayed on the right from the title.
    * It's resized to 36x36 dp.
    */
  var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * A large image, such as the cover of the album, etc.
    */
  var largeImage: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Name of this media object.
    */
  var name: js.UndefOr[String] = js.native
}

object GoogleActionsV2MediaObject {
  @scala.inline
  def apply(): GoogleActionsV2MediaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2MediaObject]
  }
  @scala.inline
  implicit class GoogleActionsV2MediaObjectOps[Self <: GoogleActionsV2MediaObject] (val x: Self) extends AnyVal {
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIcon(value: GoogleActionsV2UiElementsImage): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLargeImage(value: GoogleActionsV2UiElementsImage): Self = this.set("largeImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeImage: Self = this.set("largeImage", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

