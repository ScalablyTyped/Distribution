package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
@js.native
class BoundEvent protected () extends Node {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: java.lang.String, phase: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: java.lang.String, phase: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: scala.Null, phase: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: scala.Null, phase: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  var name: java.lang.String = js.native
  var phase: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var target: java.lang.String | scala.Null = js.native
  var `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundEvent")
@js.native
object BoundEvent extends js.Object {
  def fromParsedEvent(event: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent = js.native
}

