package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsCollectionSelect extends StObject {
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions] = js.undefined
  
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]] = js.undefined
  
  /**
    * Subtitle of the collection. Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the collection. Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsCollectionSelect {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCollectionSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCollectionSelect]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsCollectionSelectMutableBuilder[Self <: GoogleActionsV2UiElementsCollectionSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleActionsV2UiElementsCollectionSelectCollectionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
