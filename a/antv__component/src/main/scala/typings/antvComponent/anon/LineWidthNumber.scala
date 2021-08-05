package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineWidthNumber extends StObject {
  
  var lineWidth: Double
}
object LineWidthNumber {
  
  inline def apply(lineWidth: Double): LineWidthNumber = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidthNumber]
  }
  
  extension [Self <: LineWidthNumber](x: Self) {
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
  }
}
