package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2SimpleSelectItem extends js.Object {
  
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
  implicit class GoogleActionsV2SimpleSelectItemOps[Self <: GoogleActionsV2SimpleSelectItem] (val x: Self) extends AnyVal {
    
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
    def setOptionInfo(value: GoogleActionsV2OptionInfo): Self = this.set("optionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionInfo: Self = this.set("optionInfo", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
