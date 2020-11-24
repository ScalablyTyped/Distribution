package typings.antvComponent.scrollbarScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollbarStyle extends js.Object {
  
  var lineCap: String = js.native
  
  var size: Double = js.native
  
  var thumbColor: String = js.native
  
  var trackColor: String = js.native
}
object ScrollbarStyle {
  
  @scala.inline
  def apply(lineCap: String, size: Double, thumbColor: String, trackColor: String): ScrollbarStyle = {
    val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbColor = thumbColor.asInstanceOf[js.Any], trackColor = trackColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarStyle]
  }
  
  @scala.inline
  implicit class ScrollbarStyleOps[Self <: ScrollbarStyle] (val x: Self) extends AnyVal {
    
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
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbColor(value: String): Self = this.set("thumbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackColor(value: String): Self = this.set("trackColor", value.asInstanceOf[js.Any])
  }
}
