package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsTableCard extends StObject {
  
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.native
  
  /**
    * Headers and alignment of columns.
    */
  var columnProperties: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardColumnProperties]] = js.native
  
  /**
    * Image associated with the table. Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Row data of the table. The first 3 rows are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator to
    * see which rows will be shown for a given surface. On surfaces that support
    * the WEB_BROWSER capability, you can point the user to
    * a web page with more data.
    */
  var rows: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardRow]] = js.native
  
  /**
    * Subtitle for the table. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Overall title of the table. Optional but must be set if subtitle is set.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsTableCard {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCard]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardMutableBuilder[Self <: GoogleActionsV2UiElementsTableCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setColumnProperties(value: js.Array[GoogleActionsV2UiElementsTableCardColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: GoogleActionsV2UiElementsTableCardColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[GoogleActionsV2UiElementsTableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GoogleActionsV2UiElementsTableCardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
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
