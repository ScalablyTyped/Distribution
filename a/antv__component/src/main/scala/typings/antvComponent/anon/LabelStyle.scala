package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelStyle extends js.Object {
  
  var labelStyle: FontWeightNumber = js.native
  
  var tickLineStyle: LineWidthNumber = js.native
}
object LabelStyle {
  
  @scala.inline
  def apply(labelStyle: FontWeightNumber, tickLineStyle: LineWidthNumber): LabelStyle = {
    val __obj = js.Dynamic.literal(labelStyle = labelStyle.asInstanceOf[js.Any], tickLineStyle = tickLineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
  
  @scala.inline
  implicit class LabelStyleOps[Self <: LabelStyle] (val x: Self) extends AnyVal {
    
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
    def setLabelStyle(value: FontWeightNumber): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineStyle(value: LineWidthNumber): Self = this.set("tickLineStyle", value.asInstanceOf[js.Any])
  }
}
