package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFlexFontSize extends StObject {
  
  var color: String = js.native
  
  var flex: Double = js.native
  
  var fontSize: Double = js.native
}
object ColorFlexFontSize {
  
  @scala.inline
  def apply(color: String, flex: Double, fontSize: Double): ColorFlexFontSize = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFlexFontSize]
  }
  
  @scala.inline
  implicit class ColorFlexFontSizeMutableBuilder[Self <: ColorFlexFontSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
