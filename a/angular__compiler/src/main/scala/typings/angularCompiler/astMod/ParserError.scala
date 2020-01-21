package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParserError")
@js.native
class ParserError protected () extends js.Object {
  def this(message: String, input: String, errLocation: String) = this()
  def this(message: String, input: String, errLocation: String, ctxLocation: js.Any) = this()
  var ctxLocation: js.UndefOr[js.Any] = js.native
  var errLocation: String = js.native
  var input: String = js.native
  var message: String = js.native
}

