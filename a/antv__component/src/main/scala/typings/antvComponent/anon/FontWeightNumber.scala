package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightNumber extends StObject {
  
  var fontWeight: Double
}
object FontWeightNumber {
  
  inline def apply(fontWeight: Double): FontWeightNumber = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontWeightNumber] (val x: Self) extends AnyVal {
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
  }
}
