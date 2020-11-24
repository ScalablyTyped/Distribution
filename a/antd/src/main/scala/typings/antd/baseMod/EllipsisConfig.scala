package typings.antd.baseMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EllipsisConfig extends js.Object {
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.native
  
  var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var suffix: js.UndefOr[String] = js.native
  
  var symbol: js.UndefOr[ReactNode] = js.native
}
object EllipsisConfig {
  
  @scala.inline
  def apply(): EllipsisConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EllipsisConfig]
  }
  
  @scala.inline
  implicit class EllipsisConfigOps[Self <: EllipsisConfig] (val x: Self) extends AnyVal {
    
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
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setOnEllipsis(value: /* ellipsis */ Boolean => Unit): Self = this.set("onEllipsis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEllipsis: Self = this.set("onEllipsis", js.undefined)
    
    @scala.inline
    def setOnExpand(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setSymbol(value: ReactNode): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
}
