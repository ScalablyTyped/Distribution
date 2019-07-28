package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "Conditional")
@js.native
class Conditional protected () extends AST {
  def this(span: ParseSpan, condition: AST, trueExp: AST, falseExp: AST) = this()
  var condition: AST = js.native
  var falseExp: AST = js.native
  var trueExp: AST = js.native
}

