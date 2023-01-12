package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMarginBottom extends StObject {
  
  var height: Double
  
  var marginBottom: Double
  
  var width: Double
}
object HeightMarginBottom {
  
  inline def apply(height: Double, marginBottom: Double, width: Double): HeightMarginBottom = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMarginBottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeightMarginBottom] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
