package typings.angularCompiler.mlParserAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var sourceSpan: ParseSourceSpan
  def visit(visitor: Visitor, context: js.Any): js.Any
}

object Node {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: (Visitor, js.Any) => js.Any): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Node]
  }
}

