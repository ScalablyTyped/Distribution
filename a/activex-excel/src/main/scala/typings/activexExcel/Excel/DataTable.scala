package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var AutoScaleFont: js.Any
  
  val Border: typings.activexExcel.Excel.Border
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.DataTable_typekey")
  var ExcelDotDataTable_typekey: DataTable
  
  val Font: typings.activexExcel.Excel.Font
  
  val Format: ChartFormat
  
  var HasBorderHorizontal: Boolean
  
  var HasBorderOutline: Boolean
  
  var HasBorderVertical: Boolean
  
  val Parent: js.Any
  
  def Select(): Unit
  
  var ShowLegendKey: Boolean
}
object DataTable {
  
  inline def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: Border,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotDataTable_typekey: DataTable,
    Font: Font,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataTable_typekey")(ExcelDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
  
  extension [Self <: DataTable](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: js.Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotDataTable_typekey(value: DataTable): Self = StObject.set(x, "Excel.DataTable_typekey", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHasBorderHorizontal(value: Boolean): Self = StObject.set(x, "HasBorderHorizontal", value.asInstanceOf[js.Any])
    
    inline def setHasBorderOutline(value: Boolean): Self = StObject.set(x, "HasBorderOutline", value.asInstanceOf[js.Any])
    
    inline def setHasBorderVertical(value: Boolean): Self = StObject.set(x, "HasBorderVertical", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => Unit): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setShowLegendKey(value: Boolean): Self = StObject.set(x, "ShowLegendKey", value.asInstanceOf[js.Any])
  }
}
