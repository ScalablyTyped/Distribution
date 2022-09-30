package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`16`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValueTextToken
  extends StObject
     with TokenBase
     with InterpolatedAttributeToken {
  
  @JSName("type")
  var type_AttributeValueTextToken: `16`
}
object AttributeValueTextToken {
  
  inline def apply(parts: js.Array[String], sourceSpan: ParseSourceSpan): AttributeValueTextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[AttributeValueTextToken]
  }
  
  extension [Self <: AttributeValueTextToken](x: Self) {
    
    inline def setType(value: `16`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
