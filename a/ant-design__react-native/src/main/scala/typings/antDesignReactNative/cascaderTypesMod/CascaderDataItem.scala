package typings.antDesignReactNative.cascaderTypesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascaderDataItem extends js.Object {
  
  var children: js.UndefOr[js.Array[CascaderDataItem]] = js.native
  
  var label: ReactNode = js.native
  
  var value: CascaderOneValue = js.native
}
object CascaderDataItem {
  
  @scala.inline
  def apply(value: CascaderOneValue): CascaderDataItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderDataItem]
  }
  
  @scala.inline
  implicit class CascaderDataItemOps[Self <: CascaderDataItem] (val x: Self) extends AnyVal {
    
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
    def setValue(value: CascaderOneValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: CascaderDataItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[CascaderDataItem]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
