package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParserError")
@js.native
class ParserError protected () extends js.Object {
  def this(message: java.lang.String, input: java.lang.String, errLocation: java.lang.String) = this()
  def this(message: java.lang.String, input: java.lang.String, errLocation: java.lang.String, ctxLocation: js.Any) = this()
  var ctxLocation: js.UndefOr[js.Any] = js.native
  var errLocation: java.lang.String = js.native
  var input: java.lang.String = js.native
  var message: java.lang.String = js.native
}

