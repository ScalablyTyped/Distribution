package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  var padding: js.Array[Double]
  
  var style: Fill
}
object Padding {
  
  inline def apply(padding: js.Array[Double], style: Fill): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setStyle(value: Fill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
