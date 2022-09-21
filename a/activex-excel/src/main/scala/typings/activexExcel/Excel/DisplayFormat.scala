package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayFormat extends StObject {
  
  val AddIndent: Boolean | Null = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typings.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.DisplayFormat_typekey")
  var ExcelDotDisplayFormat_typekey: DisplayFormat = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  val FormulaHidden: Boolean | Null = js.native
  
  val HorizontalAlignment: Any = js.native
  
  val IndentLevel: Any = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  val Locked: Boolean | Null = js.native
  
  val MergeCells: Boolean = js.native
  
  val NumberFormat: String | Null = js.native
  
  val NumberFormatLocal: String | Null = js.native
  
  val Orientation: Any = js.native
  
  val Parent: Any = js.native
  
  val ReadingOrder: Double = js.native
  
  val ShrinkToFit: Boolean = js.native
  
  val Style: typings.activexExcel.Excel.Style = js.native
  
  val VerticalAlignment: Any = js.native
  
  val WrapText: Boolean = js.native
}
