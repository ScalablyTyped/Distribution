package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLineCap extends StObject {
  
  var style: LineCap
}
object StyleLineCap {
  
  inline def apply(style: LineCap): StyleLineCap = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleLineCap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleLineCap] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: LineCap): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
