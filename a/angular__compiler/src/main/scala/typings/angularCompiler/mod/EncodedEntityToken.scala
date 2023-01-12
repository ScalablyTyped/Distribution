package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedEntityToken
  extends StObject
     with TokenBase
     with InterpolatedAttributeToken
     with InterpolatedTextToken {
  
  @JSName("parts")
  var parts_EncodedEntityToken: js.Tuple2[/* decoded */ String, /* encoded */ String]
  
  @JSName("type")
  var type_EncodedEntityToken: `9`
}
object EncodedEntityToken {
  
  inline def apply(parts: js.Tuple2[/* decoded */ String, /* encoded */ String], sourceSpan: ParseSourceSpan): EncodedEntityToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[EncodedEntityToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedEntityToken] (val x: Self) extends AnyVal {
    
    inline def setParts(value: js.Tuple2[/* decoded */ String, /* encoded */ String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setType(value: `9`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
