package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Borders
import typings.activexExcel.Excel.HorizontalAlignments
import typings.activexExcel.Excel.VerticalAlignments
import typings.activexExcel.Excel.XlBordersIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlOrientation
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.CellFormat")
@js.native
/* private */ open class CellFormat ()
  extends StObject
     with typings.activexExcel.Excel.CellFormat {
  
  /* CompleteClass */
  var AddIndent: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  var Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: typings.activexExcel.Excel.CellFormat = js.native
  
  /* CompleteClass */
  var Font: typings.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  var FormulaHidden: Boolean | Null = js.native
  
  /* CompleteClass */
  var HorizontalAlignment: HorizontalAlignments = js.native
  
  /* CompleteClass */
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
  
  /* CompleteClass */
  var Interior: typings.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  var Locked: Boolean | Null = js.native
  
  /* CompleteClass */
  var MergeCells: Boolean = js.native
  
  /* CompleteClass */
  var NumberFormat: String | Null = js.native
  
  /* CompleteClass */
  var NumberFormatLocal: String | Null = js.native
  
  /* CompleteClass */
  var Orientation: Double | XlOrientation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ShrinkToFit: Boolean | Null = js.native
  
  /* CompleteClass */
  var VerticalAlignment: VerticalAlignments = js.native
  
  /* CompleteClass */
  var WrapText: Boolean | Null = js.native
}
