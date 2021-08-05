package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFillOpacity extends StObject {
  
  var style: FillOpacity
}
object StyleFillOpacity {
  
  inline def apply(style: FillOpacity): StyleFillOpacity = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFillOpacity]
  }
  
  extension [Self <: StyleFillOpacity](x: Self) {
    
    inline def setStyle(value: FillOpacity): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
