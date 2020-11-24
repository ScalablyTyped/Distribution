package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedCustomShapeSegment extends js.Object {
  
  var Command: Double = js.native
  
  var Count: Double = js.native
}
object EnhancedCustomShapeSegment {
  
  @scala.inline
  def apply(Command: Double, Count: Double): EnhancedCustomShapeSegment = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeSegment]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeSegmentOps[Self <: EnhancedCustomShapeSegment] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: Double): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
  }
}
