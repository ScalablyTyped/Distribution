package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`5`
import typings.angularCompiler.angularCompilerInts.`6`
import typings.angularCompiler.angularCompilerInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.mod.TextToken
  - typings.angularCompiler.mod.InterpolationToken
  - typings.angularCompiler.mod.EncodedEntityToken
*/
trait InterpolatedTextToken extends StObject
object InterpolatedTextToken {
  
  inline def EncodedEntityToken(parts: js.Tuple2[/* decoded */ String, /* encoded */ String], sourceSpan: ParseSourceSpan): typings.angularCompiler.mod.EncodedEntityToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typings.angularCompiler.mod.EncodedEntityToken]
  }
  
  inline def InterpolationToken(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): typings.angularCompiler.mod.InterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[typings.angularCompiler.mod.InterpolationToken]
  }
  
  inline def TextToken(parts: js.Array[String], sourceSpan: ParseSourceSpan, `type`: `5` | `6` | `7`): typings.angularCompiler.mod.TextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.TextToken]
  }
}
