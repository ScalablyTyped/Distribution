package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/lexer", "Token")
@js.native
class Token protected () extends js.Object {
  def this(index: scala.Double, `type`: TokenType, numValue: scala.Double, strValue: java.lang.String) = this()
  var index: scala.Double = js.native
  var numValue: scala.Double = js.native
  var strValue: java.lang.String = js.native
  var `type`: TokenType = js.native
  def isCharacter(code: scala.Double): scala.Boolean = js.native
  def isError(): scala.Boolean = js.native
  def isIdentifier(): scala.Boolean = js.native
  def isKeyword(): scala.Boolean = js.native
  def isKeywordAs(): scala.Boolean = js.native
  def isKeywordFalse(): scala.Boolean = js.native
  def isKeywordLet(): scala.Boolean = js.native
  def isKeywordNull(): scala.Boolean = js.native
  def isKeywordThis(): scala.Boolean = js.native
  def isKeywordTrue(): scala.Boolean = js.native
  def isKeywordUndefined(): scala.Boolean = js.native
  def isNumber(): scala.Boolean = js.native
  def isOperator(operator: java.lang.String): scala.Boolean = js.native
  def isString(): scala.Boolean = js.native
  def toNumber(): scala.Double = js.native
}

