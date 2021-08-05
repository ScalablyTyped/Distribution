package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var extra: String
  
  var minuteStep: Double
  
  var mode: String
  
  var pickerPrefixCls: String
  
  var prefixCls: String
  
  var use12Hours: Boolean
}
object Extra {
  
  inline def apply(
    extra: String,
    minuteStep: Double,
    mode: String,
    pickerPrefixCls: String,
    prefixCls: String,
    use12Hours: Boolean
  ): Extra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], use12Hours = use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
  }
}
