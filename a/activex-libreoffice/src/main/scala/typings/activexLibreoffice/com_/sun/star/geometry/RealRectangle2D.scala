package typings.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains the necessary information for a two-dimensional rectangle.
  * @since OOo 2.0
  */
trait RealRectangle2D extends StObject {
  
  var X1: Double
  
  /**
    * X coordinate of lower right corner.
    *
    * Must be greater than x1 for non-empty rectangles.
    *
    * .
    */
  var X2: Double
  
  var Y1: Double
  
  /**
    * Y coordinate of lower right corner.
    *
    * Must be greater than y1 for non-empty rectangles.
    */
  var Y2: Double
}
object RealRectangle2D {
  
  inline def apply(X1: Double, X2: Double, Y1: Double, Y2: Double): RealRectangle2D = {
    val __obj = js.Dynamic.literal(X1 = X1.asInstanceOf[js.Any], X2 = X2.asInstanceOf[js.Any], Y1 = Y1.asInstanceOf[js.Any], Y2 = Y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealRectangle2D]
  }
  
  extension [Self <: RealRectangle2D](x: Self) {
    
    inline def setX1(value: Double): Self = StObject.set(x, "X1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "X2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "Y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "Y2", value.asInstanceOf[js.Any])
  }
}
