package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawString extends StObject {
  
  var raw: String
  
  var rawValue: String
}
object RawString {
  
  inline def apply(raw: String, rawValue: String): RawString = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawString]
  }
  
  extension [Self <: RawString](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
  }
}
