package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "LiteralMap")
@js.native
class LiteralMap protected () extends AST {
  def this(span: ParseSpan, keys: js.Array[LiteralMapKey], values: js.Array[_]) = this()
  var keys: js.Array[LiteralMapKey] = js.native
  var values: js.Array[_] = js.native
}

