package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexerMod {
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", "EOF")
  @js.native
  val EOF: Token = js.native
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", "Lexer")
  @js.native
  class Lexer () extends StObject {
    
    def tokenize(text: String): js.Array[Token] = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", "Token")
  @js.native
  class Token protected () extends StObject {
    def this(index: Double, end: Double, `type`: TokenType, numValue: Double, strValue: String) = this()
    
    var end: Double = js.native
    
    var index: Double = js.native
    
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
    
    var numValue: Double = js.native
    
    var strValue: String = js.native
    
    def toNumber(): Double = js.native
    
    var `type`: TokenType = js.native
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("@angular/compiler/src/expression_parser/lexer", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
    
    @js.native
    sealed trait Character extends TokenType
    /* 0 */ val Character: typings.angularCompiler.lexerMod.TokenType.Character with Double = js.native
    
    @js.native
    sealed trait Error extends TokenType
    /* 6 */ val Error: typings.angularCompiler.lexerMod.TokenType.Error with Double = js.native
    
    @js.native
    sealed trait Identifier extends TokenType
    /* 1 */ val Identifier: typings.angularCompiler.lexerMod.TokenType.Identifier with Double = js.native
    
    @js.native
    sealed trait Keyword extends TokenType
    /* 2 */ val Keyword: typings.angularCompiler.lexerMod.TokenType.Keyword with Double = js.native
    
    @js.native
    sealed trait Number extends TokenType
    /* 5 */ val Number: typings.angularCompiler.lexerMod.TokenType.Number with Double = js.native
    
    @js.native
    sealed trait Operator extends TokenType
    /* 4 */ val Operator: typings.angularCompiler.lexerMod.TokenType.Operator with Double = js.native
    
    @js.native
    sealed trait String extends TokenType
    /* 3 */ val String: typings.angularCompiler.lexerMod.TokenType.String with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", "isIdentifier")
  @js.native
  def isIdentifier(input: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", "isQuote")
  @js.native
  def isQuote(code: Double): Boolean = js.native
}
