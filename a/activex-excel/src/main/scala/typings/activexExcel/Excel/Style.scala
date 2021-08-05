package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var AddIndent: Boolean
  
  val Application: typings.activexExcel.Excel.Application
  
  def Borders(Index: XlBordersIndex): Border
  @JSName("Borders")
  val Borders_Original: Borders
  
  val BuiltIn: Boolean
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  /* private */ @JSName("Excel.Style_typekey")
  var ExcelDotStyle_typekey: Style
  
  val Font: typings.activexExcel.Excel.Font
  
  var FormulaHidden: Boolean
  
  var HorizontalAlignment: XlHAlign
  
  var IncludeAlignment: Boolean
  
  var IncludeBorder: Boolean
  
  var IncludeFont: Boolean
  
  var IncludeNumber: Boolean
  
  var IncludePatterns: Boolean
  
  var IncludeProtection: Boolean
  
  var IndentLevel: Double
  
  val Interior: typings.activexExcel.Excel.Interior
  
  var Locked: Boolean
  
  var MergeCells: Boolean
  
  val Name: String
  
  val NameLocal: String
  
  var NumberFormat: String
  
  var NumberFormatLocal: String
  
  var Orientation: XlOrientation
  
  val Parent: js.Any
  
  var ReadingOrder: Double
  
  var ShrinkToFit: Boolean
  
  val Value: String
  
  var VerticalAlignment: XlVAlign
  
  var WrapText: Boolean
  
  val _Default: String
}
object Style {
  
  inline def apply(
    AddIndent: Boolean,
    Application: Application,
    Borders: Borders,
    BuiltIn: Boolean,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotStyle_typekey: Style,
    Font: Font,
    FormulaHidden: Boolean,
    HorizontalAlignment: XlHAlign,
    IncludeAlignment: Boolean,
    IncludeBorder: Boolean,
    IncludeFont: Boolean,
    IncludeNumber: Boolean,
    IncludePatterns: Boolean,
    IncludeProtection: Boolean,
    IndentLevel: Double,
    Interior: Interior,
    Locked: Boolean,
    MergeCells: Boolean,
    Name: String,
    NameLocal: String,
    NumberFormat: String,
    NumberFormatLocal: String,
    Orientation: XlOrientation,
    Parent: js.Any,
    ReadingOrder: Double,
    ShrinkToFit: Boolean,
    Value: String,
    VerticalAlignment: XlVAlign,
    WrapText: Boolean,
    _Default: String
  ): Style = {
    val __obj = js.Dynamic.literal(AddIndent = AddIndent.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], FormulaHidden = FormulaHidden.asInstanceOf[js.Any], HorizontalAlignment = HorizontalAlignment.asInstanceOf[js.Any], IncludeAlignment = IncludeAlignment.asInstanceOf[js.Any], IncludeBorder = IncludeBorder.asInstanceOf[js.Any], IncludeFont = IncludeFont.asInstanceOf[js.Any], IncludeNumber = IncludeNumber.asInstanceOf[js.Any], IncludePatterns = IncludePatterns.asInstanceOf[js.Any], IncludeProtection = IncludeProtection.asInstanceOf[js.Any], IndentLevel = IndentLevel.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MergeCells = MergeCells.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameLocal = NameLocal.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any], WrapText = WrapText.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Style_typekey")(ExcelDotStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  extension [Self <: Style](x: Self) {
    
    inline def setAddIndent(value: Boolean): Self = StObject.set(x, "AddIndent", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotStyle_typekey(value: Style): Self = StObject.set(x, "Excel.Style_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormulaHidden(value: Boolean): Self = StObject.set(x, "FormulaHidden", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignment(value: XlHAlign): Self = StObject.set(x, "HorizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setIncludeAlignment(value: Boolean): Self = StObject.set(x, "IncludeAlignment", value.asInstanceOf[js.Any])
    
    inline def setIncludeBorder(value: Boolean): Self = StObject.set(x, "IncludeBorder", value.asInstanceOf[js.Any])
    
    inline def setIncludeFont(value: Boolean): Self = StObject.set(x, "IncludeFont", value.asInstanceOf[js.Any])
    
    inline def setIncludeNumber(value: Boolean): Self = StObject.set(x, "IncludeNumber", value.asInstanceOf[js.Any])
    
    inline def setIncludePatterns(value: Boolean): Self = StObject.set(x, "IncludePatterns", value.asInstanceOf[js.Any])
    
    inline def setIncludeProtection(value: Boolean): Self = StObject.set(x, "IncludeProtection", value.asInstanceOf[js.Any])
    
    inline def setIndentLevel(value: Double): Self = StObject.set(x, "IndentLevel", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setMergeCells(value: Boolean): Self = StObject.set(x, "MergeCells", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameLocal(value: String): Self = StObject.set(x, "NameLocal", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatLocal(value: String): Self = StObject.set(x, "NumberFormatLocal", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: XlOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReadingOrder(value: Double): Self = StObject.set(x, "ReadingOrder", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "ShrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: XlVAlign): Self = StObject.set(x, "VerticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setWrapText(value: Boolean): Self = StObject.set(x, "WrapText", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
