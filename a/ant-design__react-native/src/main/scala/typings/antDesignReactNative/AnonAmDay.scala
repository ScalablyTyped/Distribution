package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmDay extends js.Object {
  /** 上午 */
  var am: String
  /** 日 */
  var day: String
  /** 时 */
  var hour: String
  /** 分 */
  var minute: String
  /** 月 */
  var month: String
  /** 下午 */
  var pm: String
  /** 年 */
  var year: String
}

object AnonAmDay {
  @scala.inline
  def apply(am: String, day: String, hour: String, minute: String, month: String, pm: String, year: String): AnonAmDay = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmDay]
  }
}

