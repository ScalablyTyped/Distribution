package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsCarouselSelectCarouselItem extends js.Object {
  /**
    * Body text of the card.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * See google.actions.v2.OptionInfo
    * for details.
    * Required.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.native
  /**
    * Title of the carousel item. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of carousel items.
    * Required.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsCarouselSelectCarouselItem {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCarouselSelectCarouselItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsCarouselSelectCarouselItemOps[Self <: GoogleActionsV2UiElementsCarouselSelectCarouselItem] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOptionInfo(value: GoogleActionsV2OptionInfo): Self = this.set("optionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionInfo: Self = this.set("optionInfo", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

