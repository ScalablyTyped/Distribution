package typings.antDesignProUtils.dropdownFooterMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownFooterProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onClear: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
}
object DropdownFooterProps {
  
  @scala.inline
  def apply(): DropdownFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownFooterProps]
  }
  
  @scala.inline
  implicit class DropdownFooterPropsOps[Self <: DropdownFooterProps] (val x: Self) extends AnyVal {
    
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
    def setOnClear(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
  }
}
