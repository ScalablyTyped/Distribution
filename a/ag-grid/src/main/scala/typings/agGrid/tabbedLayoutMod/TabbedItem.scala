package typings.agGrid.tabbedLayoutMod

import typings.agGrid.utilsMod.Promise
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedItem extends js.Object {
  
  var afterAttachedCallback: js.UndefOr[js.Function] = js.native
  
  var bodyPromise: Promise[HTMLElement] = js.native
  
  var name: String = js.native
  
  var title: Element = js.native
}
object TabbedItem {
  
  @scala.inline
  def apply(bodyPromise: Promise[HTMLElement], name: String, title: Element): TabbedItem = {
    val __obj = js.Dynamic.literal(bodyPromise = bodyPromise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedItem]
  }
  
  @scala.inline
  implicit class TabbedItemOps[Self <: TabbedItem] (val x: Self) extends AnyVal {
    
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
    def setBodyPromise(value: Promise[HTMLElement]): Self = this.set("bodyPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Element): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterAttachedCallback(value: js.Function): Self = this.set("afterAttachedCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterAttachedCallback: Self = this.set("afterAttachedCallback", js.undefined)
  }
}
