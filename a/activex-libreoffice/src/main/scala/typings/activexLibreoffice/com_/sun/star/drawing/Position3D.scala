package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a 3-dimensional point. */
@js.native
trait Position3D extends StObject {
  
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
  implicit class Position3DMutableBuilder[Self <: Position3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPositionX(value: Double): Self = StObject.set(x, "PositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionY(value: Double): Self = StObject.set(x, "PositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionZ(value: Double): Self = StObject.set(x, "PositionZ", value.asInstanceOf[js.Any])
  }
}
