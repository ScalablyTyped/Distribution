package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTD extends js.Object {
  @JSName("Excel.RTD_typekey")
  var ExcelDotRTD_typekey: RTD
  var ThrottleInterval: Double
  def RefreshData(): Unit
  def RestartServers(): Unit
}

object RTD {
  @scala.inline
  def apply(
    ExcelDotRTD_typekey: RTD,
    RefreshData: () => Unit,
    RestartServers: () => Unit,
    ThrottleInterval: Double
  ): RTD = {
    val __obj = js.Dynamic.literal(RefreshData = js.Any.fromFunction0(RefreshData), RestartServers = js.Any.fromFunction0(RestartServers), ThrottleInterval = ThrottleInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.RTD_typekey")(ExcelDotRTD_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTD]
  }
}

