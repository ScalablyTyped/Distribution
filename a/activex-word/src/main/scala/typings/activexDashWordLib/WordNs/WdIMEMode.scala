package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdIMEMode extends js.Object

@JSGlobal("Word.WdIMEMode")
@js.native
object WdIMEMode extends js.Object {
  @js.native
  sealed trait wdIMEModeAlpha
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeAlphaFull
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeHangul
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeHangulFull
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeHiragana
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeKatakana
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeKatakanaHalf
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeNoControl
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeOff
    extends activexDashWordLib.WordNs.WdIMEMode
  
  @js.native
  sealed trait wdIMEModeOn
    extends activexDashWordLib.WordNs.WdIMEMode
  
  /* 8 */ val wdIMEModeAlpha: wdIMEModeAlpha with scala.Double = js.native
  /* 7 */ val wdIMEModeAlphaFull: wdIMEModeAlphaFull with scala.Double = js.native
  /* 10 */ val wdIMEModeHangul: wdIMEModeHangul with scala.Double = js.native
  /* 9 */ val wdIMEModeHangulFull: wdIMEModeHangulFull with scala.Double = js.native
  /* 4 */ val wdIMEModeHiragana: wdIMEModeHiragana with scala.Double = js.native
  /* 5 */ val wdIMEModeKatakana: wdIMEModeKatakana with scala.Double = js.native
  /* 6 */ val wdIMEModeKatakanaHalf: wdIMEModeKatakanaHalf with scala.Double = js.native
  /* 0 */ val wdIMEModeNoControl: wdIMEModeNoControl with scala.Double = js.native
  /* 2 */ val wdIMEModeOff: wdIMEModeOff with scala.Double = js.native
  /* 1 */ val wdIMEModeOn: wdIMEModeOn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdIMEMode with scala.Double] = js.native
}

