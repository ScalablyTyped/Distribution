package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTabAlignment extends js.Object

@JSGlobal("Word.WdTabAlignment")
@js.native
object WdTabAlignment extends js.Object {
  @js.native
  sealed trait wdAlignTabBar
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  @js.native
  sealed trait wdAlignTabCenter
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  @js.native
  sealed trait wdAlignTabDecimal
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  @js.native
  sealed trait wdAlignTabLeft
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  @js.native
  sealed trait wdAlignTabList
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  @js.native
  sealed trait wdAlignTabRight
    extends activexDashWordLib.WordNs.WdTabAlignment
  
  /* 4 */ val wdAlignTabBar: wdAlignTabBar with scala.Double = js.native
  /* 1 */ val wdAlignTabCenter: wdAlignTabCenter with scala.Double = js.native
  /* 3 */ val wdAlignTabDecimal: wdAlignTabDecimal with scala.Double = js.native
  /* 0 */ val wdAlignTabLeft: wdAlignTabLeft with scala.Double = js.native
  /* 6 */ val wdAlignTabList: wdAlignTabList with scala.Double = js.native
  /* 2 */ val wdAlignTabRight: wdAlignTabRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTabAlignment with scala.Double] = js.native
}

