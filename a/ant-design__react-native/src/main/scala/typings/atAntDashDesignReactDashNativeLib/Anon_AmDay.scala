package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmDay extends js.Object {
  /** 上午 */
  var am: java.lang.String
  /** 日 */
  var day: java.lang.String
  /** 时 */
  var hour: java.lang.String
  /** 分 */
  var minute: java.lang.String
  /** 月 */
  var month: java.lang.String
  /** 下午 */
  var pm: java.lang.String
  /** 年 */
  var year: java.lang.String
}

object Anon_AmDay {
  @scala.inline
  def apply(
    am: java.lang.String,
    day: java.lang.String,
    hour: java.lang.String,
    minute: java.lang.String,
    month: java.lang.String,
    pm: java.lang.String,
    year: java.lang.String
  ): Anon_AmDay = {
    val __obj = js.Dynamic.literal(am = am, day = day, hour = hour, minute = minute, month = month, pm = pm, year = year)
  
    __obj.asInstanceOf[Anon_AmDay]
  }
}

