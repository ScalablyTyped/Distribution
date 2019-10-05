package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerPivotTables extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): PivotTable = js.native
  def apply(Index: Double): PivotTable = js.native
  def AddPivotTable(PivotTable: PivotTable): Unit = js.native
  def Item(Index: String): PivotTable = js.native
  def Item(Index: Double): PivotTable = js.native
  def RemovePivotTable(PivotTable: String): Unit = js.native
  def RemovePivotTable(PivotTable: Double): Unit = js.native
  def RemovePivotTable(PivotTable: PivotTable): Unit = js.native
  def _Default(Index: js.Any): PivotTable = js.native
}

