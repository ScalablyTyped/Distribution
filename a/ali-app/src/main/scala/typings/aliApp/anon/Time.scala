package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  /** 服务器时间的毫秒数 */
  var time: Double
}

object Time {
  @scala.inline
  def apply(time: Double): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

