package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFarEastLineBreakLevel extends js.Object

@JSGlobal("Word.WdFarEastLineBreakLevel")
@js.native
object WdFarEastLineBreakLevel extends js.Object {
  @js.native
  sealed trait wdFarEastLineBreakLevelCustom
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLevel
  
  @js.native
  sealed trait wdFarEastLineBreakLevelNormal
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLevel
  
  @js.native
  sealed trait wdFarEastLineBreakLevelStrict
    extends activexDashWordLib.WordNs.WdFarEastLineBreakLevel
  
  /* 2 */ val wdFarEastLineBreakLevelCustom: wdFarEastLineBreakLevelCustom with scala.Double = js.native
  /* 0 */ val wdFarEastLineBreakLevelNormal: wdFarEastLineBreakLevelNormal with scala.Double = js.native
  /* 1 */ val wdFarEastLineBreakLevelStrict: wdFarEastLineBreakLevelStrict with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFarEastLineBreakLevel with scala.Double] = js.native
}

