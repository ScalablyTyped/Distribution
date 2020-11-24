package typings.antvComponent.scrollbarScrollbarMod

import typings.antvComponent.anon.PartialReadonlyScrollbarS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarTheme extends js.Object {
  
  var default: js.UndefOr[PartialReadonlyScrollbarS] = js.native
  
  var hover: js.UndefOr[PartialReadonlyScrollbarS] = js.native
}
object ScrollbarTheme {
  
  @scala.inline
  def apply(): ScrollbarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarTheme]
  }
  
  @scala.inline
  implicit class ScrollbarThemeOps[Self <: ScrollbarTheme] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: PartialReadonlyScrollbarS): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setHover(value: PartialReadonlyScrollbarS): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
  }
}
