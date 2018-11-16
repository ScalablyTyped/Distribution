package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRoutingSlipDelivery extends js.Object

@JSGlobal("Word.WdRoutingSlipDelivery")
@js.native
object WdRoutingSlipDelivery extends js.Object {
  @js.native
  sealed trait wdAllAtOnce
    extends activexDashWordLib.WordNs.WdRoutingSlipDelivery
  
  @js.native
  sealed trait wdOneAfterAnother
    extends activexDashWordLib.WordNs.WdRoutingSlipDelivery
  
  /* 1 */ val wdAllAtOnce: wdAllAtOnce with scala.Double = js.native
  /* 0 */ val wdOneAfterAnother: wdOneAfterAnother with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRoutingSlipDelivery with scala.Double] = js.native
}

