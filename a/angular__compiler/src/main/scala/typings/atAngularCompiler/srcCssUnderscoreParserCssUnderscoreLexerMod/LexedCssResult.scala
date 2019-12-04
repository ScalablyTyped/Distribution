package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_lexer", "LexedCssResult")
@js.native
class LexedCssResult protected () extends js.Object {
  def this(error: Null, token: CssToken) = this()
  def this(error: Error, token: CssToken) = this()
  var error: Error | Null = js.native
  var token: CssToken = js.native
}

