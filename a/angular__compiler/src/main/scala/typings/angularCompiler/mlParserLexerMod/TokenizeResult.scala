package typings.angularCompiler.mlParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenizeResult")
@js.native
class TokenizeResult protected () extends js.Object {
  def this(
    tokens: js.Array[Token],
    errors: js.Array[TokenError],
    nonNormalizedIcuExpressions: js.Array[Token]
  ) = this()
  var errors: js.Array[TokenError] = js.native
  var nonNormalizedIcuExpressions: js.Array[Token] = js.native
  var tokens: js.Array[Token] = js.native
}

