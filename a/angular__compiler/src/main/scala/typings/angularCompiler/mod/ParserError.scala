package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParserError")
@js.native
class ParserError protected ()
  extends typings.angularCompiler.compilerMod.ParserError {
  def this(message: String, input: String, errLocation: String) = this()
  def this(message: String, input: String, errLocation: String, ctxLocation: js.Any) = this()
}
