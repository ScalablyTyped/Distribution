package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "ParserError")
@js.native
class ParserError protected ()
  extends typings.angularCompiler.publicApiMod.ParserError {
  def this(message: String, input: String, errLocation: String) = this()
  def this(message: String, input: String, errLocation: String, ctxLocation: js.Any) = this()
}

