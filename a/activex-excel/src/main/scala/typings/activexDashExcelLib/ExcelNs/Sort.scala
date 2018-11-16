package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Sort")
@js.native
class Sort protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.Sort_typekey`: Sort = js.native
  var Header: XlYesNoGuess = js.native
  var MatchCase: scala.Boolean = js.native
  var Orientation: XlSortOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("Rng")
  val Rng_Original: Range = js.native
  @JSName("SortFields")
  val SortFields_Original: SortFields = js.native
  var SortMethod: XlSortMethod = js.native
  def Apply(): scala.Unit = js.native
  def Rng(Address: java.lang.String): Range = js.native
  def Rng(RowIndex: scala.Double): Range = js.native
  def Rng(RowIndex: scala.Double, ColumnIndex: scala.Double): Range = js.native
  def SetRange(Rng: Range): scala.Unit = js.native
  def SortFields(Index: js.Any): SortField = js.native
}

