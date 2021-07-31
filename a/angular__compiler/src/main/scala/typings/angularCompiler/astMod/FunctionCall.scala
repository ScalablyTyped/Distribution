package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "FunctionCall")
@js.native
class FunctionCall protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, target: Null, args: js.Array[js.Any]) = this()
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, target: AST, args: js.Array[js.Any]) = this()
  
  var args: js.Array[js.Any] = js.native
  
  var target: AST | Null = js.native
}
