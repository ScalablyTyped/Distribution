package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "MessagePiece")
@js.native
abstract class MessagePiece protected () extends StObject {
  def this(text: String, sourceSpan: ParseSourceSpan) = this()
  
  var sourceSpan: ParseSourceSpan = js.native
  
  var text: String = js.native
}
