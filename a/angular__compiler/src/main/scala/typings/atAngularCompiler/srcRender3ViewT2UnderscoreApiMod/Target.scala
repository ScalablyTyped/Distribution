package typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod

import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var template: js.UndefOr[js.Array[Node]] = js.undefined
}

object Target {
  @scala.inline
  def apply(template: js.Array[Node] = null): Target = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Target]
  }
}

