package typings.angularCompiler.cssLexerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_lexer", "cssScannerError")
@js.native
object cssScannerError extends js.Object {
  def apply(token: CssToken, message: String): Error = js.native
}

