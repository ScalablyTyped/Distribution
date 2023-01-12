package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomRightRadius extends StObject {
  
  var borderBottomLeftRadius: Double
  
  var borderBottomRightRadius: Double
}
object BorderBottomRightRadius {
  
  inline def apply(borderBottomLeftRadius: Double, borderBottomRightRadius: Double): BorderBottomRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomRightRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderBottomRightRadius] (val x: Self) extends AnyVal {
    
    inline def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
  }
}
