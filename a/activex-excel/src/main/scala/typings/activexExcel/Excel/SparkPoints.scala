package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkPoints extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.SparkPoints_typekey")
  var ExcelDotSparkPoints_typekey: SparkPoints
  val Firstpoint: SparkColor
  val Highpoint: SparkColor
  val Lastpoint: SparkColor
  val Lowpoint: SparkColor
  val Markers: SparkColor
  val Negative: SparkColor
  val Parent: js.Any
}

object SparkPoints {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkPoints_typekey: SparkPoints,
    Firstpoint: SparkColor,
    Highpoint: SparkColor,
    Lastpoint: SparkColor,
    Lowpoint: SparkColor,
    Markers: SparkColor,
    Negative: SparkColor,
    Parent: js.Any
  ): SparkPoints = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Firstpoint = Firstpoint.asInstanceOf[js.Any], Highpoint = Highpoint.asInstanceOf[js.Any], Lastpoint = Lastpoint.asInstanceOf[js.Any], Lowpoint = Lowpoint.asInstanceOf[js.Any], Markers = Markers.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkPoints_typekey")(ExcelDotSparkPoints_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPoints]
  }
}

