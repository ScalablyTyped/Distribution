package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SimpleSelect extends StObject {
  
  /**
    * List of items users should select from.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2SimpleSelectItem]] = js.undefined
}
object GoogleActionsV2SimpleSelect {
  
  inline def apply(): GoogleActionsV2SimpleSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleSelect]
  }
  
  extension [Self <: GoogleActionsV2SimpleSelect](x: Self) {
    
    inline def setItems(value: js.Array[GoogleActionsV2SimpleSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleActionsV2SimpleSelectItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
