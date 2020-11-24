package typings.antd.affixMod

import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffixState extends js.Object {
  
  var affixStyle: js.UndefOr[CSSProperties] = js.native
  
  var lastAffix: Boolean = js.native
  
  var placeholderStyle: js.UndefOr[CSSProperties] = js.native
  
  var prevTarget: Window | HTMLElement | Null = js.native
  
  var status: AffixStatus = js.native
}
object AffixState {
  
  @scala.inline
  def apply(lastAffix: Boolean, status: AffixStatus): AffixState = {
    val __obj = js.Dynamic.literal(lastAffix = lastAffix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixState]
  }
  
  @scala.inline
  implicit class AffixStateOps[Self <: AffixState] (val x: Self) extends AnyVal {
    
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
    def setLastAffix(value: Boolean): Self = this.set("lastAffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AffixStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffixStyle(value: CSSProperties): Self = this.set("affixStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffixStyle: Self = this.set("affixStyle", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: CSSProperties): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    
    @scala.inline
    def setPrevTarget(value: Window | HTMLElement): Self = this.set("prevTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevTargetNull: Self = this.set("prevTarget", null)
  }
}
