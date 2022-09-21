package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.mod.AttributeValueTextToken
  - typings.angularCompiler.mod.AttributeValueInterpolationToken
  - typings.angularCompiler.mod.EncodedEntityToken
*/
trait InterpolatedAttributeToken extends StObject
object InterpolatedAttributeToken {
  
  inline def AttributeValueInterpolationToken(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): typings.angularCompiler.mod.AttributeValueInterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[typings.angularCompiler.mod.AttributeValueInterpolationToken]
  }
  
  inline def AttributeValueTextToken(parts: js.Array[String], sourceSpan: ParseSourceSpan): typings.angularCompiler.mod.AttributeValueTextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[typings.angularCompiler.mod.AttributeValueTextToken]
  }
  
  inline def EncodedEntityToken(parts: js.Tuple2[/* decoded */ String, /* encoded */ String], sourceSpan: ParseSourceSpan): typings.angularCompiler.mod.EncodedEntityToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typings.angularCompiler.mod.EncodedEntityToken]
  }
}
