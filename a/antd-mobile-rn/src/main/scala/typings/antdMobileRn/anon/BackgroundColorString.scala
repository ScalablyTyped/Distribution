package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorString extends StObject {
  
  var backgroundColor: String
}
object BackgroundColorString {
  
  @scala.inline
  def apply(backgroundColor: String): BackgroundColorString = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorString]
  }
  
  @scala.inline
  implicit class BackgroundColorStringMutableBuilder[Self <: BackgroundColorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
  }
}
