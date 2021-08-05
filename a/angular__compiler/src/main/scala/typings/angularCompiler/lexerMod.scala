package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexerMod {
  
  @JSImport("@angular/compiler/src/expression_parser/lexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def apply(value: Double): js.UndefOr[TokenType & Double] = js.native
    
    @js.native
    sealed trait Character
      extends StObject
         with TokenType
    /* 0 */ val Character: typings.angularCompiler.lexerMod.TokenType.Character & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with TokenType
    /* 6 */ val Error: typings.angularCompiler.lexerMod.TokenType.Error & Double = js.native
    
    @js.native
    sealed trait Identifier
      extends StObject
         with TokenType
    /* 1 */ val Identifier: typings.angularCompiler.lexerMod.TokenType.Identifier & Double = js.native
    
    @js.native
    sealed trait Keyword
      extends StObject
         with TokenType
    /* 2 */ val Keyword: typings.angularCompiler.lexerMod.TokenType.Keyword & Double = js.native
    
    @js.native
    sealed trait Number
      extends StObject
         with TokenType
    /* 5 */ val Number: typings.angularCompiler.lexerMod.TokenType.Number & Double = js.native
    
    @js.native
    sealed trait Operator
      extends StObject
         with TokenType
    /* 4 */ val Operator: typings.angularCompiler.lexerMod.TokenType.Operator & Double = js.native
    
    @js.native
    sealed trait String
      extends StObject
         with TokenType
    /* 3 */ val String: typings.angularCompiler.lexerMod.TokenType.String & Double = js.native
  }
  
  inline def isIdentifier(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isQuote(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuote")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
