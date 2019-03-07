package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenType extends js.Object

@JSImport("@angular/compiler/src/ml_parser/lexer", "TokenType")
@js.native
object TokenType extends js.Object {
  @js.native
  sealed trait ATTR_NAME
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait ATTR_VALUE
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait CDATA_END
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait CDATA_START
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait COMMENT_END
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait COMMENT_START
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait DOC_TYPE
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EOF
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait ESCAPABLE_RAW_TEXT
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_END
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_EXP_START
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EXPANSION_CASE_VALUE
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EXPANSION_FORM_END
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait EXPANSION_FORM_START
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait RAW_TEXT
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait TAG_CLOSE
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait TAG_OPEN_END
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait TAG_OPEN_END_VOID
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait TAG_OPEN_START
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  @js.native
  sealed trait TEXT
    extends atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType
  
  /* 11 */ val ATTR_NAME: ATTR_NAME with scala.Double = js.native
  /* 12 */ val ATTR_VALUE: ATTR_VALUE with scala.Double = js.native
  /* 10 */ val CDATA_END: CDATA_END with scala.Double = js.native
  /* 9 */ val CDATA_START: CDATA_START with scala.Double = js.native
  /* 8 */ val COMMENT_END: COMMENT_END with scala.Double = js.native
  /* 7 */ val COMMENT_START: COMMENT_START with scala.Double = js.native
  /* 13 */ val DOC_TYPE: DOC_TYPE with scala.Double = js.native
  /* 19 */ val EOF: EOF with scala.Double = js.native
  /* 5 */ val ESCAPABLE_RAW_TEXT: ESCAPABLE_RAW_TEXT with scala.Double = js.native
  /* 17 */ val EXPANSION_CASE_EXP_END: EXPANSION_CASE_EXP_END with scala.Double = js.native
  /* 16 */ val EXPANSION_CASE_EXP_START: EXPANSION_CASE_EXP_START with scala.Double = js.native
  /* 15 */ val EXPANSION_CASE_VALUE: EXPANSION_CASE_VALUE with scala.Double = js.native
  /* 18 */ val EXPANSION_FORM_END: EXPANSION_FORM_END with scala.Double = js.native
  /* 14 */ val EXPANSION_FORM_START: EXPANSION_FORM_START with scala.Double = js.native
  /* 6 */ val RAW_TEXT: RAW_TEXT with scala.Double = js.native
  /* 3 */ val TAG_CLOSE: TAG_CLOSE with scala.Double = js.native
  /* 1 */ val TAG_OPEN_END: TAG_OPEN_END with scala.Double = js.native
  /* 2 */ val TAG_OPEN_END_VOID: TAG_OPEN_END_VOID with scala.Double = js.native
  /* 0 */ val TAG_OPEN_START: TAG_OPEN_START with scala.Double = js.native
  /* 4 */ val TEXT: TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcMlUnderscoreParserLexerMod.TokenType with scala.Double] = js.native
}

