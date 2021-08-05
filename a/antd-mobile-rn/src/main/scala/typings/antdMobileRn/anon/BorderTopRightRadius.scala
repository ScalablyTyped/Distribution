package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopRightRadius extends StObject {
  
  var borderBottomRightRadius: Double
  
  var borderTopRightRadius: Double
}
object BorderTopRightRadius {
  
  inline def apply(borderBottomRightRadius: Double, borderTopRightRadius: Double): BorderTopRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopRightRadius]
  }
  
  extension [Self <: BorderTopRightRadius](x: Self) {
    
    inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
  }
}
