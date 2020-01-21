package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "PrefixNot")
@js.native
class PrefixNot protected () extends AST {
  def this(span: ParseSpan, expression: AST) = this()
  var expression: AST = js.native
}

