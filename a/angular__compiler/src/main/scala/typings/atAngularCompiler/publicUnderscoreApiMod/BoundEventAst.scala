package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
class BoundEventAst protected ()
  extends typings.atAngularCompiler.srcCompilerMod.BoundEventAst {
  def this(
    name: String,
    target: String,
    phase: String,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: String,
    phase: Null,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: String,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    target: Null,
    phase: Null,
    handler: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    handlerSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: String): String = js.native
  def calcFullName(name: String, target: String): String = js.native
  def calcFullName(name: String, target: String, phase: String): String = js.native
  def calcFullName(name: String, target: Null, phase: String): String = js.native
  def fromParsedEvent(event: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedEvent): typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst = js.native
}

