package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`10`
import typings.activexExcel.activexExcelNumbers.`11`
import typings.activexExcel.activexExcelNumbers.`12`
import typings.activexExcel.activexExcelNumbers.`13`
import typings.activexExcel.activexExcelNumbers.`14`
import typings.activexExcel.activexExcelNumbers.`15`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexExcel.activexExcelNumbers.`2`
import typings.activexExcel.activexExcelNumbers.`3`
import typings.activexExcel.activexExcelNumbers.`4`
import typings.activexExcel.activexExcelNumbers.`5`
import typings.activexExcel.activexExcelNumbers.`6`
import typings.activexExcel.activexExcelNumbers.`7`
import typings.activexExcel.activexExcelNumbers.`8`
import typings.activexExcel.activexExcelNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellFormat extends js.Object {
  
  var AddIndent: Boolean = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Borders(Index: XlBordersIndex): Border = js.native
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: CellFormat = js.native
  
  var Font: typings.activexExcel.Excel.Font = js.native
  
  var FormulaHidden: Boolean | Null = js.native
  
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  
  var Interior: typings.activexExcel.Excel.Interior = js.native
  
  var Locked: Boolean | Null = js.native
  
  var MergeCells: Boolean = js.native
  
  var NumberFormat: String | Null = js.native
  
  var NumberFormatLocal: String | Null = js.native
  
  var Orientation: Double | XlOrientation = js.native
  
  val Parent: js.Any = js.native
  
  var ShrinkToFit: Boolean | Null = js.native
  
  var VerticalAlignment: VerticalAlignments = js.native
  
  var WrapText: Boolean | Null = js.native
}
