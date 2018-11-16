package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCharacterCase extends js.Object

@JSGlobal("Word.WdCharacterCase")
@js.native
object WdCharacterCase extends js.Object {
  @js.native
  sealed trait wdFullWidth
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdHalfWidth
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdHiragana
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdKatakana
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdLowerCase
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdNextCase
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdTitleSentence
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdTitleWord
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdToggleCase
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  @js.native
  sealed trait wdUpperCase
    extends activexDashWordLib.WordNs.WdCharacterCase
  
  /* 7 */ val wdFullWidth: wdFullWidth with scala.Double = js.native
  /* 6 */ val wdHalfWidth: wdHalfWidth with scala.Double = js.native
  /* 9 */ val wdHiragana: wdHiragana with scala.Double = js.native
  /* 8 */ val wdKatakana: wdKatakana with scala.Double = js.native
  /* 0 */ val wdLowerCase: wdLowerCase with scala.Double = js.native
  /* -1 */ val wdNextCase: wdNextCase with scala.Double = js.native
  /* 4 */ val wdTitleSentence: wdTitleSentence with scala.Double = js.native
  /* 2 */ val wdTitleWord: wdTitleWord with scala.Double = js.native
  /* 5 */ val wdToggleCase: wdToggleCase with scala.Double = js.native
  /* 1 */ val wdUpperCase: wdUpperCase with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCharacterCase with scala.Double] = js.native
}

