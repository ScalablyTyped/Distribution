package typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedEvent")
@js.native
class ParsedEvent protected () extends js.Object {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: ParsedEventType,
    handler: AST,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  var handler: AST = js.native
  var handlerSpan: ParseSourceSpan = js.native
  var name: String = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var targetOrPhase: String = js.native
  var `type`: ParsedEventType = js.native
}

