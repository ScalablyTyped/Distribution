package typings.antd.anon

import typings.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowTime[DateType] extends js.Object {
  var showTime: SharedTimeProps[DateType] = js.native
}

object ShowTime {
  @scala.inline
  def apply[DateType](showTime: SharedTimeProps[DateType]): ShowTime[DateType] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType]]
  }
  @scala.inline
  implicit class ShowTimeOps[Self <: ShowTime[_], DateType] (val x: Self with ShowTime[DateType]) extends AnyVal {
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
    def setShowTime(value: SharedTimeProps[DateType]): Self = this.set("showTime", value.asInstanceOf[js.Any])
  }
  
}

