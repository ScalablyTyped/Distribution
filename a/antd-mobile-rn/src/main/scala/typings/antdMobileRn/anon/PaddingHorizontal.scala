package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingHorizontal extends StObject {
  
  var flexDirection: String
  
  var paddingHorizontal: Double
}
object PaddingHorizontal {
  
  inline def apply(flexDirection: String, paddingHorizontal: Double): PaddingHorizontal = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingHorizontal]
  }
  
  extension [Self <: PaddingHorizontal](x: Self) {
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
