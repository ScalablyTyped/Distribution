package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "ExpansionCase")
@js.native
class ExpansionCase protected () extends Node {
  def this(
    value: String,
    expression: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    valueSourceSpan: ParseSourceSpan,
    expSourceSpan: ParseSourceSpan
  ) = this()
  var expSourceSpan: ParseSourceSpan = js.native
  var expression: js.Array[Node] = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String = js.native
  var valueSourceSpan: ParseSourceSpan = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

