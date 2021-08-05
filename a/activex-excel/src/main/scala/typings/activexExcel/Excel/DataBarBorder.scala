package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBarBorder extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Color: FormatColor
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.DataBarBorder_typekey")
  var ExcelDotDataBarBorder_typekey: DataBarBorder
  
  val Parent: js.Any
  
  var Type: XlDataBarBorderType
}
object DataBarBorder {
  
  inline def apply(
    Application: Application,
    Color: FormatColor,
    Creator: XlCreator,
    ExcelDotDataBarBorder_typekey: DataBarBorder,
    Parent: js.Any,
    Type: XlDataBarBorderType
  ): DataBarBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.DataBarBorder_typekey")(ExcelDotDataBarBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarBorder]
  }
  
  extension [Self <: DataBarBorder](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotDataBarBorder_typekey(value: DataBarBorder): Self = StObject.set(x, "Excel.DataBarBorder_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlDataBarBorderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
