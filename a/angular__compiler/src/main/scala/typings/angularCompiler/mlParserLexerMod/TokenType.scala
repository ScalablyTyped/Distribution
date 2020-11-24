package typings.angularCompiler.mlParserLexerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends js.Object
@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenType")
@js.native
object TokenType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  @js.native
  sealed trait ATTR_NAME extends TokenType
  /* 12 */ @js.native
  object ATTR_NAME extends TopLevel[ATTR_NAME with Double]
  
  @js.native
  sealed trait ATTR_QUOTE extends TokenType
  /* 13 */ @js.native
  object ATTR_QUOTE extends TopLevel[ATTR_QUOTE with Double]
  
  @js.native
  sealed trait ATTR_VALUE extends TokenType
  /* 14 */ @js.native
  object ATTR_VALUE extends TopLevel[ATTR_VALUE with Double]
  
  @js.native
  sealed trait CDATA_END extends TokenType
  /* 11 */ @js.native
  object CDATA_END extends TopLevel[CDATA_END with Double]
  
  @js.native
  sealed trait CDATA_START extends TokenType
  /* 10 */ @js.native
  object CDATA_START extends TopLevel[CDATA_START with Double]
  
  @js.native
  sealed trait COMMENT_END extends TokenType
  /* 9 */ @js.native
  object COMMENT_END extends TopLevel[COMMENT_END with Double]
  
  @js.native
  sealed trait COMMENT_START extends TokenType
  /* 8 */ @js.native
  object COMMENT_START extends TopLevel[COMMENT_START with Double]
  
  @js.native
  sealed trait DOC_TYPE extends TokenType
  /* 15 */ @js.native
  object DOC_TYPE extends TopLevel[DOC_TYPE with Double]
  
  @js.native
  sealed trait EOF extends TokenType
  /* 21 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT extends TokenType
  /* 6 */ @js.native
  object ESCAPABLE_RAW_TEXT extends TopLevel[ESCAPABLE_RAW_TEXT with Double]
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_END extends TokenType
  /* 19 */ @js.native
  object EXPANSION_CASE_EXP_END extends TopLevel[EXPANSION_CASE_EXP_END with Double]
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_START extends TokenType
  /* 18 */ @js.native
  object EXPANSION_CASE_EXP_START extends TopLevel[EXPANSION_CASE_EXP_START with Double]
  
  @js.native
  sealed trait EXPANSION_CASE_VALUE extends TokenType
  /* 17 */ @js.native
  object EXPANSION_CASE_VALUE extends TopLevel[EXPANSION_CASE_VALUE with Double]
  
  @js.native
  sealed trait EXPANSION_FORM_END extends TokenType
  /* 20 */ @js.native
  object EXPANSION_FORM_END extends TopLevel[EXPANSION_FORM_END with Double]
  
  @js.native
  sealed trait EXPANSION_FORM_START extends TokenType
  /* 16 */ @js.native
  object EXPANSION_FORM_START extends TopLevel[EXPANSION_FORM_START with Double]
  
  @js.native
  sealed trait INCOMPLETE_TAG_OPEN extends TokenType
  /* 4 */ @js.native
  object INCOMPLETE_TAG_OPEN extends TopLevel[INCOMPLETE_TAG_OPEN with Double]
  
  @js.native
  sealed trait RAW_TEXT extends TokenType
  /* 7 */ @js.native
  object RAW_TEXT extends TopLevel[RAW_TEXT with Double]
  
  @js.native
  sealed trait TAG_CLOSE extends TokenType
  /* 3 */ @js.native
  object TAG_CLOSE extends TopLevel[TAG_CLOSE with Double]
  
  @js.native
  sealed trait TAG_OPEN_END extends TokenType
  /* 1 */ @js.native
  object TAG_OPEN_END extends TopLevel[TAG_OPEN_END with Double]
  
  @js.native
  sealed trait TAG_OPEN_END_VOID extends TokenType
  /* 2 */ @js.native
  object TAG_OPEN_END_VOID extends TopLevel[TAG_OPEN_END_VOID with Double]
  
  @js.native
  sealed trait TAG_OPEN_START extends TokenType
  /* 0 */ @js.native
  object TAG_OPEN_START extends TopLevel[TAG_OPEN_START with Double]
  
  @js.native
  sealed trait TEXT extends TokenType
  /* 5 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
}
