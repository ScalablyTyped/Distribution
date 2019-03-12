package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerPivotTables extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): PivotTable = js.native
  def apply(Index: scala.Double): PivotTable = js.native
  def AddPivotTable(PivotTable: PivotTable): scala.Unit = js.native
  def Item(Index: java.lang.String): PivotTable = js.native
  def Item(Index: scala.Double): PivotTable = js.native
  def RemovePivotTable(PivotTable: PivotTable): scala.Unit = js.native
  def RemovePivotTable(PivotTable: java.lang.String): scala.Unit = js.native
  def RemovePivotTable(PivotTable: scala.Double): scala.Unit = js.native
  def _Default(Index: js.Any): PivotTable = js.native
}

