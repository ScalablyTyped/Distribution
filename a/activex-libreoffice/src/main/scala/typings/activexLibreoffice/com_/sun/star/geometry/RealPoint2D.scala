package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure defines a two-dimensional point
  *
  * This structure contains x and y real-valued coordinates of a two-dimensional point.
  * @since OOo 2.0
  */
trait RealPoint2D extends StObject {
  
  var X: Double
  
  var Y: Double
}
object RealPoint2D {
  
  inline def apply(X: Double, Y: Double): RealPoint2D = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealPoint2D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealPoint2D] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
