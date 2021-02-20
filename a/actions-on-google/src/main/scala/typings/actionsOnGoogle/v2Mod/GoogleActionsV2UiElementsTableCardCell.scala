package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsTableCardCell extends StObject {
  
  /**
    * Text content of the cell.
    */
  var text: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsTableCardCell {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCardCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardCell]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardCellMutableBuilder[Self <: GoogleActionsV2UiElementsTableCardCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
