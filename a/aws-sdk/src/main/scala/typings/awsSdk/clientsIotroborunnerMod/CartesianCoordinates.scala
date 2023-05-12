package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianCoordinates extends StObject {
  
  /**
    * X coordinate.
    */
  var x: Double
  
  /**
    * Y coordinate.
    */
  var y: Double
  
  /**
    * Z coordinate.
    */
  var z: js.UndefOr[Double] = js.undefined
}
object CartesianCoordinates {
  
  inline def apply(x: Double, y: Double): CartesianCoordinates = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartesianCoordinates] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
