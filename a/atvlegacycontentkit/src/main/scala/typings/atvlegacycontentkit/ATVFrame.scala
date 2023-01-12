package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVFrame extends StObject {
  
  /**
    * The height of this screen.
    */
  var height: Double
  
  /**
    * The width of this screen.
    */
  var width: Double
  
  /**
    * The x coordinate of this screen.
    */
  var x: Double
  
  /**
    * The y coordinate of this screen.
    */
  var y: Double
}
object ATVFrame {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ATVFrame = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVFrame] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
