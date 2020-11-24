package typings.antvUtil.parseRadiusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusType extends js.Object {
  
  var r1: Double = js.native
  
  var r2: Double = js.native
  
  var r3: Double = js.native
  
  var r4: Double = js.native
}
object RadiusType {
  
  @scala.inline
  def apply(r1: Double, r2: Double, r3: Double, r4: Double): RadiusType = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], r3 = r3.asInstanceOf[js.Any], r4 = r4.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusType]
  }
  
  @scala.inline
  implicit class RadiusTypeOps[Self <: RadiusType] (val x: Self) extends AnyVal {
    
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
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR3(value: Double): Self = this.set("r3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR4(value: Double): Self = this.set("r4", value.asInstanceOf[js.Any])
  }
}
