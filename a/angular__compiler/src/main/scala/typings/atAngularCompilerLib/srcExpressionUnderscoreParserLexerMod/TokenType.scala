package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/lexer", "TokenType")
@js.native
object TokenType extends js.Object {
  @js.native
  sealed trait Character
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait Error
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait Identifier
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait Keyword
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait Number
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait Operator
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait String
    extends atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType
  
  /* 0 */ val Character: Character with scala.Double = js.native
  /* 6 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Identifier: Identifier with scala.Double = js.native
  /* 2 */ val Keyword: Keyword with scala.Double = js.native
  /* 5 */ val Number: Number with scala.Double = js.native
  /* 4 */ val Operator: Operator with scala.Double = js.native
  /* 3 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.TokenType with scala.Double
  ] = js.native
}

