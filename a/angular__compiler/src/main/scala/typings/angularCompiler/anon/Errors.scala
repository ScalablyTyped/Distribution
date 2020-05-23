package typings.angularCompiler.anon

import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.UndefOr[js.Array[ParseError]] = js.undefined
  var ngContentSelectors: js.Array[String]
  var nodes: js.Array[Node]
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
}

object Errors {
  @scala.inline
  def apply(
    ngContentSelectors: js.Array[String],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String],
    errors: js.Array[ParseError] = null
  ): Errors = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

