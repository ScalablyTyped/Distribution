package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBaselineAlignment extends js.Object

@JSGlobal("Word.WdBaselineAlignment")
@js.native
object WdBaselineAlignment extends js.Object {
  @js.native
  sealed trait wdBaselineAlignAuto
    extends activexDashWordLib.WordNs.WdBaselineAlignment
  
  @js.native
  sealed trait wdBaselineAlignBaseline
    extends activexDashWordLib.WordNs.WdBaselineAlignment
  
  @js.native
  sealed trait wdBaselineAlignCenter
    extends activexDashWordLib.WordNs.WdBaselineAlignment
  
  @js.native
  sealed trait wdBaselineAlignFarEast50
    extends activexDashWordLib.WordNs.WdBaselineAlignment
  
  @js.native
  sealed trait wdBaselineAlignTop
    extends activexDashWordLib.WordNs.WdBaselineAlignment
  
  /* 4 */ val wdBaselineAlignAuto: wdBaselineAlignAuto with scala.Double = js.native
  /* 2 */ val wdBaselineAlignBaseline: wdBaselineAlignBaseline with scala.Double = js.native
  /* 1 */ val wdBaselineAlignCenter: wdBaselineAlignCenter with scala.Double = js.native
  /* 3 */ val wdBaselineAlignFarEast50: wdBaselineAlignFarEast50 with scala.Double = js.native
  /* 0 */ val wdBaselineAlignTop: wdBaselineAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBaselineAlignment with scala.Double] = js.native
}

