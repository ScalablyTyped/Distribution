package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkHorizontalAxis extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Axis: SparkColor = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SparkHorizontalAxis_typekey")
  var ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis = js.native
  val IsDateAxis: Boolean = js.native
  val Parent: js.Any = js.native
  var RightToLeftPlotOrder: Boolean = js.native
}

object SparkHorizontalAxis {
  @scala.inline
  def apply(
    Application: Application,
    Axis: SparkColor,
    Creator: XlCreator,
    ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis,
    IsDateAxis: Boolean,
    Parent: js.Any,
    RightToLeftPlotOrder: Boolean
  ): SparkHorizontalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Axis = Axis.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], IsDateAxis = IsDateAxis.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightToLeftPlotOrder = RightToLeftPlotOrder.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkHorizontalAxis_typekey")(ExcelDotSparkHorizontalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkHorizontalAxis]
  }
  @scala.inline
  implicit class SparkHorizontalAxisOps[Self <: SparkHorizontalAxis] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxis(value: SparkColor): Self = this.set("Axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotSparkHorizontalAxis_typekey(value: SparkHorizontalAxis): Self = this.set("Excel.SparkHorizontalAxis_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDateAxis(value: Boolean): Self = this.set("IsDateAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightToLeftPlotOrder(value: Boolean): Self = this.set("RightToLeftPlotOrder", value.asInstanceOf[js.Any])
  }
  
}

