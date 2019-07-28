package typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("@angular/compiler/src/expression_parser/lexer", "TokenType")
@js.native
object TokenType extends js.Object {
  @js.native
  sealed trait Character extends TokenType
  
  @js.native
  sealed trait Error extends TokenType
  
  @js.native
  sealed trait Identifier extends TokenType
  
  @js.native
  sealed trait Keyword extends TokenType
  
  @js.native
  sealed trait Number extends TokenType
  
  @js.native
  sealed trait Operator extends TokenType
  
  @js.native
  sealed trait String extends TokenType
  
  /* 0 */ val Character: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Character with Double = js.native
  /* 6 */ val Error: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Error with Double = js.native
  /* 1 */ val Identifier: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Identifier with Double = js.native
  /* 2 */ val Keyword: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Keyword with Double = js.native
  /* 5 */ val Number: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Number with Double = js.native
  /* 4 */ val Operator: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.Operator with Double = js.native
  /* 3 */ val String: typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
}

