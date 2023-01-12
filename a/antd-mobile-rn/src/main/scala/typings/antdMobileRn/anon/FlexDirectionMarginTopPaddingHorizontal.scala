package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionMarginTopPaddingHorizontal extends StObject {
  
  var flexDirection: String
  
  var marginTop: Double
  
  var paddingHorizontal: Double
}
object FlexDirectionMarginTopPaddingHorizontal {
  
  inline def apply(flexDirection: String, marginTop: Double, paddingHorizontal: Double): FlexDirectionMarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionMarginTopPaddingHorizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexDirectionMarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
