package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerPickerPrefixCls extends js.Object {
  
  var prefixCls: String = js.native
  
  var timePickerPickerPrefixCls: String = js.native
  
  var timePickerPrefixCls: String = js.native
}
object TimePickerPickerPrefixCls {
  
  @scala.inline
  def apply(prefixCls: String, timePickerPickerPrefixCls: String, timePickerPrefixCls: String): TimePickerPickerPrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], timePickerPickerPrefixCls = timePickerPickerPrefixCls.asInstanceOf[js.Any], timePickerPrefixCls = timePickerPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerPickerPrefixCls]
  }
  
  @scala.inline
  implicit class TimePickerPickerPrefixClsOps[Self <: TimePickerPickerPrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePickerPickerPrefixCls(value: String): Self = this.set("timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePickerPrefixCls(value: String): Self = this.set("timePickerPrefixCls", value.asInstanceOf[js.Any])
  }
}
