package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkHorizontalAxis extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Axis: SparkColor
  val Creator: XlCreator
  @JSName("Excel.SparkHorizontalAxis_typekey")
  var ExcelDotSparkHorizontalAxis_typekey: SparkHorizontalAxis
  val IsDateAxis: Boolean
  val Parent: js.Any
  var RightToLeftPlotOrder: Boolean
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
}

