package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkAxes extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.SparkAxes_typekey")
  var ExcelDotSparkAxes_typekey: SparkAxes
  val Horizontal: SparkHorizontalAxis
  val Parent: js.Any
  val Vertical: SparkVerticalAxis
}

object SparkAxes {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkAxes_typekey: SparkAxes,
    Horizontal: SparkHorizontalAxis,
    Parent: js.Any,
    Vertical: SparkVerticalAxis
  ): SparkAxes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Horizontal = Horizontal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Vertical = Vertical.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkAxes_typekey")(ExcelDotSparkAxes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkAxes]
  }
}

