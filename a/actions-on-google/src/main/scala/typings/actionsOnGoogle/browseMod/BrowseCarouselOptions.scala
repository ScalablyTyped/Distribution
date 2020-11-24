package typings.actionsOnGoogle.browseMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseCarouselOptions extends js.Object {
  
  /**
    * Sets the display options for the images in this carousel.
    * @public
    */
  var display: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.native
  
  /**
    * List of 2-20 items to show in this carousel.
    * @public
    */
  var items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem] = js.native
}
object BrowseCarouselOptions {
  
  @scala.inline
  def apply(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): BrowseCarouselOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseCarouselOptions]
  }
  
  @scala.inline
  implicit class BrowseCarouselOptionsOps[Self <: BrowseCarouselOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselBrowseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
}
