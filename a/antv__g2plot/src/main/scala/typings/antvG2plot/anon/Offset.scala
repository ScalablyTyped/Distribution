package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: Double
  
  var style: TextAlign
}
object Offset {
  
  inline def apply(offset: Double, style: TextAlign): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: TextAlign): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
