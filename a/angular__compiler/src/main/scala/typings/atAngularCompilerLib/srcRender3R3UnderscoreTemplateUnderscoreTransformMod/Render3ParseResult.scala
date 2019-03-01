package typings
package atAngularCompilerLib.srcRender3R3UnderscoreTemplateUnderscoreTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render3ParseResult extends js.Object {
  var errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]
  var nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
}

object Render3ParseResult {
  @scala.inline
  def apply(
    errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError],
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
  ): Render3ParseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[Render3ParseResult]
  }
}

