package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShowHour extends js.Object {
  var showHour: Boolean
  var showMinute: Boolean
  var showSecond: Boolean
}

object AnonShowHour {
  @scala.inline
  def apply(showHour: Boolean, showMinute: Boolean, showSecond: Boolean): AnonShowHour = {
    val __obj = js.Dynamic.literal(showHour = showHour.asInstanceOf[js.Any], showMinute = showMinute.asInstanceOf[js.Any], showSecond = showSecond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShowHour]
  }
}

