package typings.antd.timelineItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeLineItemProps_ extends TimelineItemProps {
  
  var __deprecated_do_not_use_it__ : js.UndefOr[js.Any] = js.native
}
object TimeLineItemProps_ {
  
  @scala.inline
  def apply(): TimeLineItemProps_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeLineItemProps_]
  }
  
  @scala.inline
  implicit class TimeLineItemProps_Ops[Self <: TimeLineItemProps_] (val x: Self) extends AnyVal {
    
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
    def set__deprecated_do_not_use_it__(value: js.Any): Self = this.set("__deprecated_do_not_use_it__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__deprecated_do_not_use_it__ : Self = this.set("__deprecated_do_not_use_it__", js.undefined)
  }
}
