package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTitle extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var AutoScaleFont: Any = js.native
  
  val Border: typings.activexExcel.Excel.Border = js.native
  
  var Caption: String = js.native
  
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typings.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Any = js.native
  
  /* private */ @JSName("Excel.ChartTitle_typekey")
  var ExcelDotChartTitle_typekey: ChartTitle = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  val Format: ChartFormat = js.native
  
  var Formula: String = js.native
  
  var FormulaLocal: String = js.native
  
  var FormulaR1C1: String = js.native
  
  var FormulaR1C1Local: String = js.native
  
  val Height: Double = js.native
  
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  var IncludeInLayout: Boolean = js.native
  
  val Interior: typings.activexExcel.Excel.Interior = js.native
  
  var Left: Double = js.native
  
  val Name: String = js.native
  
  var Orientation: Any = js.native
  
  val Parent: Any = js.native
  
  var Position: XlChartElementPosition = js.native
  
  var ReadingOrder: Double = js.native
  
  def Select(): Any = js.native
  
  var Shadow: Boolean = js.native
  
  var Text: String = js.native
  
  var Top: Double = js.native
  
  var VerticalAlignment: VerticalAlignments = js.native
  
  val Width: Double = js.native
}
