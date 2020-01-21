package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/ast", "Comment")
@js.native
class Comment protected () extends Node {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, sourceSpan: ParseSourceSpan) = this()
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var value: String | Null = js.native
  /* CompleteClass */
  override def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}

