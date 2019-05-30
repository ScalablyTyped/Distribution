package typings
package atAngularCompilerLib.srcRender3R3UnderscoreTemplateUnderscoreTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render3ParseResult extends js.Object {
  var errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]
  var nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
  var styleUrls: js.Array[java.lang.String]
  var styles: js.Array[java.lang.String]
}

object Render3ParseResult {
  @scala.inline
  def apply(
    errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError],
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    styleUrls: js.Array[java.lang.String],
    styles: js.Array[java.lang.String]
  ): Render3ParseResult = {
    val __obj = js.Dynamic.literal(errors = errors, nodes = nodes, styleUrls = styleUrls, styles = styles)
  
    __obj.asInstanceOf[Render3ParseResult]
  }
}

