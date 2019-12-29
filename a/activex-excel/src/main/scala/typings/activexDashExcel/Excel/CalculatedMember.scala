package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CalculatedMember")
@js.native
class CalculatedMember protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val DisplayFolder: String = js.native
  val Dynamic: Boolean = js.native
  @JSName("Excel.CalculatedMember_typekey")
  var ExcelDotCalculatedMember_typekey: CalculatedMember = js.native
  var FlattenHierarchies: Boolean = js.native
  val Formula: String = js.native
  var HierarchizeDistinct: Boolean = js.native
  val IsValid: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val SolveOrder: Double = js.native
  val SourceName: String = js.native
  val Type: XlCalculatedMemberType = js.native
  val _Default: String = js.native
  def Delete(): Unit = js.native
}

