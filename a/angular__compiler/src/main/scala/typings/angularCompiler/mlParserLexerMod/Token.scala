package typings.angularCompiler.mlParserLexerMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "Token")
@js.native
class Token protected () extends js.Object {
  def this(`type`: Null, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
  def this(`type`: TokenType, parts: js.Array[String], sourceSpan: ParseSourceSpan) = this()
  var parts: js.Array[String] = js.native
  var sourceSpan: ParseSourceSpan = js.native
  var `type`: TokenType | Null = js.native
}

