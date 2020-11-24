package typings.antvGMath.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxX extends js.Object {
  
  var maxX: js.Any = js.native
  
  var maxY: js.Any = js.native
  
  var minX: js.Any = js.native
  
  var minY: js.Any = js.native
}
object MaxX {
  
  @scala.inline
  def apply(maxX: js.Any, maxY: js.Any, minX: js.Any, minY: js.Any): MaxX = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxX]
  }
  
  @scala.inline
  implicit class MaxXOps[Self <: MaxX] (val x: Self) extends AnyVal {
    
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
    def setMaxX(value: js.Any): Self = this.set("maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: js.Any): Self = this.set("maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: js.Any): Self = this.set("minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: js.Any): Self = this.set("minY", value.asInstanceOf[js.Any])
  }
}
