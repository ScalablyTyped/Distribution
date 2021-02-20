package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizePaddingLeft extends StObject {
  
  var color: String = js.native
  
  var fontSize: Double = js.native
  
  var paddingLeft: Double = js.native
}
object FontSizePaddingLeft {
  
  @scala.inline
  def apply(color: String, fontSize: Double, paddingLeft: Double): FontSizePaddingLeft = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePaddingLeft]
  }
  
  @scala.inline
  implicit class FontSizePaddingLeftMutableBuilder[Self <: FontSizePaddingLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
  }
}
