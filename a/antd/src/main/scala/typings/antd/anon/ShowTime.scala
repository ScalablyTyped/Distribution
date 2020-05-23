package typings.antd.anon

import typings.rcPicker.timePanelMod.SharedTimeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTime[DateType] extends js.Object {
  var showTime: SharedTimeProps[DateType]
}

object ShowTime {
  @scala.inline
  def apply[DateType](showTime: SharedTimeProps[DateType]): ShowTime[DateType] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType]]
  }
}

