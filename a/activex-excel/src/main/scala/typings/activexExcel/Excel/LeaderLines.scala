package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderLines extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Border: typings.activexExcel.Excel.Border
  val Creator: XlCreator
  @JSName("Excel.LeaderLines_typekey")
  var ExcelDotLeaderLines_typekey: LeaderLines
  val Format: ChartFormat
  val Parent: js.Any
  def Delete(): Unit
  def Select(): Unit
}

object LeaderLines {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotLeaderLines_typekey: LeaderLines,
    Format: ChartFormat,
    Parent: js.Any,
    Select: () => Unit
  ): LeaderLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.LeaderLines_typekey")(ExcelDotLeaderLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderLines]
  }
}

