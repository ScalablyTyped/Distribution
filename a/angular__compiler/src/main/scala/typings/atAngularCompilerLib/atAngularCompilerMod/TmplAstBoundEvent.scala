package typings
package atAngularCompilerLib.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TmplAstBoundEvent")
@js.native
class TmplAstBoundEvent protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.TmplAstBoundEvent {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: java.lang.String, phase: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: java.lang.String, phase: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: scala.Null, phase: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEventType, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, target: scala.Null, phase: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

@JSImport("@angular/compiler", "TmplAstBoundEvent")
@js.native
object TmplAstBoundEvent extends js.Object {
  def fromParsedEvent(event: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent = js.native
}

