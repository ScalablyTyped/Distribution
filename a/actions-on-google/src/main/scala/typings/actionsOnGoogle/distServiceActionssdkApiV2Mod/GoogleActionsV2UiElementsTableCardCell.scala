package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsTableCardCell extends StObject {
  
  /**
    * Text content of the cell.
    */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsTableCardCell {
  
  inline def apply(): GoogleActionsV2UiElementsTableCardCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardCell]
  }
  
  extension [Self <: GoogleActionsV2UiElementsTableCardCell](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
