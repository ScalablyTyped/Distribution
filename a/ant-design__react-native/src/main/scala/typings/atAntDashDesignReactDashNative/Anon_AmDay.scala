package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmDay extends js.Object {
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

object Anon_AmDay {
  @scala.inline
  def apply(am: String, day: String, hour: String, minute: String, month: String, pm: String, year: String): Anon_AmDay = {
    val __obj = js.Dynamic.literal(am = am, day = day, hour = hour, minute = minute, month = month, pm = pm, year = year)
  
    __obj.asInstanceOf[Anon_AmDay]
  }
}

