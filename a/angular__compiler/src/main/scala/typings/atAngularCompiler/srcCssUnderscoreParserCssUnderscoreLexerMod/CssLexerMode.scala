package typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CssLexerMode extends js.Object

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssLexerMode")
@js.native
object CssLexerMode extends js.Object {
  @js.native
  sealed trait ALL extends CssLexerMode
  
  @js.native
  sealed trait ALL_TRACK_WS extends CssLexerMode
  
  @js.native
  sealed trait ATTRIBUTE_SELECTOR extends CssLexerMode
  
  @js.native
  sealed trait AT_RULE_QUERY extends CssLexerMode
  
  @js.native
  sealed trait BLOCK extends CssLexerMode
  
  @js.native
  sealed trait KEYFRAME_BLOCK extends CssLexerMode
  
  @js.native
  sealed trait MEDIA_QUERY extends CssLexerMode
  
  @js.native
  sealed trait PSEUDO_SELECTOR extends CssLexerMode
  
  @js.native
  sealed trait PSEUDO_SELECTOR_WITH_ARGUMENTS extends CssLexerMode
  
  @js.native
  sealed trait SELECTOR extends CssLexerMode
  
  @js.native
  sealed trait STYLE_BLOCK extends CssLexerMode
  
  @js.native
  sealed trait STYLE_CALC_FUNCTION extends CssLexerMode
  
  @js.native
  sealed trait STYLE_VALUE extends CssLexerMode
  
  @js.native
  sealed trait STYLE_VALUE_FUNCTION extends CssLexerMode
  
  /* 0 */ val ALL: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.ALL with Double = js.native
  /* 1 */ val ALL_TRACK_WS: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.ALL_TRACK_WS with Double = js.native
  /* 5 */ val ATTRIBUTE_SELECTOR: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.ATTRIBUTE_SELECTOR with Double = js.native
  /* 6 */ val AT_RULE_QUERY: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.AT_RULE_QUERY with Double = js.native
  /* 8 */ val BLOCK: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.BLOCK with Double = js.native
  /* 9 */ val KEYFRAME_BLOCK: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.KEYFRAME_BLOCK with Double = js.native
  /* 7 */ val MEDIA_QUERY: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.MEDIA_QUERY with Double = js.native
  /* 3 */ val PSEUDO_SELECTOR: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.PSEUDO_SELECTOR with Double = js.native
  /* 4 */ val PSEUDO_SELECTOR_WITH_ARGUMENTS: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.PSEUDO_SELECTOR_WITH_ARGUMENTS with Double = js.native
  /* 2 */ val SELECTOR: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.SELECTOR with Double = js.native
  /* 10 */ val STYLE_BLOCK: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.STYLE_BLOCK with Double = js.native
  /* 13 */ val STYLE_CALC_FUNCTION: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.STYLE_CALC_FUNCTION with Double = js.native
  /* 11 */ val STYLE_VALUE: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.STYLE_VALUE with Double = js.native
  /* 12 */ val STYLE_VALUE_FUNCTION: typings.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssLexerMode.STYLE_VALUE_FUNCTION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssLexerMode with Double] = js.native
}

