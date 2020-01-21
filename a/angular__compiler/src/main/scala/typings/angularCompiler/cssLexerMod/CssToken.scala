package typings.angularCompiler.cssLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssToken")
@js.native
class CssToken protected () extends js.Object {
  def this(index: Double, column: Double, line: Double, `type`: CssTokenType, strValue: String) = this()
  var column: Double = js.native
  var index: Double = js.native
  var line: Double = js.native
  var numValue: Double = js.native
  var strValue: String = js.native
  var `type`: CssTokenType = js.native
}

