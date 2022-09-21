package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorBgBody extends StObject {
  
  var colorBgBody: String
  
  var colorBgHeader: String
}
object ColorBgBody {
  
  inline def apply(colorBgBody: String, colorBgHeader: String): ColorBgBody = {
    val __obj = js.Dynamic.literal(colorBgBody = colorBgBody.asInstanceOf[js.Any], colorBgHeader = colorBgHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBgBody]
  }
  
  extension [Self <: ColorBgBody](x: Self) {
    
    inline def setColorBgBody(value: String): Self = StObject.set(x, "colorBgBody", value.asInstanceOf[js.Any])
    
    inline def setColorBgHeader(value: String): Self = StObject.set(x, "colorBgHeader", value.asInstanceOf[js.Any])
  }
}
