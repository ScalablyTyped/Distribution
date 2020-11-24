package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends js.Object {
  
  var line: Length = js.native
  
  var point: Display = js.native
  
  var text: Content = js.native
}
object Line {
  
  @scala.inline
  def apply(line: Length, point: Display, text: Content): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
    
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
    def setLine(value: Length): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Display): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Content): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
