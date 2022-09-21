package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotItems extends StObject {
  
  def Add(Name: String): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.PivotItems_typekey")
  var ExcelDotPivotItems_typekey: PivotItems = js.native
  
  def Item(Index: String): Any = js.native
  def Item(Index: Double): Any = js.native
  
  val Parent: PivotField = js.native
}
