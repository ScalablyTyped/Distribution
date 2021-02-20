package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2SimpleSelectItem extends StObject {
  
  /**
    * Item key and synonyms.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.native
  
  /**
    * Title of the item. It will act as synonym if it's provided.
    * Optional
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2SimpleSelectItem {
  
  @scala.inline
  def apply(): GoogleActionsV2SimpleSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleSelectItem]
  }
  
  @scala.inline
  implicit class GoogleActionsV2SimpleSelectItemMutableBuilder[Self <: GoogleActionsV2SimpleSelectItem] (val x: Self) extends AnyVal {
    
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
