package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure to hold the cooked and raw strings of a template literal element, along with its
  * source-span range.
  */
trait CookedRawString extends StObject {
  
  var cooked: String
  
  var range: ParseSourceSpan | Null
  
  var raw: String
}
object CookedRawString {
  
  inline def apply(cooked: String, raw: String): CookedRawString = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], range = null)
    __obj.asInstanceOf[CookedRawString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookedRawString] (val x: Self) extends AnyVal {
    
    inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    inline def setRange(value: ParseSourceSpan): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
