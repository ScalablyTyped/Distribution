package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftWidth extends StObject {
  
  var borderLeftWidth: Double
  
  var borderRadius: Double
  
  var borderRightWidth: Double
}
object BorderLeftWidth {
  
  inline def apply(borderLeftWidth: Double, borderRadius: Double, borderRightWidth: Double): BorderLeftWidth = {
    val __obj = js.Dynamic.literal(borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftWidth]
  }
  
  extension [Self <: BorderLeftWidth](x: Self) {
    
    inline def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
  }
}
