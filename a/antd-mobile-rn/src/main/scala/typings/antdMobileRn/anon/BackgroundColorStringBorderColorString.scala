package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorStringBorderColorString extends StObject {
  
  var backgroundColor: String = js.native
  
  var borderColor: String = js.native
}
object BackgroundColorStringBorderColorString {
  
  @scala.inline
  def apply(backgroundColor: String, borderColor: String): BackgroundColorStringBorderColorString = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorStringBorderColorString]
  }
  
  @scala.inline
  implicit class BackgroundColorStringBorderColorStringMutableBuilder[Self <: BackgroundColorStringBorderColorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
  }
}
