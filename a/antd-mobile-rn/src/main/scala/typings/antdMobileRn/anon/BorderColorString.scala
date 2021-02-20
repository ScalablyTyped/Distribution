package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColorString extends StObject {
  
  var borderColor: String = js.native
}
object BorderColorString {
  
  @scala.inline
  def apply(borderColor: String): BorderColorString = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorString]
  }
  
  @scala.inline
  implicit class BorderColorStringMutableBuilder[Self <: BorderColorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
  }
}
