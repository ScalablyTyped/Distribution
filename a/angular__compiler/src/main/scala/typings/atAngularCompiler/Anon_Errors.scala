package typings.atAngularCompiler

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.UndefOr[js.Array[ParseError]] = js.undefined
  var nodes: js.Array[Node]
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
}

object Anon_Errors {
  @scala.inline
  def apply(
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String],
    errors: js.Array[ParseError] = null
  ): Anon_Errors = {
    val __obj = js.Dynamic.literal(nodes = nodes, styleUrls = styleUrls, styles = styles)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Errors]
  }
}

