package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenType")
@js.native
object TokenType extends js.Object {
  @js.native
  sealed trait ATTR_NAME extends TokenType
  
  @js.native
  sealed trait ATTR_QUOTE extends TokenType
  
  @js.native
  sealed trait ATTR_VALUE extends TokenType
  
  @js.native
  sealed trait CDATA_END extends TokenType
  
  @js.native
  sealed trait CDATA_START extends TokenType
  
  @js.native
  sealed trait COMMENT_END extends TokenType
  
  @js.native
  sealed trait COMMENT_START extends TokenType
  
  @js.native
  sealed trait DOC_TYPE extends TokenType
  
  @js.native
  sealed trait EOF extends TokenType
  
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT extends TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_END extends TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_START extends TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_VALUE extends TokenType
  
  @js.native
  sealed trait EXPANSION_FORM_END extends TokenType
  
  @js.native
  sealed trait EXPANSION_FORM_START extends TokenType
  
  @js.native
  sealed trait RAW_TEXT extends TokenType
  
  @js.native
  sealed trait TAG_CLOSE extends TokenType
  
  @js.native
  sealed trait TAG_OPEN_END extends TokenType
  
  @js.native
  sealed trait TAG_OPEN_END_VOID extends TokenType
  
  @js.native
  sealed trait TAG_OPEN_START extends TokenType
  
  @js.native
  sealed trait TEXT extends TokenType
  
  /* 11 */ val ATTR_NAME: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_NAME with Double = js.native
  /* 12 */ val ATTR_QUOTE: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_QUOTE with Double = js.native
  /* 13 */ val ATTR_VALUE: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_VALUE with Double = js.native
  /* 10 */ val CDATA_END: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.CDATA_END with Double = js.native
  /* 9 */ val CDATA_START: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.CDATA_START with Double = js.native
  /* 8 */ val COMMENT_END: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.COMMENT_END with Double = js.native
  /* 7 */ val COMMENT_START: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.COMMENT_START with Double = js.native
  /* 14 */ val DOC_TYPE: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.DOC_TYPE with Double = js.native
  /* 20 */ val EOF: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EOF with Double = js.native
  /* 5 */ val ESCAPABLE_RAW_TEXT: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ESCAPABLE_RAW_TEXT with Double = js.native
  /* 18 */ val EXPANSION_CASE_EXP_END: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_EXP_END with Double = js.native
  /* 17 */ val EXPANSION_CASE_EXP_START: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_EXP_START with Double = js.native
  /* 16 */ val EXPANSION_CASE_VALUE: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_VALUE with Double = js.native
  /* 19 */ val EXPANSION_FORM_END: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_FORM_END with Double = js.native
  /* 15 */ val EXPANSION_FORM_START: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_FORM_START with Double = js.native
  /* 6 */ val RAW_TEXT: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.RAW_TEXT with Double = js.native
  /* 3 */ val TAG_CLOSE: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_CLOSE with Double = js.native
  /* 1 */ val TAG_OPEN_END: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_END with Double = js.native
  /* 2 */ val TAG_OPEN_END_VOID: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_END_VOID with Double = js.native
  /* 0 */ val TAG_OPEN_START: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_START with Double = js.native
  /* 4 */ val TEXT: typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
}

