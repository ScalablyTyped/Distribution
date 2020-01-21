package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Comment")
@js.native
class Comment protected () extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Author: String = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Comment_typekey")
  var ExcelDotComment_typekey: Comment = js.native
  val Parent: js.Any = js.native
  val Shape: typings.activexExcel.Excel.Shape = js.native
  var Visible: Boolean = js.native
  def Delete(): Unit = js.native
  def Next(): Comment = js.native
  def Previous(): Comment = js.native
  def Text(): String = js.native
  def Text(Text: String): String = js.native
  def Text(Text: String, Start: Double): String = js.native
  def Text(Text: String, Start: Double, Overwrite: Boolean): String = js.native
}

