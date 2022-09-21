package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
open class TemplateBindingParseResult protected () extends StObject {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[ParserError]
  ) = this()
  
  var errors: js.Array[ParserError] = js.native
  
  var templateBindings: js.Array[TemplateBinding] = js.native
  
  var warnings: js.Array[String] = js.native
}
