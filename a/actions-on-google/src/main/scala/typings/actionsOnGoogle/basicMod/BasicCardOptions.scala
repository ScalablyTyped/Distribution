package typings.actionsOnGoogle.basicMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsBasicCardImageDisplayOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicCardOptions extends js.Object {
  /** @public */
  var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.native
  /** @public */
  var display: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.native
  /** @public */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /** @public */
  var subtitle: js.UndefOr[String] = js.native
  /** @public */
  var text: js.UndefOr[String] = js.native
  /** @public */
  var title: js.UndefOr[String] = js.native
}

object BasicCardOptions {
  @scala.inline
  def apply(): BasicCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicCardOptions]
  }
  @scala.inline
  implicit class BasicCardOptionsOps[Self <: BasicCardOptions] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setDisplay(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

