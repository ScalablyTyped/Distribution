package typings.angularCompiler.htmlWhitespacesMod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiblingVisitorContext extends js.Object {
  var next: js.UndefOr[Node] = js.undefined
  var prev: js.UndefOr[Node] = js.undefined
}

object SiblingVisitorContext {
  @scala.inline
  def apply(next: Node = null, prev: Node = null): SiblingVisitorContext = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiblingVisitorContext]
  }
}

