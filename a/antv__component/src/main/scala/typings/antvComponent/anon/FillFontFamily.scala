package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillFontFamily extends StObject {
  
  var fill: String = js.native
  
  var fontFamily: String = js.native
  
  var textAlign: String = js.native
  
  var textBaseline: String = js.native
}
object FillFontFamily {
  
  @scala.inline
  def apply(fill: String, fontFamily: String, textAlign: String, textBaseline: String): FillFontFamily = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFontFamily]
  }
  
  @scala.inline
  implicit class FillFontFamilyMutableBuilder[Self <: FillFontFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
