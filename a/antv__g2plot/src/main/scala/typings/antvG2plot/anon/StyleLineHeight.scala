package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLineHeight extends StObject {
  
  var style: LineHeight
}
object StyleLineHeight {
  
  inline def apply(style: LineHeight): StyleLineHeight = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleLineHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleLineHeight] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: LineHeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
