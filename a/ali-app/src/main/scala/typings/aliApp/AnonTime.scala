package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTime extends js.Object {
  /** 服务器时间的毫秒数 */
  var time: Double
}

object AnonTime {
  @scala.inline
  def apply(time: Double): AnonTime = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTime]
  }
}

