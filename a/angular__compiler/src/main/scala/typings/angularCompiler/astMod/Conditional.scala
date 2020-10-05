package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "Conditional")
@js.native
class Conditional protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, condition: AST, trueExp: AST, falseExp: AST) = this()
  var condition: AST = js.native
  var falseExp: AST = js.native
  var trueExp: AST = js.native
}

