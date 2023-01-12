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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineWidthNumber] (val x: Self) extends AnyVal {
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
  }
}
