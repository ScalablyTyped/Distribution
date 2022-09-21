package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenBase extends StObject {
  
  var parts: js.Array[String]
  
  var sourceSpan: ParseSourceSpan
  
  var `type`: TokenType2
}
object TokenBase {
  
  inline def apply(parts: js.Array[String], sourceSpan: ParseSourceSpan, `type`: TokenType2): TokenBase = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenBase]
  }
  
  extension [Self <: TokenBase](x: Self) {
    
    inline def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setType(value: TokenType2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
