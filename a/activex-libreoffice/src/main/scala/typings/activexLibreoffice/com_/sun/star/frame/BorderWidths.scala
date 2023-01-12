package typings.activexLibreoffice.com_.sun.star.frame

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a border area by offsets from each side. */
trait BorderWidths extends StObject {
  
  /** specifies the offset from bottom border. */
  var Bottom: Double
  
  /** specifies the offset from left border. */
  var Left: Double
  
  /** specifies the offset from right border. */
  var Right: Double
  
  /** specifies the offset from top border. */
  var Top: Double
}
object BorderWidths {
  
  inline def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): BorderWidths = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderWidths] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
