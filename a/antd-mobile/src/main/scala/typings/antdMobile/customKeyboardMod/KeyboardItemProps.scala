package typings.antdMobile.customKeyboardMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.std.HTMLTableDataCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardItemProps extends HTMLTableDataProps {
  
  var iconOnly: js.UndefOr[Boolean] = js.native
  
  def onClick(event: MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], value: String): Unit = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var tdRef: js.UndefOr[Ref[HTMLTableDataCellElement]] = js.native
}
object KeyboardItemProps {
  
  @scala.inline
  def apply(onClick: (MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], String) => Unit): KeyboardItemProps = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[KeyboardItemProps]
  }
  
  @scala.inline
  implicit class KeyboardItemPropsOps[Self <: KeyboardItemProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: (MouseEvent[HTMLTableDataCellElement, NativeMouseEvent], String) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIconOnly(value: Boolean): Self = this.set("iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconOnly: Self = this.set("iconOnly", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setTdRefFunction1(value: /* instance */ HTMLTableDataCellElement | Null => Unit): Self = this.set("tdRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTdRef(value: Ref[HTMLTableDataCellElement]): Self = this.set("tdRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdRef: Self = this.set("tdRef", js.undefined)
    
    @scala.inline
    def setTdRefNull: Self = this.set("tdRef", null)
  }
}
