package typings
package atAngularCompilerLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
class VariableAst protected ()
  extends atAngularCompilerLib.srcCompilerMod.VariableAst {
  def this(name: java.lang.String, value: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

@JSImport("@angular/compiler/public_api", "VariableAst")
@js.native
object VariableAst extends js.Object {
  def fromParsedVariable(v: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedVariable): atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.VariableAst = js.native
}

