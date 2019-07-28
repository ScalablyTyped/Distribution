package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
}

