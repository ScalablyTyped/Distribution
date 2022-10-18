package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SimpleSelectItem extends StObject {
  
  /**
    * Item key and synonyms.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.undefined
  
  /**
    * Title of the item. It will act as synonym if it's provided.
    * Optional
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2SimpleSelectItem {
  
  inline def apply(): GoogleActionsV2SimpleSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleSelectItem]
  }
  
  extension [Self <: GoogleActionsV2SimpleSelectItem](x: Self) {
    
    inline def setOptionInfo(value: GoogleActionsV2OptionInfo): Self = StObject.set(x, "optionInfo", value.asInstanceOf[js.Any])
    
    inline def setOptionInfoUndefined: Self = StObject.set(x, "optionInfo", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
