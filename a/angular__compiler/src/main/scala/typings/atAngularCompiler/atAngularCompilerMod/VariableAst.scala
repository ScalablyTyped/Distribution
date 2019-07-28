package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.VariableAst {
  def this(
    name: String,
    value: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedVariable): typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

