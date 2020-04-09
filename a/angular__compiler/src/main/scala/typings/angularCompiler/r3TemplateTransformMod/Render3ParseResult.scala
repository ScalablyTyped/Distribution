package typings.angularCompiler.r3TemplateTransformMod

import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.srcParseUtilMod.ParseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render3ParseResult extends js.Object {
  var errors: js.Array[ParseError]
  var ngContentSelectors: js.Array[String]
  var nodes: js.Array[Node]
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
}

object Render3ParseResult {
  @scala.inline
  def apply(
    errors: js.Array[ParseError],
    ngContentSelectors: js.Array[String],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Render3ParseResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], styleUrls = styleUrls.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Render3ParseResult]
  }
}

