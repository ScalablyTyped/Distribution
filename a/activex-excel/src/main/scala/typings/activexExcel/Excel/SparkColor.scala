package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkColor extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Color: FormatColor
  val Creator: XlCreator
  @JSName("Excel.SparkColor_typekey")
  var ExcelDotSparkColor_typekey: SparkColor
  val Parent: js.Any
  var Visible: Boolean
}

object SparkColor {
  @scala.inline
  def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotSparkColor_typekey: SparkColor,
    Parent: js.Any,
    Visible: Boolean
  ): SparkColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkColor_typekey")(ExcelDotSparkColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkColor]
  }
}

