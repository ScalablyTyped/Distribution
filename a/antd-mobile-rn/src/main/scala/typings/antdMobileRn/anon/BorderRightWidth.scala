package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightWidth extends StObject {
  
  var borderRightWidth: Double
  
  var height: Double
}
object BorderRightWidth {
  
  inline def apply(borderRightWidth: Double, height: Double): BorderRightWidth = {
    val __obj = js.Dynamic.literal(borderRightWidth = borderRightWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderRightWidth] (val x: Self) extends AnyVal {
    
    inline def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
