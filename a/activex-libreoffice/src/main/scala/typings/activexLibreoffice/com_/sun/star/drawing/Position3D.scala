package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a 3-dimensional point. */
@js.native
trait Position3D extends js.Object {
  
  /** the position on the X-Axis in the 3D room in 100th of millimeters */
  var PositionX: Double = js.native
  
  /** the position on the Y-Axis in the 3D room in 100th of millimeters */
  var PositionY: Double = js.native
  
  /** the position on the Z-Axis in the 3D room in 100th of millimeters */
  var PositionZ: Double = js.native
}
object Position3D {
  
  @scala.inline
  def apply(PositionX: Double, PositionY: Double, PositionZ: Double): Position3D = {
    val __obj = js.Dynamic.literal(PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PositionZ = PositionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position3D]
  }
  
  @scala.inline
  implicit class Position3DOps[Self <: Position3D] (val x: Self) extends AnyVal {
    
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
    def setPositionX(value: Double): Self = this.set("PositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionY(value: Double): Self = this.set("PositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionZ(value: Double): Self = this.set("PositionZ", value.asInstanceOf[js.Any])
  }
}
