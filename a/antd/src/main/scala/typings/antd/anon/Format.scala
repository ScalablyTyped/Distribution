package typings.antd.anon

import typings.rcPicker.interfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format[DisabledTime] extends StObject {
  
  var disabledTime: js.UndefOr[DisabledTime] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var picker: js.UndefOr[PickerMode] = js.undefined
}
object Format {
  
  inline def apply[DisabledTime](): Format[DisabledTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format[DisabledTime]]
  }
  
  extension [Self <: Format[?], DisabledTime](x: Self & Format[DisabledTime]) {
    
    inline def setDisabledTime(value: DisabledTime): Self = StObject.set(x, "disabledTime", value.asInstanceOf[js.Any])
    
    inline def setDisabledTimeUndefined: Self = StObject.set(x, "disabledTime", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
  }
}
