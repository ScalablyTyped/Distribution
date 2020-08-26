package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  val IsLinked: Boolean = js.native
  @JSName("PowerPoint.ChartData_typekey")
  var PowerPointDotChartData_typekey: ChartData = js.native
  val Workbook: js.Any = js.native
  def Activate(): Unit = js.native
  def BreakLink(): Unit = js.native
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
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def setActivate(value: () => Unit): Self = this.set("Activate", js.Any.fromFunction0(value))
    @scala.inline
    def setBreakLink(value: () => Unit): Self = this.set("BreakLink", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLinked(value: Boolean): Self = this.set("IsLinked", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotChartData_typekey(value: ChartData): Self = this.set("PowerPoint.ChartData_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkbook(value: js.Any): Self = this.set("Workbook", value.asInstanceOf[js.Any])
  }
  
}

