package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcImeMode extends js.Object

@JSGlobal("Access.AcImeMode")
@js.native
object AcImeMode extends js.Object {
  @js.native
  sealed trait acImeModeAlpha
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeAlphaFull
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeDisable
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeHangul
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeHangulFull
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeHiragana
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeKatakana
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeKatakanaHalf
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeNoControl
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeOff
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  @js.native
  sealed trait acImeModeOn
    extends activexDashAccessLib.AccessNs.AcImeMode
  
  /* 8 */ val acImeModeAlpha: acImeModeAlpha with scala.Double = js.native
  /* 7 */ val acImeModeAlphaFull: acImeModeAlphaFull with scala.Double = js.native
  /* 3 */ val acImeModeDisable: acImeModeDisable with scala.Double = js.native
  /* 10 */ val acImeModeHangul: acImeModeHangul with scala.Double = js.native
  /* 9 */ val acImeModeHangulFull: acImeModeHangulFull with scala.Double = js.native
  /* 4 */ val acImeModeHiragana: acImeModeHiragana with scala.Double = js.native
  /* 5 */ val acImeModeKatakana: acImeModeKatakana with scala.Double = js.native
  /* 6 */ val acImeModeKatakanaHalf: acImeModeKatakanaHalf with scala.Double = js.native
  /* 0 */ val acImeModeNoControl: acImeModeNoControl with scala.Double = js.native
  /* 2 */ val acImeModeOff: acImeModeOff with scala.Double = js.native
  /* 1 */ val acImeModeOn: acImeModeOn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcImeMode with scala.Double] = js.native
}

