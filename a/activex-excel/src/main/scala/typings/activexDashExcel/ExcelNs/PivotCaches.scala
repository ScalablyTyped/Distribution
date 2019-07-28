package typings.activexDashExcel.ExcelNs

import typings.activexDashExcel.activexDashExcelNumbers.`1`
import typings.activexDashExcel.activexDashExcelNumbers.`2`
import typings.activexDashExcel.activexDashExcelNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotCaches extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType, SourceData: js.Any): PivotCache = js.native
  @JSName("Create")
  def Create_1(SourceType: `1`, SourceData: String): PivotCache = js.native
  @JSName("Create")
  def Create_1(SourceType: `1`, SourceData: String, Version: XlPivotTableVersionList): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection, Version: XlPivotTableVersionList): PivotCache = js.native
  @JSName("Create")
  def Create_3(SourceType: `3`, SourceData: String): PivotCache = js.native
  @JSName("Create")
  def Create_3(SourceType: `3`, SourceData: String, Version: XlPivotTableVersionList): PivotCache = js.native
  def Item(Index: Double): PivotCache = js.native
  def _Default(Index: js.Any): PivotCache = js.native
}

