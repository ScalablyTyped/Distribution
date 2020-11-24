package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustY extends js.Object {
  
  var adjustX: Boolean = js.native
  
  var adjustY: Boolean = js.native
}
object AdjustY {
  
  @scala.inline
  def apply(adjustX: Boolean, adjustY: Boolean): AdjustY = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustY]
  }
  
  @scala.inline
  implicit class AdjustYOps[Self <: AdjustY] (val x: Self) extends AnyVal {
    
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
    def setAdjustX(value: Boolean): Self = this.set("adjustX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustY(value: Boolean): Self = this.set("adjustY", value.asInstanceOf[js.Any])
  }
}
