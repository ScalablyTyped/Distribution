package typings.antd.transButtonMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransButtonProps extends HTMLAttributes[HTMLDivElement] {
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var noStyle: js.UndefOr[Boolean] = js.native
  
  @JSName("onClick")
  var onClick_TransButtonProps: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
  ] = js.native
}
object TransButtonProps {
  
  @scala.inline
  def apply(): TransButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransButtonProps]
  }
  
  @scala.inline
  implicit class TransButtonPropsOps[Self <: TransButtonProps] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setNoStyle(value: Boolean): Self = this.set("noStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStyle: Self = this.set("noStyle", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
}
