package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]] = js.undefined
  var nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
  var styleUrls: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
}

object Anon_Errors {
  @scala.inline
  def apply(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    styleUrls: js.Array[java.lang.String],
    styles: js.Array[java.lang.String],
    errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = null
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal(nodes = nodes, styleUrls = styleUrls, styles = styles)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Errors]
  }
}

