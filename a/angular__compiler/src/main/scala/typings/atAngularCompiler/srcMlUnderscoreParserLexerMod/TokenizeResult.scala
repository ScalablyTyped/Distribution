package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenizeResult")
@js.native
class TokenizeResult protected () extends js.Object {
  def this(tokens: js.Array[Token], errors: js.Array[TokenError]) = this()
  var errors: js.Array[TokenError] = js.native
  var tokens: js.Array[Token] = js.native
}

