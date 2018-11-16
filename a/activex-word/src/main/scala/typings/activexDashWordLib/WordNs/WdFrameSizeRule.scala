package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFrameSizeRule extends js.Object

@JSGlobal("Word.WdFrameSizeRule")
@js.native
object WdFrameSizeRule extends js.Object {
  @js.native
  sealed trait wdFrameAtLeast
    extends activexDashWordLib.WordNs.WdFrameSizeRule
  
  @js.native
  sealed trait wdFrameAuto
    extends activexDashWordLib.WordNs.WdFrameSizeRule
  
  @js.native
  sealed trait wdFrameExact
    extends activexDashWordLib.WordNs.WdFrameSizeRule
  
  /* 1 */ val wdFrameAtLeast: wdFrameAtLeast with scala.Double = js.native
  /* 0 */ val wdFrameAuto: wdFrameAuto with scala.Double = js.native
  /* 2 */ val wdFrameExact: wdFrameExact with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFrameSizeRule with scala.Double] = js.native
}

