package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWidthNumber extends js.Object {
  
  var lineWidth: Double = js.native
}
object LineWidthNumber {
  
  @scala.inline
  def apply(lineWidth: Double): LineWidthNumber = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidthNumber]
  }
  
  @scala.inline
  implicit class LineWidthNumberOps[Self <: LineWidthNumber] (val x: Self) extends AnyVal {
    
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
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
  }
}
