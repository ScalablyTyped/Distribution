package typings.angularCompiler.astMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedProperty")
@js.native
class ParsedProperty protected () extends js.Object {
  def this(name: String, expression: ASTWithSource, `type`: ParsedPropertyType, sourceSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    expression: ASTWithSource,
    `type`: ParsedPropertyType,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  var expression: ASTWithSource = js.native
  val isAnimation: Boolean = js.native
  val isLiteral: Boolean = js.native
  var name: String = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var `type`: ParsedPropertyType = js.native
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}

