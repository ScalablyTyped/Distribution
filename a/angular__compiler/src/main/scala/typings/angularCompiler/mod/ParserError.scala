package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParserError")
@js.native
open class ParserError protected () extends StObject {
  def this(message: String, input: String, errLocation: String) = this()
  def this(message: String, input: String, errLocation: String, ctxLocation: Any) = this()
  
  var ctxLocation: js.UndefOr[Any] = js.native
  
  var errLocation: String = js.native
  
  var input: String = js.native
  
  var message: String = js.native
}
