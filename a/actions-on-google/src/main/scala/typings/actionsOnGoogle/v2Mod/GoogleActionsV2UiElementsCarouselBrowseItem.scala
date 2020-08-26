package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsCarouselBrowseItem extends js.Object {
  /**
    * Description of the carousel item.
    * Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Footer text for the carousel item, displayed below the description.
    * Single line of text, truncated with an ellipsis.
    * Optional.
    */
  var footer: js.UndefOr[String] = js.native
  /**
    * Hero image for the carousel item.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * URL of the document associated with the carousel item.
    * The document can contain HTML content or, if \"url_type_hint\" is set to
    * AMP_CONTENT, AMP content.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
  /**
    * Title of the carousel item.
    * Required.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsCarouselBrowseItem {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCarouselBrowseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowseItem]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsCarouselBrowseItemOps[Self <: GoogleActionsV2UiElementsCarouselBrowseItem] (val x: Self) extends AnyVal {
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
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = this.set("openUrlAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUrlAction: Self = this.set("openUrlAction", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

