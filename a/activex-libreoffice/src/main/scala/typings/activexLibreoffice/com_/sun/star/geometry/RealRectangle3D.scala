package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains the necessary information for a three-dimensional cube.
  * @since OOo 2.0
  */
trait RealRectangle3D extends StObject {
  
  var X1: Double
  
  /**
    * maximum X coordinate.
    *
    * Must be greater than X1 for non-empty cubes.
    *
    * .
    */
  var X2: Double
  
  var Y1: Double
  
  /**
    * maximum Y coordinate.
    *
    * Must be greater than Y1 for non-empty cubes.
    */
  var Y2: Double
  
  var Z1: Double
  
  /**
    * maximum Z coordinate.
    *
    * Must be greater than Z1 for non-empty cubes.
    */
  var Z2: Double
}
object RealRectangle3D {
  
  inline def apply(X1: Double, X2: Double, Y1: Double, Y2: Double, Z1: Double, Z2: Double): RealRectangle3D = {
    val __obj = js.Dynamic.literal(X1 = X1.asInstanceOf[js.Any], X2 = X2.asInstanceOf[js.Any], Y1 = Y1.asInstanceOf[js.Any], Y2 = Y2.asInstanceOf[js.Any], Z1 = Z1.asInstanceOf[js.Any], Z2 = Z2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealRectangle3D]
  }
  
  extension [Self <: RealRectangle3D](x: Self) {
    
    inline def setX1(value: Double): Self = StObject.set(x, "X1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "X2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "Y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "Y2", value.asInstanceOf[js.Any])
    
    inline def setZ1(value: Double): Self = StObject.set(x, "Z1", value.asInstanceOf[js.Any])
    
    inline def setZ2(value: Double): Self = StObject.set(x, "Z2", value.asInstanceOf[js.Any])
  }
}
