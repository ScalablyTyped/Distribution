package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.angularCompiler.srcCompilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typings.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}

