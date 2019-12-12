package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import org.scalablytyped.runtime.TopLevel
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_NAME
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_QUOTE
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ATTR_VALUE
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.CDATA_END
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.CDATA_START
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.COMMENT_END
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.COMMENT_START
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.DOC_TYPE
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EOF
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.ESCAPABLE_RAW_TEXT
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_EXP_END
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_EXP_START
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_CASE_VALUE
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_FORM_END
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.EXPANSION_FORM_START
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.RAW_TEXT
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_CLOSE
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_END
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_END_VOID
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TAG_OPEN_START
import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenType.TEXT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  /* 11 */ @js.native
  object ATTR_NAME extends TopLevel[ATTR_NAME with Double]
  
  /* 12 */ @js.native
  object ATTR_QUOTE extends TopLevel[ATTR_QUOTE with Double]
  
  /* 13 */ @js.native
  object ATTR_VALUE extends TopLevel[ATTR_VALUE with Double]
  
  /* 10 */ @js.native
  object CDATA_END extends TopLevel[CDATA_END with Double]
  
  /* 9 */ @js.native
  object CDATA_START extends TopLevel[CDATA_START with Double]
  
  /* 8 */ @js.native
  object COMMENT_END extends TopLevel[COMMENT_END with Double]
  
  /* 7 */ @js.native
  object COMMENT_START extends TopLevel[COMMENT_START with Double]
  
  /* 14 */ @js.native
  object DOC_TYPE extends TopLevel[DOC_TYPE with Double]
  
  /* 20 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  /* 5 */ @js.native
  object ESCAPABLE_RAW_TEXT extends TopLevel[ESCAPABLE_RAW_TEXT with Double]
  
  /* 18 */ @js.native
  object EXPANSION_CASE_EXP_END extends TopLevel[EXPANSION_CASE_EXP_END with Double]
  
  /* 17 */ @js.native
  object EXPANSION_CASE_EXP_START extends TopLevel[EXPANSION_CASE_EXP_START with Double]
  
  /* 16 */ @js.native
  object EXPANSION_CASE_VALUE extends TopLevel[EXPANSION_CASE_VALUE with Double]
  
  /* 19 */ @js.native
  object EXPANSION_FORM_END extends TopLevel[EXPANSION_FORM_END with Double]
  
  /* 15 */ @js.native
  object EXPANSION_FORM_START extends TopLevel[EXPANSION_FORM_START with Double]
  
  /* 6 */ @js.native
  object RAW_TEXT extends TopLevel[RAW_TEXT with Double]
  
  /* 3 */ @js.native
  object TAG_CLOSE extends TopLevel[TAG_CLOSE with Double]
  
  /* 1 */ @js.native
  object TAG_OPEN_END extends TopLevel[TAG_OPEN_END with Double]
  
  /* 2 */ @js.native
  object TAG_OPEN_END_VOID extends TopLevel[TAG_OPEN_END_VOID with Double]
  
  /* 0 */ @js.native
  object TAG_OPEN_START extends TopLevel[TAG_OPEN_START with Double]
  
  /* 4 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
}

