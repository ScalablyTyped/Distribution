package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsCollectionSelect extends js.Object {
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions] = js.native
  
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]] = js.native
  
  /**
    * Subtitle of the collection. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Title of the collection. Optional.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsCollectionSelect {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCollectionSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCollectionSelect]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsCollectionSelectOps[Self <: GoogleActionsV2UiElementsCollectionSelect] (val x: Self) extends AnyVal {
    
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
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions): Self = this.set("imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDisplayOptions: Self = this.set("imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleActionsV2UiElementsCollectionSelectCollectionItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
