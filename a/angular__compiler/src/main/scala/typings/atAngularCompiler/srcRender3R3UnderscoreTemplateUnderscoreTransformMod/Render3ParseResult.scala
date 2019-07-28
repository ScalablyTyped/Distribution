package typings.atAngularCompiler.srcRender3R3UnderscoreTemplateUnderscoreTransformMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render3ParseResult extends js.Object {
  var errors: js.Array[ParseError]
  var nodes: js.Array[Node]
  var styleUrls: js.Array[String]
  var styles: js.Array[String]
}

object Render3ParseResult {
  @scala.inline
  def apply(
    errors: js.Array[ParseError],
    nodes: js.Array[Node],
    styleUrls: js.Array[String],
    styles: js.Array[String]
  ): Render3ParseResult = {
    val __obj = js.Dynamic.literal(errors = errors, nodes = nodes, styleUrls = styleUrls, styles = styles)
  
    __obj.asInstanceOf[Render3ParseResult]
  }
}

