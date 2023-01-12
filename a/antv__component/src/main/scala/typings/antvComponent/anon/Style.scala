package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var style: Opacity
}
object Style {
  
  inline def apply(style: Opacity): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: Opacity): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
