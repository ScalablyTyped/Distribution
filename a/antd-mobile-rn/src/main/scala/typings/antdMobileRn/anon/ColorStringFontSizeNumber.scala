package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStringFontSizeNumber extends StObject {
  
  var color: String = js.native
  
  var fontSize: Double = js.native
}
object ColorStringFontSizeNumber {
  
  @scala.inline
  def apply(color: String, fontSize: Double): ColorStringFontSizeNumber = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStringFontSizeNumber]
  }
  
  @scala.inline
  implicit class ColorStringFontSizeNumberMutableBuilder[Self <: ColorStringFontSizeNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
