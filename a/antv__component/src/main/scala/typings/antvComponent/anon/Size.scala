package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: Double
  
  var style: FillStroke
}
object Size {
  
  inline def apply(size: Double, style: FillStroke): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FillStroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
