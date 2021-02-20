package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAlign extends StObject {
  
  var color: String = js.native
  
  var textAlign: String = js.native
}
object TextAlign {
  
  @scala.inline
  def apply(color: String, textAlign: String): TextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign]
  }
  
  @scala.inline
  implicit class TextAlignMutableBuilder[Self <: TextAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
