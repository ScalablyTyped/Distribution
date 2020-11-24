package typings.angularCompiler

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/lexer", JSImport.Namespace)
@js.native
object lexerMod extends js.Object {
  
  val EOF: Token = js.native
  
  def isIdentifier(input: String): Boolean = js.native
  
  def isQuote(code: Double): Boolean = js.native
  
  @js.native
  class Lexer () extends js.Object {
    
    def tokenize(text: String): js.Array[Token] = js.native
  }
  
  @js.native
  class Token protected () extends js.Object {
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
  sealed trait TokenType extends js.Object
  @js.native
  object TokenType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
    
    @js.native
    sealed trait Character extends TokenType
    /* 0 */ @js.native
    object Character extends TopLevel[Character with Double]
    
    @js.native
    sealed trait Error extends TokenType
    /* 6 */ @js.native
    object Error extends TopLevel[Error with Double]
    
    @js.native
    sealed trait Identifier extends TokenType
    /* 1 */ @js.native
    object Identifier extends TopLevel[Identifier with Double]
    
    @js.native
    sealed trait Keyword extends TokenType
    /* 2 */ @js.native
    object Keyword extends TopLevel[Keyword with Double]
    
    @js.native
    sealed trait Number extends TokenType
    /* 5 */ @js.native
    object Number extends TopLevel[Number with Double]
    
    @js.native
    sealed trait Operator extends TokenType
    /* 4 */ @js.native
    object Operator extends TopLevel[Operator with Double]
    
    @js.native
    sealed trait String extends TokenType
    /* 3 */ @js.native
    object String
      extends TopLevel[typings.angularCompiler.lexerMod.TokenType.String with Double]
  }
}
