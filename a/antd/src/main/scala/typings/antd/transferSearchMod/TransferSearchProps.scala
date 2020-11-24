package typings.antd.transferSearchMod

import typings.react.mod.FormEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferSearchProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var handleClear: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ FormEvent[HTMLElement], Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TransferSearchProps {
  
  @scala.inline
  def apply(): TransferSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferSearchProps]
  }
  
  @scala.inline
  implicit class TransferSearchPropsOps[Self <: TransferSearchProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHandleClear(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("handleClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleClear: Self = this.set("handleClear", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ FormEvent[HTMLElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
