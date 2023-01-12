package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleR extends StObject {
  
  var style: R
}
object StyleR {
  
  inline def apply(style: R): StyleR = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleR] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: R): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
