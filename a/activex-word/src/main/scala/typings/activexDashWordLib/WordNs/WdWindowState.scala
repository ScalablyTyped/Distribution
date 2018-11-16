package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdWindowState extends js.Object

@JSGlobal("Word.WdWindowState")
@js.native
object WdWindowState extends js.Object {
  @js.native
  sealed trait wdWindowStateMaximize
    extends activexDashWordLib.WordNs.WdWindowState
  
  @js.native
  sealed trait wdWindowStateMinimize
    extends activexDashWordLib.WordNs.WdWindowState
  
  @js.native
  sealed trait wdWindowStateNormal
    extends activexDashWordLib.WordNs.WdWindowState
  
  /* 1 */ val wdWindowStateMaximize: wdWindowStateMaximize with scala.Double = js.native
  /* 2 */ val wdWindowStateMinimize: wdWindowStateMinimize with scala.Double = js.native
  /* 0 */ val wdWindowStateNormal: wdWindowStateNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdWindowState with scala.Double] = js.native
}

