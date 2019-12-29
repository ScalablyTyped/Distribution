package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.RoutingSlip")
@js.native
class RoutingSlip protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var Delivery: XlRoutingSlipDelivery = js.native
  @JSName("Excel.RoutingSlip_typekey")
  var ExcelDotRoutingSlip_typekey: RoutingSlip = js.native
  var Message: js.Any = js.native
  val Parent: js.Any = js.native
  var ReturnWhenDone: Boolean = js.native
  val Status: XlRoutingSlipStatus = js.native
  var Subject: js.Any = js.native
  var TrackStatus: Boolean = js.native
  def Recipients(): js.Any = js.native
  def Recipients(Index: js.Any): js.Any = js.native
  def Reset(): js.Any = js.native
}

