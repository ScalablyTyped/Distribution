package typings.angularCompiler

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssLexerMod {
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "CssLexer")
  @js.native
  class CssLexer () extends StObject {
    
    def scan(text: String): CssScanner = js.native
    def scan(text: String, trackComments: Boolean): CssScanner = js.native
  }
  
  @js.native
  sealed trait CssLexerMode extends StObject
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "CssLexerMode")
  @js.native
  object CssLexerMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CssLexerMode with Double] = js.native
    
    @js.native
    sealed trait ALL extends CssLexerMode
    /* 0 */ val ALL: typings.angularCompiler.cssLexerMod.CssLexerMode.ALL with Double = js.native
    
    @js.native
    sealed trait ALL_TRACK_WS extends CssLexerMode
    /* 1 */ val ALL_TRACK_WS: typings.angularCompiler.cssLexerMod.CssLexerMode.ALL_TRACK_WS with Double = js.native
    
    @js.native
    sealed trait ATTRIBUTE_SELECTOR extends CssLexerMode
    /* 5 */ val ATTRIBUTE_SELECTOR: typings.angularCompiler.cssLexerMod.CssLexerMode.ATTRIBUTE_SELECTOR with Double = js.native
    
    @js.native
    sealed trait AT_RULE_QUERY extends CssLexerMode
    /* 6 */ val AT_RULE_QUERY: typings.angularCompiler.cssLexerMod.CssLexerMode.AT_RULE_QUERY with Double = js.native
    
    @js.native
    sealed trait BLOCK extends CssLexerMode
    /* 8 */ val BLOCK: typings.angularCompiler.cssLexerMod.CssLexerMode.BLOCK with Double = js.native
    
    @js.native
    sealed trait KEYFRAME_BLOCK extends CssLexerMode
    /* 9 */ val KEYFRAME_BLOCK: typings.angularCompiler.cssLexerMod.CssLexerMode.KEYFRAME_BLOCK with Double = js.native
    
    @js.native
    sealed trait MEDIA_QUERY extends CssLexerMode
    /* 7 */ val MEDIA_QUERY: typings.angularCompiler.cssLexerMod.CssLexerMode.MEDIA_QUERY with Double = js.native
    
    @js.native
    sealed trait PSEUDO_SELECTOR extends CssLexerMode
    /* 3 */ val PSEUDO_SELECTOR: typings.angularCompiler.cssLexerMod.CssLexerMode.PSEUDO_SELECTOR with Double = js.native
    
    @js.native
    sealed trait PSEUDO_SELECTOR_WITH_ARGUMENTS extends CssLexerMode
    /* 4 */ val PSEUDO_SELECTOR_WITH_ARGUMENTS: typings.angularCompiler.cssLexerMod.CssLexerMode.PSEUDO_SELECTOR_WITH_ARGUMENTS with Double = js.native
    
    @js.native
    sealed trait SELECTOR extends CssLexerMode
    /* 2 */ val SELECTOR: typings.angularCompiler.cssLexerMod.CssLexerMode.SELECTOR with Double = js.native
    
    @js.native
    sealed trait STYLE_BLOCK extends CssLexerMode
    /* 10 */ val STYLE_BLOCK: typings.angularCompiler.cssLexerMod.CssLexerMode.STYLE_BLOCK with Double = js.native
    
    @js.native
    sealed trait STYLE_CALC_FUNCTION extends CssLexerMode
    /* 13 */ val STYLE_CALC_FUNCTION: typings.angularCompiler.cssLexerMod.CssLexerMode.STYLE_CALC_FUNCTION with Double = js.native
    
    @js.native
    sealed trait STYLE_VALUE extends CssLexerMode
    /* 11 */ val STYLE_VALUE: typings.angularCompiler.cssLexerMod.CssLexerMode.STYLE_VALUE with Double = js.native
    
    @js.native
    sealed trait STYLE_VALUE_FUNCTION extends CssLexerMode
    /* 12 */ val STYLE_VALUE_FUNCTION: typings.angularCompiler.cssLexerMod.CssLexerMode.STYLE_VALUE_FUNCTION with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "CssScanner")
  @js.native
  class CssScanner protected () extends StObject {
    def this(input: String) = this()
    def this(input: String, _trackComments: Boolean) = this()
    
    var _trackComments: js.Any = js.native
    
    def advance(): Unit = js.native
    
    def assertCondition(status: Boolean, errorMessage: String): Boolean = js.native
    
    var column: Double = js.native
    
    def consume(`type`: CssTokenType): LexedCssResult = js.native
    def consume(`type`: CssTokenType, value: String): LexedCssResult = js.native
    
    def consumeEmptyStatements(): Unit = js.native
    
    def consumeWhitespace(): Unit = js.native
    
    def error(message: String): CssToken = js.native
    def error(message: String, errorTokenValue: js.UndefOr[scala.Nothing], doNotAdvance: Boolean): CssToken = js.native
    def error(message: String, errorTokenValue: String): CssToken = js.native
    def error(message: String, errorTokenValue: String, doNotAdvance: Boolean): CssToken = js.native
    def error(message: String, errorTokenValue: Null, doNotAdvance: Boolean): CssToken = js.native
    
    def getMode(): CssLexerMode = js.native
    
    var index: Double = js.native
    
    var input: String = js.native
    
    var length: Double = js.native
    
    var line: Double = js.native
    
    var peek: Double = js.native
    
    def peekAt(index: Double): Double = js.native
    
    var peekPeek: Double = js.native
    
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
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "CssToken")
  @js.native
  class CssToken protected () extends StObject {
    def this(index: Double, column: Double, line: Double, `type`: CssTokenType, strValue: String) = this()
    
    var column: Double = js.native
    
    var index: Double = js.native
    
    var line: Double = js.native
    
    var numValue: Double = js.native
    
    var strValue: String = js.native
    
    var `type`: CssTokenType = js.native
  }
  
  @js.native
  sealed trait CssTokenType extends StObject
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "CssTokenType")
  @js.native
  object CssTokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CssTokenType with Double] = js.native
    
    @js.native
    sealed trait AtKeyword extends CssTokenType
    /* 6 */ val AtKeyword: typings.angularCompiler.cssLexerMod.CssTokenType.AtKeyword with Double = js.native
    
    @js.native
    sealed trait Character extends CssTokenType
    /* 7 */ val Character: typings.angularCompiler.cssLexerMod.CssTokenType.Character with Double = js.native
    
    @js.native
    sealed trait Comment extends CssTokenType
    /* 2 */ val Comment: typings.angularCompiler.cssLexerMod.CssTokenType.Comment with Double = js.native
    
    @js.native
    sealed trait EOF extends CssTokenType
    /* 0 */ val EOF: typings.angularCompiler.cssLexerMod.CssTokenType.EOF with Double = js.native
    
    @js.native
    sealed trait Identifier extends CssTokenType
    /* 3 */ val Identifier: typings.angularCompiler.cssLexerMod.CssTokenType.Identifier with Double = js.native
    
    @js.native
    sealed trait IdentifierOrNumber extends CssTokenType
    /* 5 */ val IdentifierOrNumber: typings.angularCompiler.cssLexerMod.CssTokenType.IdentifierOrNumber with Double = js.native
    
    @js.native
    sealed trait Invalid extends CssTokenType
    /* 9 */ val Invalid: typings.angularCompiler.cssLexerMod.CssTokenType.Invalid with Double = js.native
    
    @js.native
    sealed trait Number extends CssTokenType
    /* 4 */ val Number: typings.angularCompiler.cssLexerMod.CssTokenType.Number with Double = js.native
    
    @js.native
    sealed trait String extends CssTokenType
    /* 1 */ val String: typings.angularCompiler.cssLexerMod.CssTokenType.String with Double = js.native
    
    @js.native
    sealed trait Whitespace extends CssTokenType
    /* 8 */ val Whitespace: typings.angularCompiler.cssLexerMod.CssTokenType.Whitespace with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "LexedCssResult")
  @js.native
  class LexedCssResult protected () extends StObject {
    def this(error: Null, token: CssToken) = this()
    def this(error: Error, token: CssToken) = this()
    
    var error: Error | Null = js.native
    
    var token: CssToken = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "cssScannerError")
  @js.native
  def cssScannerError(token: CssToken, message: String): Error = js.native
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "findProblemCode")
  @js.native
  def findProblemCode(input: String, errorValue: String, index: Double, column: Double): String = js.native
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "generateErrorMessage")
  @js.native
  def generateErrorMessage(input: String, message: String, errorValue: String, index: Double, row: Double, column: Double): String = js.native
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "getRawMessage")
  @js.native
  def getRawMessage(error: Error): String = js.native
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "getToken")
  @js.native
  def getToken(error: Error): CssToken = js.native
  
  @JSImport("@angular/compiler/src/css_parser/css_lexer", "isNewline")
  @js.native
  def isNewline(code: Double): Boolean = js.native
}
