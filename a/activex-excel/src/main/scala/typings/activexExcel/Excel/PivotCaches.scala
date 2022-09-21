package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotCaches extends StObject {
  
  def apply(Index: Double): PivotCache = js.native
  
  def Add(SourceType: XlPivotTableSourceType): PivotCache = js.native
  def Add(SourceType: XlPivotTableSourceType, SourceData: Any): PivotCache = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  def Create(SourceType: `1` | `3`, SourceData: String): PivotCache = js.native
  def Create(SourceType: `1` | `3`, SourceData: String, Version: XlPivotTableVersionList): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection): PivotCache = js.native
  @JSName("Create")
  def Create_2(SourceType: `2`, SourceData: WorkbookConnection, Version: XlPivotTableVersionList): PivotCache = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): PivotCache = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): PivotCache = js.native
}
