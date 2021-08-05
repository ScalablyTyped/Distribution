package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelStyle extends StObject {
  
  var alignment: js.UndefOr[ExcelAlignment] = js.undefined
  
  var borders: js.UndefOr[ExcelBorders] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[ExcelFont] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var interior: js.UndefOr[ExcelInterior] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var numberFormat: js.UndefOr[ExcelNumberFormat] = js.undefined
  
  var protection: js.UndefOr[ExcelProtection] = js.undefined
}
object ExcelStyle {
  
  inline def apply(): ExcelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelStyle]
  }
  
  extension [Self <: ExcelStyle](x: Self) {
    
    inline def setAlignment(value: ExcelAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBorders(value: ExcelBorders): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setFont(value: ExcelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInterior(value: ExcelInterior): Self = StObject.set(x, "interior", value.asInstanceOf[js.Any])
    
    inline def setInteriorUndefined: Self = StObject.set(x, "interior", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberFormat(value: ExcelNumberFormat): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setProtection(value: ExcelProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
  }
}
