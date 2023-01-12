package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NegativeBarFormat extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val BorderColor: FormatColor
  
  var BorderColorType: XlDataBarNegativeColorType
  
  val Color: FormatColor
  
  var ColorType: XlDataBarNegativeColorType
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.NegativeBarFormat_typekey")
  var ExcelDotNegativeBarFormat_typekey: NegativeBarFormat
  
  val Parent: Any
}
object NegativeBarFormat {
  
  inline def apply(
    Application: Application,
    BorderColor: FormatColor,
    BorderColorType: XlDataBarNegativeColorType,
    Color: FormatColor,
    ColorType: XlDataBarNegativeColorType,
    Creator: XlCreator,
    ExcelDotNegativeBarFormat_typekey: NegativeBarFormat,
    Parent: Any
  ): NegativeBarFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderColorType = BorderColorType.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.NegativeBarFormat_typekey")(ExcelDotNegativeBarFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegativeBarFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NegativeBarFormat] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: FormatColor): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorType(value: XlDataBarNegativeColorType): Self = StObject.set(x, "BorderColorType", value.asInstanceOf[js.Any])
    
    inline def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorType(value: XlDataBarNegativeColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotNegativeBarFormat_typekey(value: NegativeBarFormat): Self = StObject.set(x, "Excel.NegativeBarFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
