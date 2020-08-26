package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTD extends js.Object {
  @JSName("Excel.RTD_typekey")
  var ExcelDotRTD_typekey: RTD = js.native
  var ThrottleInterval: Double = js.native
  def RefreshData(): Unit = js.native
  def RestartServers(): Unit = js.native
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
  @scala.inline
  implicit class RTDOps[Self <: RTD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcelDotRTD_typekey(value: RTD): Self = this.set("Excel.RTD_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshData(value: () => Unit): Self = this.set("RefreshData", js.Any.fromFunction0(value))
    @scala.inline
    def setRestartServers(value: () => Unit): Self = this.set("RestartServers", js.Any.fromFunction0(value))
    @scala.inline
    def setThrottleInterval(value: Double): Self = this.set("ThrottleInterval", value.asInstanceOf[js.Any])
  }
  
}

