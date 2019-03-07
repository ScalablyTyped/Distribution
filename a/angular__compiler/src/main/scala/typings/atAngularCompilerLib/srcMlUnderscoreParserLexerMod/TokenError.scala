package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenError")
@js.native
class TokenError protected ()
  extends atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError {
  def this(errorMsg: java.lang.String, tokenType: TokenType, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(errorMsg: java.lang.String, tokenType: scala.Null, span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var tokenType: TokenType | scala.Null = js.native
}

