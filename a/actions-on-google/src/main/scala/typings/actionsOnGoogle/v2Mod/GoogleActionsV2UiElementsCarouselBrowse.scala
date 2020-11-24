package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsCarouselBrowse extends js.Object {
  
  /**
    * Type of image display option.
    * Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.native
  
  /**
    * Min: 2. Max: 10.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]] = js.native
}
object GoogleActionsV2UiElementsCarouselBrowse {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCarouselBrowse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsCarouselBrowseOps[Self <: GoogleActionsV2UiElementsCarouselBrowse] (val x: Self) extends AnyVal {
    
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
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = this.set("imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDisplayOptions: Self = this.set("imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselBrowseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
