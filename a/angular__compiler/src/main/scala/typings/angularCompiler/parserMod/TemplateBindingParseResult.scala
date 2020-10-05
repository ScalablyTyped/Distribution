package typings.angularCompiler.parserMod

import typings.angularCompiler.astMod.ParserError
import typings.angularCompiler.astMod.TemplateBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/parser", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected () extends js.Object {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[ParserError]
  ) = this()
  var errors: js.Array[ParserError] = js.native
  var templateBindings: js.Array[TemplateBinding] = js.native
  var warnings: js.Array[String] = js.native
}

