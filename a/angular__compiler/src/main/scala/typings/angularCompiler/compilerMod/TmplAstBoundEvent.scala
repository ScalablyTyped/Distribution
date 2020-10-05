package typings.angularCompiler.compilerMod

import typings.angularCompiler.astMod.ParsedEventType
import typings.angularCompiler.r3AstMod.BoundEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends typings.angularCompiler.publicApiMod.TmplAstBoundEvent {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: String,
    phase: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: String,
    phase: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: Null,
    phase: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: typings.angularCompiler.astMod.AST,
    target: Null,
    phase: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    handlerSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/compiler", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: typings.angularCompiler.astMod.ParsedEvent): BoundEvent = js.native
}

