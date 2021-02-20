package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extra extends StObject {
  
  var extra: String = js.native
  
  var minuteStep: Double = js.native
  
  var mode: String = js.native
  
  var pickerPrefixCls: String = js.native
  
  var prefixCls: String = js.native
  
  var use12Hours: Boolean = js.native
}
object Extra {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ExtraMutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerPrefixCls(value: String): Self = StObject.set(x, "pickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse12Hours(value: Boolean): Self = StObject.set(x, "use12Hours", value.asInstanceOf[js.Any])
  }
}
