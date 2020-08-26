package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkAxes extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SparkAxes_typekey")
  var ExcelDotSparkAxes_typekey: SparkAxes = js.native
  val Horizontal: SparkHorizontalAxis = js.native
  val Parent: js.Any = js.native
  val Vertical: SparkVerticalAxis = js.native
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
  @scala.inline
  implicit class SparkAxesOps[Self <: SparkAxes] (val x: Self) extends AnyVal {
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
    def setExcelDotSparkAxes_typekey(value: SparkAxes): Self = this.set("Excel.SparkAxes_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: SparkHorizontalAxis): Self = this.set("Horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: SparkVerticalAxis): Self = this.set("Vertical", value.asInstanceOf[js.Any])
  }
  
}

