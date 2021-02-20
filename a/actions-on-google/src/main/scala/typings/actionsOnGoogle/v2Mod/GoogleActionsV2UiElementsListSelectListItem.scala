package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsListSelectListItem extends StObject {
  
  /**
    * Main text describing the item.
    * Optional.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Square image.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Information about this option. See google.actions.v2.OptionInfo
    * for details.
    * Required.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.native
  
  /**
    * Title of the list item. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of list items.
    * Required.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsListSelectListItem {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsListSelectListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsListSelectListItem]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsListSelectListItemMutableBuilder[Self <: GoogleActionsV2UiElementsListSelectListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOptionInfo(value: GoogleActionsV2OptionInfo): Self = StObject.set(x, "optionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionInfoUndefined: Self = StObject.set(x, "optionInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
