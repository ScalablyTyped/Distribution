package typings.actionsOnGoogle.browseMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseCarouselItemOptions extends js.Object {
  /**
    * Description text of the item.
    * @public
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Footer text of the item.
    * @public
    */
  var footer: js.UndefOr[String] = js.native
  /**
    * Image to show on item.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Title of the option item.
    * @public
    */
  var title: String = js.native
  /**
    * The URL of the link opened by clicking the BrowseCarouselItem.
    * @public
    */
  var url: String = js.native
}

object BrowseCarouselItemOptions {
  @scala.inline
  def apply(title: String, url: String): BrowseCarouselItemOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseCarouselItemOptions]
  }
  @scala.inline
  implicit class BrowseCarouselItemOptionsOps[Self <: BrowseCarouselItemOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
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
  }
  
}

