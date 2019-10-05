package typings.activexDashExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Scenario")
@js.native
class Scenario protected () extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  @JSName("ChangingCells")
  val ChangingCells_Original: Range = js.native
  var Comment: String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Scenario_typekey`: Scenario = js.native
  var Hidden: Boolean = js.native
  val Index: Double = js.native
  var Locked: Boolean = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  def ChangeScenario(ChangingCells: Range): js.Any = js.native
  def ChangeScenario(ChangingCells: Range, Values: SafeArray[_]): js.Any = js.native
  def ChangingCells(Address: String): Range = js.native
  def ChangingCells(RowIndex: Double): Range = js.native
  def ChangingCells(RowIndex: Double, ColumnIndex: Double): Range = js.native
  def Delete(): js.Any = js.native
  def Show(): js.Any = js.native
  def Values(): SafeArray[_] = js.native
  def Values(Index: Double): js.Any = js.native
}

