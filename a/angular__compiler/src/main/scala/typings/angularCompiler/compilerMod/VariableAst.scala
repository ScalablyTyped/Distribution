package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "VariableAst")
@js.native
class VariableAst protected ()
  extends typings.angularCompiler.publicApiMod.VariableAst {
  def this(name: String, value: String, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/compiler", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: typings.angularCompiler.astMod.ParsedVariable): typings.angularCompiler.templateAstMod.VariableAst = js.native
}

