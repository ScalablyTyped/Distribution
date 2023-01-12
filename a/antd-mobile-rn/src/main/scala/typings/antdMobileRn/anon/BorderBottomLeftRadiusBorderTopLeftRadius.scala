package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomLeftRadiusBorderTopLeftRadius extends StObject {
  
  var borderBottomLeftRadius: Double
  
  var borderTopLeftRadius: Double
}
object BorderBottomLeftRadiusBorderTopLeftRadius {
  
  inline def apply(borderBottomLeftRadius: Double, borderTopLeftRadius: Double): BorderBottomLeftRadiusBorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomLeftRadiusBorderTopLeftRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderBottomLeftRadiusBorderTopLeftRadius] (val x: Self) extends AnyVal {
    
    inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
  }
}
