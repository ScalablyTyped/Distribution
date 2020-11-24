package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBackground extends js.Object {
  
  var line: StyleStroke = js.native
  
  var text: Offset = js.native
  
  var textBackground: Padding = js.native
}
object TextBackground {
  
  @scala.inline
  def apply(line: StyleStroke, text: Offset, textBackground: Padding): TextBackground = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textBackground = textBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBackground]
  }
  
  @scala.inline
  implicit class TextBackgroundOps[Self <: TextBackground] (val x: Self) extends AnyVal {
    
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
    def setLine(value: StyleStroke): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Offset): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBackground(value: Padding): Self = this.set("textBackground", value.asInstanceOf[js.Any])
  }
}
