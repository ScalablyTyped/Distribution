package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingBottom extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var borderRadius: Double
  
  var borderWidth: Double
  
  var flexDirection: String
  
  var paddingBottom: Double
}
object PaddingBottom {
  
  inline def apply(
    backgroundColor: String,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    paddingBottom: Double
  ): PaddingBottom = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottom]
  }
  
  extension [Self <: PaddingBottom](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
  }
}
