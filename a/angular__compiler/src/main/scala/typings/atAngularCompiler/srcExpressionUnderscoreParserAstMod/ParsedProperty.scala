package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedProperty")
@js.native
class ParsedProperty protected () extends js.Object {
  def this(name: String, expression: ASTWithSource, `type`: ParsedPropertyType, sourceSpan: ParseSourceSpan) = this()
  var expression: ASTWithSource = js.native
  val isAnimation: Boolean = js.native
  val isLiteral: Boolean = js.native
  var name: String = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var `type`: ParsedPropertyType = js.native
}

