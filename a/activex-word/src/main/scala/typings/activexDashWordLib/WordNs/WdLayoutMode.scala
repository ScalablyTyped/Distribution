package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLayoutMode extends js.Object

@JSGlobal("Word.WdLayoutMode")
@js.native
object WdLayoutMode extends js.Object {
  @js.native
  sealed trait wdLayoutModeDefault
    extends activexDashWordLib.WordNs.WdLayoutMode
  
  @js.native
  sealed trait wdLayoutModeGenko
    extends activexDashWordLib.WordNs.WdLayoutMode
  
  @js.native
  sealed trait wdLayoutModeGrid
    extends activexDashWordLib.WordNs.WdLayoutMode
  
  @js.native
  sealed trait wdLayoutModeLineGrid
    extends activexDashWordLib.WordNs.WdLayoutMode
  
  /* 0 */ val wdLayoutModeDefault: wdLayoutModeDefault with scala.Double = js.native
  /* 3 */ val wdLayoutModeGenko: wdLayoutModeGenko with scala.Double = js.native
  /* 1 */ val wdLayoutModeGrid: wdLayoutModeGrid with scala.Double = js.native
  /* 2 */ val wdLayoutModeLineGrid: wdLayoutModeLineGrid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLayoutMode with scala.Double] = js.native
}

