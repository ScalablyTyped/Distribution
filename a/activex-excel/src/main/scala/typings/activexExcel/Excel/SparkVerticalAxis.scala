package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkVerticalAxis extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var CustomMaxScaleValue: js.Any = js.native
  var CustomMinScaleValue: js.Any = js.native
  @JSName("Excel.SparkVerticalAxis_typekey")
  var ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis = js.native
  var MaxScaleType: XlSparkScale = js.native
  var MinScaleType: XlSparkScale = js.native
  val Parent: js.Any = js.native
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
  @scala.inline
  implicit class SparkVerticalAxisOps[Self <: SparkVerticalAxis] (val x: Self) extends AnyVal {
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
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomMaxScaleValue(value: js.Any): Self = this.set("CustomMaxScaleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomMinScaleValue(value: js.Any): Self = this.set("CustomMinScaleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotSparkVerticalAxis_typekey(value: SparkVerticalAxis): Self = this.set("Excel.SparkVerticalAxis_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxScaleType(value: XlSparkScale): Self = this.set("MaxScaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinScaleType(value: XlSparkScale): Self = this.set("MinScaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

