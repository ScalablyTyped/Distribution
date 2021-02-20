package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorTextAlign extends StObject {
  
  var color: String = js.native
  
  var textAlign: String = js.native
}
object ColorTextAlign {
  
  @scala.inline
  def apply(color: String, textAlign: String): ColorTextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTextAlign]
  }
  
  @scala.inline
  implicit class ColorTextAlignMutableBuilder[Self <: ColorTextAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
