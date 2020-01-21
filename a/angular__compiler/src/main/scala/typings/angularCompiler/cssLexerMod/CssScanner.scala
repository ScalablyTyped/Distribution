package typings.angularCompiler.cssLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssScanner")
@js.native
class CssScanner protected () extends js.Object {
  def this(input: String) = this()
  def this(input: String, _trackComments: Boolean) = this()
  var _trackComments: js.Any = js.native
  var column: Double = js.native
  var index: Double = js.native
  var input: String = js.native
  var length: Double = js.native
  var line: Double = js.native
  var peek: Double = js.native
  var peekPeek: Double = js.native
  def advance(): Unit = js.native
  def assertCondition(status: Boolean, errorMessage: String): Boolean = js.native
  def consume(`type`: CssTokenType): LexedCssResult = js.native
  def consume(`type`: CssTokenType, value: String): LexedCssResult = js.native
  def consumeEmptyStatements(): Unit = js.native
  def consumeWhitespace(): Unit = js.native
  def error(message: String): CssToken = js.native
  def error(message: String, errorTokenValue: String): CssToken = js.native
  def error(message: String, errorTokenValue: String, doNotAdvance: Boolean): CssToken = js.native
  def error(message: String, errorTokenValue: Null, doNotAdvance: Boolean): CssToken = js.native
  def getMode(): CssLexerMode = js.native
  def peekAt(index: Double): Double = js.native
  def scan(): LexedCssResult | Null = js.native
  def scanAtExpression(): CssToken | Null = js.native
  def scanCharacter(): CssToken | Null = js.native
  def scanComment(): CssToken | Null = js.native
  def scanCssValueFunction(): CssToken = js.native
  def scanIdentifier(): CssToken | Null = js.native
  def scanNumber(): CssToken = js.native
  def scanString(): CssToken | Null = js.native
  def scanWhitespace(): CssToken = js.native
  def setMode(mode: CssLexerMode): Unit = js.native
}

