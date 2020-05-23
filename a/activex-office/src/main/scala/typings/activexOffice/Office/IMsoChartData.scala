package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoChartData extends js.Object {
  val IsLinked: Boolean
  @JSName("Office.IMsoChartData_typekey")
  var OfficeDotIMsoChartData_typekey: IMsoChartData
  val Workbook: js.Any
  def Activate(): Unit
  def ActivateChartDataWindow(): Unit
  def BreakLink(): Unit
}

object IMsoChartData {
  @scala.inline
  def apply(
    Activate: () => Unit,
    ActivateChartDataWindow: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    OfficeDotIMsoChartData_typekey: IMsoChartData,
    Workbook: js.Any
  ): IMsoChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), ActivateChartDataWindow = js.Any.fromFunction0(ActivateChartDataWindow), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartData_typekey")(OfficeDotIMsoChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartData]
  }
}

