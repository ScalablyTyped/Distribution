package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerPickerPrefixCls extends StObject {
  
  var prefixCls: String
  
  var timePickerPickerPrefixCls: String
  
  var timePickerPrefixCls: String
}
object TimePickerPickerPrefixCls {
  
  inline def apply(prefixCls: String, timePickerPickerPrefixCls: String, timePickerPrefixCls: String): TimePickerPickerPrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], timePickerPickerPrefixCls = timePickerPickerPrefixCls.asInstanceOf[js.Any], timePickerPrefixCls = timePickerPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerPickerPrefixCls]
  }
  
  extension [Self <: TimePickerPickerPrefixCls](x: Self) {
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setTimePickerPickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setTimePickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPrefixCls", value.asInstanceOf[js.Any])
  }
}
