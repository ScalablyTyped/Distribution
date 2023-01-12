package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgColor extends StObject {
  
  var bgColor: String
  
  var bgColorHover: String
  
  var bgColorSelected: String
}
object BgColor {
  
  inline def apply(bgColor: String, bgColorHover: String, bgColorSelected: String): BgColor = {
    val __obj = js.Dynamic.literal(bgColor = bgColor.asInstanceOf[js.Any], bgColorHover = bgColorHover.asInstanceOf[js.Any], bgColorSelected = bgColorSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BgColor] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorHover(value: String): Self = StObject.set(x, "bgColorHover", value.asInstanceOf[js.Any])
    
    inline def setBgColorSelected(value: String): Self = StObject.set(x, "bgColorSelected", value.asInstanceOf[js.Any])
  }
}
