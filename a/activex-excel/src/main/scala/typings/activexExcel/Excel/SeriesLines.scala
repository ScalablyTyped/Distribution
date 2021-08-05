package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLines extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Border: typings.activexExcel.Excel.Border
  
  val Creator: XlCreator
  
  def Delete(): js.Any
  
  /* private */ @JSName("Excel.SeriesLines_typekey")
  var ExcelDotSeriesLines_typekey: SeriesLines
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
}
object SeriesLines {
  
  inline def apply(
    Application: Application,
    Border: Border,
    Creator: XlCreator,
    Delete: () => js.Any,
    ExcelDotSeriesLines_typekey: SeriesLines,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): SeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.SeriesLines_typekey")(ExcelDotSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLines]
  }
  
  extension [Self <: SeriesLines](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setExcelDotSeriesLines_typekey(value: SeriesLines): Self = StObject.set(x, "Excel.SeriesLines_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
