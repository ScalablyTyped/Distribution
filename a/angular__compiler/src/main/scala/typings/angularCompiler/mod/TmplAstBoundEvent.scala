package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstBoundEvent")
@js.native
open class TmplAstBoundEvent protected ()
  extends StObject
     with TmplAstNode {
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: String,
    phase: String,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: String,
    phase: Null,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: Null,
    phase: String,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: ParsedEventType,
    handler: AST,
    target: Null,
    phase: Null,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan
  ) = this()
  
  var handler: AST = js.native
  
  var handlerSpan: ParseSourceSpan = js.native
  
  val keySpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  var phase: String | Null = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var target: String | Null = js.native
  
  var `type`: ParsedEventType = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
/* static members */
object TmplAstBoundEvent {
  
  @JSImport("@angular/compiler", "TmplAstBoundEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromParsedEvent(event: ParsedEvent): TmplAstBoundEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParsedEvent")(event.asInstanceOf[js.Any]).asInstanceOf[TmplAstBoundEvent]
}
