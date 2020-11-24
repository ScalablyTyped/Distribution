package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "LiteralArray")
@js.native
class LiteralArray protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expressions: js.Array[_]) = this()
  
  var expressions: js.Array[_] = js.native
}
