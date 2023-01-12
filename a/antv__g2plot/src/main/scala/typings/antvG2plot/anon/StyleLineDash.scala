package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLineDash extends StObject {
  
  var style: LineDash
}
object StyleLineDash {
  
  inline def apply(style: LineDash): StyleLineDash = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleLineDash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleLineDash] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: LineDash): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
