package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "Token")
@js.native
class Token protected () extends js.Object {
  def this(`type`: TokenType, parts: js.Array[java.lang.String], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(`type`: scala.Null, parts: js.Array[java.lang.String], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var parts: js.Array[java.lang.String] = js.native
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var `type`: TokenType | scala.Null = js.native
}

