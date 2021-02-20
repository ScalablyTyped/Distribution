package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorFontFamily extends StObject {
  
  var backgroundColor: js.UndefOr[scala.Nothing] = js.native
  
  var color: String = js.native
  
  var fontFamily: String = js.native
  
  var position: String = js.native
}
object ColorFontFamily {
  
  @scala.inline
  def apply(color: String, fontFamily: String, position: String): ColorFontFamily = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFontFamily]
  }
  
  @scala.inline
  implicit class ColorFontFamilyMutableBuilder[Self <: ColorFontFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
