package typings
package atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var template: js.UndefOr[js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]] = js.undefined
}

object Target {
  @scala.inline
  def apply(template: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node] = null): Target = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Target]
  }
}

