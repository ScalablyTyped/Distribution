package typings
package atAngularCompilerLib.srcMlUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  def visit(visitor: Visitor, context: js.Any): js.Any
}

object Node {
  @scala.inline
  def apply(
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    visit: js.Function2[Visitor, js.Any, js.Any]
  ): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan, visit = visit)
  
    __obj.asInstanceOf[Node]
  }
}

