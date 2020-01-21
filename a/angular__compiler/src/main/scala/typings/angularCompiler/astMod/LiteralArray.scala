package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "LiteralArray")
@js.native
class LiteralArray protected () extends AST {
  def this(span: ParseSpan, expressions: js.Array[_]) = this()
  var expressions: js.Array[_] = js.native
}

