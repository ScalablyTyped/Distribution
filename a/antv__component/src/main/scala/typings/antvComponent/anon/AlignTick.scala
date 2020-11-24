package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignTick extends js.Object {
  
  var alignTick: Boolean = js.native
  
  var displayWithLabel: Boolean = js.native
  
  var length: Double = js.native
  
  var style: Stroke = js.native
}
object AlignTick {
  
  @scala.inline
  def apply(alignTick: Boolean, displayWithLabel: Boolean, length: Double, style: Stroke): AlignTick = {
    val __obj = js.Dynamic.literal(alignTick = alignTick.asInstanceOf[js.Any], displayWithLabel = displayWithLabel.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTick]
  }
  
  @scala.inline
  implicit class AlignTickOps[Self <: AlignTick] (val x: Self) extends AnyVal {
    
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
    def setAlignTick(value: Boolean): Self = this.set("alignTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayWithLabel(value: Boolean): Self = this.set("displayWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Stroke): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
