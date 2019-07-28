package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.atAngularCompiler.srcCompilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
}

