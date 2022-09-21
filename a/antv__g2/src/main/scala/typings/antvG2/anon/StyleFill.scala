package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFill extends StObject {
  
  var style: Fill
}
object StyleFill {
  
  inline def apply(style: Fill): StyleFill = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFill]
  }
  
  extension [Self <: StyleFill](x: Self) {
    
    inline def setStyle(value: Fill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
