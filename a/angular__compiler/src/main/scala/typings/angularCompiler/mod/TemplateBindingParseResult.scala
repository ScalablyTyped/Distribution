package typings.angularCompiler.mod

import typings.angularCompiler.astMod.TemplateBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typings.angularCompiler.compilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typings.angularCompiler.astMod.ParserError]
  ) = this()
}
