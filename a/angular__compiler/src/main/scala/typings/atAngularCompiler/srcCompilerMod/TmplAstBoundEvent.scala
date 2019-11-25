package typings.atAngularCompiler.srcCompilerMod

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEventType
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected () extends BoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent): BoundEvent = js.native
}

