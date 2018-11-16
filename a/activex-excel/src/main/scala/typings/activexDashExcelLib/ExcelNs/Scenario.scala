package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Scenario")
@js.native
class Scenario protected () extends js.Object {
  val Application: Application = js.native
  @JSName("ChangingCells")
  val ChangingCells_Original: Range = js.native
  var Comment: java.lang.String = js.native
  val Creator: XlCreator = js.native
  var `Excel.Scenario_typekey`: Scenario = js.native
  var Hidden: scala.Boolean = js.native
  val Index: scala.Double = js.native
  var Locked: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  def ChangeScenario(ChangingCells: Range): js.Any = js.native
  def ChangeScenario(ChangingCells: Range, Values: activexDashInteropLib.SafeArray[_]): js.Any = js.native
  def ChangingCells(Address: java.lang.String): Range = js.native
  def ChangingCells(RowIndex: scala.Double): Range = js.native
  def ChangingCells(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def Delete(): js.Any = js.native
  def Show(): js.Any = js.native
  def Values(): activexDashInteropLib.SafeArray[_] = js.native
  def Values(Index: scala.Double): js.Any = js.native
}

