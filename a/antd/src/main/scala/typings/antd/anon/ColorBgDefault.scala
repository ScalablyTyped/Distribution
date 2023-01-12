package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorBgDefault extends StObject {
  
  var colorBgDefault: String
  
  var zIndexPopup: Double
}
object ColorBgDefault {
  
  inline def apply(colorBgDefault: String, zIndexPopup: Double): ColorBgDefault = {
    val __obj = js.Dynamic.literal(colorBgDefault = colorBgDefault.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBgDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorBgDefault] (val x: Self) extends AnyVal {
    
    inline def setColorBgDefault(value: String): Self = StObject.set(x, "colorBgDefault", value.asInstanceOf[js.Any])
    
    inline def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
  }
}
