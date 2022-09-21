package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerNumbers.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValueInterpolationToken
  extends StObject
     with TokenBase
     with InterpolatedAttributeToken {
  
  @JSName("parts")
  var parts_AttributeValueInterpolationToken: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String])
  
  @JSName("type")
  var type_AttributeValueInterpolationToken: `17`
}
object AttributeValueInterpolationToken {
  
  inline def apply(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): AttributeValueInterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[AttributeValueInterpolationToken]
  }
  
  extension [Self <: AttributeValueInterpolationToken](x: Self) {
    
    inline def setParts(
      value: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String])
    ): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setType(value: `17`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
