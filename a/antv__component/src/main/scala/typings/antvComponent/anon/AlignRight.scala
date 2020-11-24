package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignRight extends js.Object {
  
  var alignRight: Boolean = js.native
  
  var formatter: js.Any = js.native
  
  var style: FillFontSize = js.native
}
object AlignRight {
  
  @scala.inline
  def apply(alignRight: Boolean, formatter: js.Any, style: FillFontSize): AlignRight = {
    val __obj = js.Dynamic.literal(alignRight = alignRight.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignRight]
  }
  
  @scala.inline
  implicit class AlignRightOps[Self <: AlignRight] (val x: Self) extends AnyVal {
    
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
    def setAlignRight(value: Boolean): Self = this.set("alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatter(value: js.Any): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillFontSize): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
