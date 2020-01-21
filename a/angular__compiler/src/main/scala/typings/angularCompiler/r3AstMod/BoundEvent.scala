package typings.angularCompiler.r3AstMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.ParsedEvent
import typings.angularCompiler.astMod.ParsedEventType
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
@js.native
class BoundEvent protected () extends Node {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: String,
    phase: String,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: String,
    phase: Null,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: Null,
    phase: String,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: Null,
    phase: Null,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan
  ) = this()
  var handler: AST = js.native
  var handlerSpan: ParseSourceSpan = js.native
  var name: String = js.native
  var phase: String | Null = js.native
  /* CompleteClass */
  override var sourceSpan: ParseSourceSpan = js.native
  var target: String | Null = js.native
  var `type`: ParsedEventType = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

/* static members */
@JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
@js.native
object BoundEvent extends js.Object {
  def fromParsedEvent(event: ParsedEvent): BoundEvent = js.native
}

