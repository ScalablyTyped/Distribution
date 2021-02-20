package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeBarFormat extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val BorderColor: FormatColor = js.native
  
  var BorderColorType: XlDataBarNegativeColorType = js.native
  
  val Color: FormatColor = js.native
  
  var ColorType: XlDataBarNegativeColorType = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.NegativeBarFormat_typekey")
  var ExcelDotNegativeBarFormat_typekey: NegativeBarFormat = js.native
  
  val Parent: js.Any = js.native
}
object NegativeBarFormat {
  
  @scala.inline
  def apply(
    Application: Application,
    BorderColor: FormatColor,
    BorderColorType: XlDataBarNegativeColorType,
    Color: FormatColor,
    ColorType: XlDataBarNegativeColorType,
    Creator: XlCreator,
    ExcelDotNegativeBarFormat_typekey: NegativeBarFormat,
    Parent: js.Any
  ): NegativeBarFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderColorType = BorderColorType.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorType = ColorType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.NegativeBarFormat_typekey")(ExcelDotNegativeBarFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NegativeBarFormat]
  }
  
  @scala.inline
  implicit class NegativeBarFormatMutableBuilder[Self <: NegativeBarFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: FormatColor): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorType(value: XlDataBarNegativeColorType): Self = StObject.set(x, "BorderColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: FormatColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: XlDataBarNegativeColorType): Self = StObject.set(x, "ColorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotNegativeBarFormat_typekey(value: NegativeBarFormat): Self = StObject.set(x, "Excel.NegativeBarFormat_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
