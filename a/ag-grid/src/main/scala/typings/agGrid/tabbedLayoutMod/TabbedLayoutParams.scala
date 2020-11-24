package typings.agGrid.tabbedLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedLayoutParams extends js.Object {
  
  var cssClass: js.UndefOr[String] = js.native
  
  var items: js.Array[TabbedItem] = js.native
  
  var onActiveItemClicked: js.UndefOr[js.Function] = js.native
  
  var onItemClicked: js.UndefOr[js.Function] = js.native
}
object TabbedLayoutParams {
  
  @scala.inline
  def apply(items: js.Array[TabbedItem]): TabbedLayoutParams = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedLayoutParams]
  }
  
  @scala.inline
  implicit class TabbedLayoutParamsOps[Self <: TabbedLayoutParams] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: TabbedItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TabbedItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setOnActiveItemClicked(value: js.Function): Self = this.set("onActiveItemClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnActiveItemClicked: Self = this.set("onActiveItemClicked", js.undefined)
    
    @scala.inline
    def setOnItemClicked(value: js.Function): Self = this.set("onItemClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnItemClicked: Self = this.set("onItemClicked", js.undefined)
  }
}
