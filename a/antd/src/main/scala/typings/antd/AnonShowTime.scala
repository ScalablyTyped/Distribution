package typings.antd

import typings.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowTime[DateType] extends js.Object {
  var showTime: SharedTimeProps[DateType]
}

object AnonShowTime {
  @scala.inline
  def apply[DateType](showTime: SharedTimeProps[DateType]): AnonShowTime[DateType] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShowTime[DateType]]
  }
}

