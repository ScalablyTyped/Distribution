package typings.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ParsedEvent")
@js.native
class ParsedEvent protected ()
  extends typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent {
  def this(
    name: String,
    targetOrPhase: String,
    `type`: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

