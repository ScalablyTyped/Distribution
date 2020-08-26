package typings.angularCompiler.r3AstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var sourceSpan: ParseSourceSpan = js.native
  def visit[Result](visitor: Visitor[Result]): Result = js.native
}

object Node {
  @scala.inline
  def apply(sourceSpan: ParseSourceSpan, visit: Visitor[js.Any] => js.Any): Node = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisit(value: Visitor[js.Any] => js.Any): Self = this.set("visit", js.Any.fromFunction1(value))
  }
  
}

