package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerPivotTables extends StObject {
  
  def apply(Index: String): PivotTable = js.native
  def apply(Index: Double): PivotTable = js.native
  
  def AddPivotTable(PivotTable: PivotTable): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): PivotTable = js.native
  def Item(Index: Double): PivotTable = js.native
  
  val Parent: js.Any = js.native
  
  def RemovePivotTable(PivotTable: String): Unit = js.native
  def RemovePivotTable(PivotTable: Double): Unit = js.native
  def RemovePivotTable(PivotTable: PivotTable): Unit = js.native
  
  def _Default(Index: js.Any): PivotTable = js.native
}
