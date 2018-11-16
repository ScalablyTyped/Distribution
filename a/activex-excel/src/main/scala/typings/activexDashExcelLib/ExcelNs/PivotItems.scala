package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PivotItems")
@js.native
class PivotItems protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  var `Excel.PivotItems_typekey`: PivotItems = js.native
  val Parent: PivotField = js.native
  def Add(Name: java.lang.String): scala.Unit = js.native
  def Item(Index: java.lang.String): js.Any = js.native
  def Item(Index: scala.Double): js.Any = js.native
}

