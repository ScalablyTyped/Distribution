package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a 3-dimensional point. */
trait Position3D extends StObject {
  
  /** the position on the X-Axis in the 3D room in 100th of millimeters */
  var PositionX: Double
  
  /** the position on the Y-Axis in the 3D room in 100th of millimeters */
  var PositionY: Double
  
  /** the position on the Z-Axis in the 3D room in 100th of millimeters */
  var PositionZ: Double
}
object Position3D {
  
  inline def apply(PositionX: Double, PositionY: Double, PositionZ: Double): Position3D = {
    val __obj = js.Dynamic.literal(PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PositionZ = PositionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position3D]
  }
  
  extension [Self <: Position3D](x: Self) {
    
    inline def setPositionX(value: Double): Self = StObject.set(x, "PositionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: Double): Self = StObject.set(x, "PositionY", value.asInstanceOf[js.Any])
    
    inline def setPositionZ(value: Double): Self = StObject.set(x, "PositionZ", value.asInstanceOf[js.Any])
  }
}
