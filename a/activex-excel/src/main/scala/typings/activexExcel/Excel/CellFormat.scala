package typings.activexExcel.Excel

import typings.activexExcel.activexExcelInts.`0`
import typings.activexExcel.activexExcelInts.`10`
import typings.activexExcel.activexExcelInts.`11`
import typings.activexExcel.activexExcelInts.`12`
import typings.activexExcel.activexExcelInts.`13`
import typings.activexExcel.activexExcelInts.`14`
import typings.activexExcel.activexExcelInts.`15`
import typings.activexExcel.activexExcelInts.`1`
import typings.activexExcel.activexExcelInts.`2`
import typings.activexExcel.activexExcelInts.`3`
import typings.activexExcel.activexExcelInts.`4`
import typings.activexExcel.activexExcelInts.`5`
import typings.activexExcel.activexExcelInts.`6`
import typings.activexExcel.activexExcelInts.`7`
import typings.activexExcel.activexExcelInts.`8`
import typings.activexExcel.activexExcelInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellFormat extends StObject {
  
  var AddIndent: Boolean
  
  val Application: typings.activexExcel.Excel.Application
  
  def Borders(Index: XlBordersIndex): Border
  @JSName("Borders")
  var Borders_Original: Borders
  
  def Clear(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.CellFormat_typekey")
  var ExcelDotCellFormat_typekey: CellFormat
  
  var Font: typings.activexExcel.Excel.Font
  
  var FormulaHidden: Boolean | Null
  
  var HorizontalAlignment: HorizontalAlignments
  
  var IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  
  var Interior: typings.activexExcel.Excel.Interior
  
  var Locked: Boolean | Null
  
  var MergeCells: Boolean
  
  var NumberFormat: String | Null
  
  var NumberFormatLocal: String | Null
  
  var Orientation: Double | XlOrientation
  
  val Parent: Any
  
  var ShrinkToFit: Boolean | Null
  
  var VerticalAlignment: VerticalAlignments
  
  var WrapText: Boolean | Null
}
object CellFormat {
  
  inline def apply(
    AddIndent: Boolean,
    Application: Application,
    Borders: Borders,
    Clear: () => Unit,
    Creator: XlCreator,
    ExcelDotCellFormat_typekey: CellFormat,
    Font: Font,
    HorizontalAlignment: HorizontalAlignments,
    IndentLevel: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`,
    Interior: Interior,
    MergeCells: Boolean,
    Orientation: Double | XlOrientation,
    Parent: Any,
    VerticalAlignment: VerticalAlignments
  ): CellFormat = {
    val __obj = js.Dynamic.literal(AddIndent = AddIndent.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], IndentLevel = IndentLevel.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], MergeCells = MergeCells.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any], FormulaHidden = null, Locked = null, NumberFormat = null, NumberFormatLocal = null, ShrinkToFit = null, WrapText = null)
    __obj.updateDynamic("Excel.CellFormat_typekey")(ExcelDotCellFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellFormat] (val x: Self) extends AnyVal {
    
    inline def setAddIndent(value: Boolean): Self = StObject.set(x, "AddIndent", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotCellFormat_typekey(value: CellFormat): Self = StObject.set(x, "Excel.CellFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormulaHidden(value: Boolean): Self = StObject.set(x, "FormulaHidden", value.asInstanceOf[js.Any])
    
    inline def setFormulaHiddenNull: Self = StObject.set(x, "FormulaHidden", null)
    
    inline def setHorizontalAlignment(value: HorizontalAlignments): Self = StObject.set(x, "HorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setIndentLevel(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "IndentLevel", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "Locked", null)
    
    inline def setMergeCells(value: Boolean): Self = StObject.set(x, "MergeCells", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocal(value: String): Self = StObject.set(x, "NumberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocalNull: Self = StObject.set(x, "NumberFormatLocal", null)
    
    inline def setNumberFormatNull: Self = StObject.set(x, "NumberFormat", null)
    
    inline def setOrientation(value: Double | XlOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "ShrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFitNull: Self = StObject.set(x, "ShrinkToFit", null)
    
    inline def setVerticalAlignment(value: VerticalAlignments): Self = StObject.set(x, "VerticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "WrapText", value.asInstanceOf[js.Any])
    
    inline def setWrapTextNull: Self = StObject.set(x, "WrapText", null)
  }
}
