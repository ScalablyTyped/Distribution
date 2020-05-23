package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkVerticalAxis extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var CustomMaxScaleValue: js.Any
  var CustomMinScaleValue: js.Any
  @JSName("Excel.SparkVerticalAxis_typekey")
  var ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis
  var MaxScaleType: XlSparkScale
  var MinScaleType: XlSparkScale
  val Parent: js.Any
}

object SparkVerticalAxis {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    CustomMaxScaleValue: js.Any,
    CustomMinScaleValue: js.Any,
    ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis,
    MaxScaleType: XlSparkScale,
    MinScaleType: XlSparkScale,
    Parent: js.Any
  ): SparkVerticalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomMaxScaleValue = CustomMaxScaleValue.asInstanceOf[js.Any], CustomMinScaleValue = CustomMinScaleValue.asInstanceOf[js.Any], MaxScaleType = MaxScaleType.asInstanceOf[js.Any], MinScaleType = MinScaleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkVerticalAxis_typekey")(ExcelDotSparkVerticalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkVerticalAxis]
  }
}

