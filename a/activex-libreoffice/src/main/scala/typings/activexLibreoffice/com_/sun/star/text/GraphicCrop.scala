package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the cropping of graphic objects. Cropping means to show only parts of the object.
  *
  * Negative values cut the visible area; positive values extend the visible area by filling it with background color. The absolute sum of top and bottom
  * crop must be smaller than the objects original height. The absolute sum of the left and right crop must be smaller than the object's original width.
  *
  * If this property is applied to a graphic object, then this object will correct these values if necessary.
  */
trait GraphicCrop extends StObject {
  
  /** contains the bottom value to cut (if negative) or to extend (if positive) */
  var Bottom: Double
  
  /** contains the left value to cut (if negative) or to extend (if positive) */
  var Left: Double
  
  /** contains the right value to cut (if negative) or to extend (if positive) */
  var Right: Double
  
  /** contains the top value to cut (if negative) or to extend (if positive) */
  var Top: Double
}
object GraphicCrop {
  
  inline def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): GraphicCrop = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicCrop]
  }
  
  extension [Self <: GraphicCrop](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
