package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.mod.LiteralPiece
  - typings.angularCompiler.mod.PlaceholderPiece
*/
trait MessagePiece extends StObject
object MessagePiece {
  
  inline def LiteralPiece(sourceSpan: ParseSourceSpan, text: String): typings.angularCompiler.mod.LiteralPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.LiteralPiece]
  }
  
  inline def PlaceholderPiece(sourceSpan: ParseSourceSpan, text: String): typings.angularCompiler.mod.PlaceholderPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompiler.mod.PlaceholderPiece]
  }
}
