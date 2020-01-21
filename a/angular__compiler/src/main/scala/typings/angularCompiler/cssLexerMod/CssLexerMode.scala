package typings.angularCompiler.cssLexerMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssLexerMode with Double] = js.native
  /* 0 */ @js.native
  object ALL extends TopLevel[ALL with Double]
  
  /* 1 */ @js.native
  object ALL_TRACK_WS extends TopLevel[ALL_TRACK_WS with Double]
  
  /* 5 */ @js.native
  object ATTRIBUTE_SELECTOR extends TopLevel[ATTRIBUTE_SELECTOR with Double]
  
  /* 6 */ @js.native
  object AT_RULE_QUERY extends TopLevel[AT_RULE_QUERY with Double]
  
  /* 8 */ @js.native
  object BLOCK extends TopLevel[BLOCK with Double]
  
  /* 9 */ @js.native
  object KEYFRAME_BLOCK extends TopLevel[KEYFRAME_BLOCK with Double]
  
  /* 7 */ @js.native
  object MEDIA_QUERY extends TopLevel[MEDIA_QUERY with Double]
  
  /* 3 */ @js.native
  object PSEUDO_SELECTOR extends TopLevel[PSEUDO_SELECTOR with Double]
  
  /* 4 */ @js.native
  object PSEUDO_SELECTOR_WITH_ARGUMENTS extends TopLevel[PSEUDO_SELECTOR_WITH_ARGUMENTS with Double]
  
  /* 2 */ @js.native
  object SELECTOR extends TopLevel[SELECTOR with Double]
  
  /* 10 */ @js.native
  object STYLE_BLOCK extends TopLevel[STYLE_BLOCK with Double]
  
  /* 13 */ @js.native
  object STYLE_CALC_FUNCTION extends TopLevel[STYLE_CALC_FUNCTION with Double]
  
  /* 11 */ @js.native
  object STYLE_VALUE extends TopLevel[STYLE_VALUE with Double]
  
  /* 12 */ @js.native
  object STYLE_VALUE_FUNCTION extends TopLevel[STYLE_VALUE_FUNCTION with Double]
  
}

