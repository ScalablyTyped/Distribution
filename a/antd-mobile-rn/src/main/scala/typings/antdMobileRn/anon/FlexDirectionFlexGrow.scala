package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionFlexGrow extends StObject {
  
  var flexDirection: String
  
  var flexGrow: Double
}
object FlexDirectionFlexGrow {
  
  inline def apply(flexDirection: String, flexGrow: Double): FlexDirectionFlexGrow = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionFlexGrow]
  }
  
  extension [Self <: FlexDirectionFlexGrow](x: Self) {
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
  }
}
