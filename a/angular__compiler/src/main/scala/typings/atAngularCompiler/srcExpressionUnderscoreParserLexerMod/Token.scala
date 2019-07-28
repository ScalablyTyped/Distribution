package typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/lexer", "Token")
@js.native
class Token protected () extends js.Object {
  def this(index: Double, `type`: TokenType, numValue: Double, strValue: String) = this()
  var index: Double = js.native
  var numValue: Double = js.native
  var strValue: String = js.native
  var `type`: TokenType = js.native
  def isCharacter(code: Double): Boolean = js.native
  def isError(): Boolean = js.native
  def isIdentifier(): Boolean = js.native
  def isKeyword(): Boolean = js.native
  def isKeywordAs(): Boolean = js.native
  def isKeywordFalse(): Boolean = js.native
  def isKeywordLet(): Boolean = js.native
  def isKeywordNull(): Boolean = js.native
  def isKeywordThis(): Boolean = js.native
  def isKeywordTrue(): Boolean = js.native
  def isKeywordUndefined(): Boolean = js.native
  def isNumber(): Boolean = js.native
  def isOperator(operator: String): Boolean = js.native
  def isString(): Boolean = js.native
  def toNumber(): Double = js.native
}

