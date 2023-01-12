package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLineDashArray extends StObject {
  
  var style: LineDashArray
}
object StyleLineDashArray {
  
  inline def apply(style: LineDashArray): StyleLineDashArray = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleLineDashArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleLineDashArray] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: LineDashArray): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
