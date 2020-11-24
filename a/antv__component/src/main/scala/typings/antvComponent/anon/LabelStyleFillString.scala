package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelStyleFillString extends js.Object {
  
  var labelStyle: FillString = js.native
}
object LabelStyleFillString {
  
  @scala.inline
  def apply(labelStyle: FillString): LabelStyleFillString = {
    val __obj = js.Dynamic.literal(labelStyle = labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyleFillString]
  }
  
  @scala.inline
  implicit class LabelStyleFillStringOps[Self <: LabelStyleFillString] (val x: Self) extends AnyVal {
    
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
    def setLabelStyle(value: FillString): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
  }
}
