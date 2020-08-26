package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsImage extends js.Object {
  /**
    * A text description of the image to be used for accessibility, e.g. screen
    * readers.
    * Required.
    */
  var accessibilityText: js.UndefOr[String] = js.native
  /**
    * The height of the image in pixels.
    * Optional.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The source url of the image. Images can be JPG, PNG and GIF (animated and
    * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image in pixels.
    * Optional.
    */
  var width: js.UndefOr[Double] = js.native
}

object GoogleActionsV2UiElementsImage {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsImage]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsImageOps[Self <: GoogleActionsV2UiElementsImage] (val x: Self) extends AnyVal {
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
    def setAccessibilityText(value: String): Self = this.set("accessibilityText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityText: Self = this.set("accessibilityText", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

