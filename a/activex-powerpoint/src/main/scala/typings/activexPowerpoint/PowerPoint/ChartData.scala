package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  val IsLinked: Boolean
  @JSName("PowerPoint.ChartData_typekey")
  var PowerPointDotChartData_typekey: ChartData
  val Workbook: js.Any
  def Activate(): Unit
  def BreakLink(): Unit
}

object ChartData {
  @scala.inline
  def apply(
    Activate: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    PowerPointDotChartData_typekey: ChartData,
    Workbook: js.Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartData_typekey")(PowerPointDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

