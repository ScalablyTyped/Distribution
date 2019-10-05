package typings.atAngularCompiler

import typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.Token
import typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/lexer", JSImport.Namespace)
@js.native
object srcExpressionUnderscoreParserLexerMod extends js.Object {
  @js.native
  class Lexer () extends js.Object {
    def tokenize(text: String): js.Array[Token] = js.native
  }
  
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
  
  @js.native
  sealed trait TokenType extends js.Object
  
  val EOF: Token = js.native
  def isIdentifier(input: String): Boolean = js.native
  def isQuote(code: Double): Boolean = js.native
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
  
}

