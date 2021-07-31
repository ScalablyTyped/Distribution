package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object VariableAst {
  
  @JSImport("@angular/compiler/compiler", "VariableAst")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromParsedVariable(v: typings.angularCompiler.astMod.ParsedVariable): typings.angularCompiler.templateAstMod.VariableAst = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParsedVariable")(v.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.templateAstMod.VariableAst]
}
