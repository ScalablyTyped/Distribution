package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]] = js.undefined
  var nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
}

object Anon_Errors {
  @scala.inline
  def apply(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = null
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodes")(nodes)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Errors]
  }
}

