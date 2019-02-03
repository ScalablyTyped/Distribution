package typings
package atAngularCompilerLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends atAngularCompilerLib.srcCompilerMod.BoundEventAst {
  def this(name: java.lang.String, target: java.lang.String, phase: java.lang.String, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: java.lang.String, phase: scala.Null, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: scala.Null, phase: java.lang.String, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: scala.Null, phase: scala.Null, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: java.lang.String, phase: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: scala.Null, phase: java.lang.String): java.lang.String = js.native
  def fromParsedEvent(event: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent): atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst = js.native
}

