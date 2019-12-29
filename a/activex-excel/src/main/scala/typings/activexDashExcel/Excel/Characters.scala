package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Characters")
@js.native
class Characters protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var Caption: String = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Characters_typekey")
  var ExcelDotCharacters_typekey: Characters = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val Parent: js.Any = js.native
  var PhoneticCharacters: String = js.native
  var Text: String = js.native
  def Delete(): Null = js.native
  def Insert(): String = js.native
  def Insert(String: String): String = js.native
}

