package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationToken
  extends StObject
     with TokenBase
     with InterpolatedTextToken {
  
  @JSName("parts")
  var parts_InterpolationToken: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String])
  
  @JSName("type")
  var type_InterpolationToken: `8`
}
object InterpolationToken {
  
  inline def apply(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): InterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[InterpolationToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationToken] (val x: Self) extends AnyVal {
    
    inline def setParts(
      value: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String])
    ): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setType(value: `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
