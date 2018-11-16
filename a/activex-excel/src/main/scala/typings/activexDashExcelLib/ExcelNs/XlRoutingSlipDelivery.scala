package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRoutingSlipDelivery extends js.Object

@JSGlobal("Excel.XlRoutingSlipDelivery")
@js.native
object XlRoutingSlipDelivery extends js.Object {
  @js.native
  sealed trait xlAllAtOnce
    extends activexDashExcelLib.ExcelNs.XlRoutingSlipDelivery
  
  @js.native
  sealed trait xlOneAfterAnother
    extends activexDashExcelLib.ExcelNs.XlRoutingSlipDelivery
  
  /* 2 */ val xlAllAtOnce: xlAllAtOnce with scala.Double = js.native
  /* 1 */ val xlOneAfterAnother: xlOneAfterAnother with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRoutingSlipDelivery with scala.Double] = js.native
}

