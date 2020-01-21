package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.angularCompiler.parserMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typings.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}

