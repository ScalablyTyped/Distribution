package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.angularCompiler.publicApiMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typings.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}

