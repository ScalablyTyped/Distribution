package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFlowDirection extends js.Object

@JSGlobal("Word.WdFlowDirection")
@js.native
object WdFlowDirection extends js.Object {
  @js.native
  sealed trait wdFlowLtr
    extends activexDashWordLib.WordNs.WdFlowDirection
  
  @js.native
  sealed trait wdFlowRtl
    extends activexDashWordLib.WordNs.WdFlowDirection
  
  /* 0 */ val wdFlowLtr: wdFlowLtr with scala.Double = js.native
  /* 1 */ val wdFlowRtl: wdFlowRtl with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFlowDirection with scala.Double] = js.native
}

