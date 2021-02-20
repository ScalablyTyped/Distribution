package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizeNumber extends StObject {
  
  var fontSize: Double = js.native
}
object FontSizeNumber {
  
  @scala.inline
  def apply(fontSize: Double): FontSizeNumber = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumber]
  }
  
  @scala.inline
  implicit class FontSizeNumberMutableBuilder[Self <: FontSizeNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
