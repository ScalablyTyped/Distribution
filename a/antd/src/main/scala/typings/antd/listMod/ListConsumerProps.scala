package typings.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConsumerProps extends js.Object {
  
  var grid: js.UndefOr[js.Any] = js.native
  
  var itemLayout: js.UndefOr[String] = js.native
}
object ListConsumerProps {
  
  @scala.inline
  def apply(): ListConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConsumerProps]
  }
  
  @scala.inline
  implicit class ListConsumerPropsOps[Self <: ListConsumerProps] (val x: Self) extends AnyVal {
    
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
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setItemLayout(value: String): Self = this.set("itemLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemLayout: Self = this.set("itemLayout", js.undefined)
  }
}
