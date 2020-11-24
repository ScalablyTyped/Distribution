package typings.antd.transferListMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedItem[RecordType] extends js.Object {
  
  var item: RecordType = js.native
  
  var renderedEl: ReactNode = js.native
  
  var renderedText: String = js.native
}
object RenderedItem {
  
  @scala.inline
  def apply[RecordType](item: RecordType, renderedText: String): RenderedItem[RecordType] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedItem[RecordType]]
  }
  
  @scala.inline
  implicit class RenderedItemOps[Self <: RenderedItem[_], RecordType] (val x: Self with RenderedItem[RecordType]) extends AnyVal {
    
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
    def setItem(value: RecordType): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedText(value: String): Self = this.set("renderedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedEl(value: ReactNode): Self = this.set("renderedEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderedEl: Self = this.set("renderedEl", js.undefined)
  }
}
