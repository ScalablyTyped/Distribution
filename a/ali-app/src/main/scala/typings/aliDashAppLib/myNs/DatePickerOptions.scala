package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
trait DatePickerOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: java.lang.String
  /** 最大日期时间 */
  var endDate: java.lang.String
  /**
  		 * 返回的日期格式，
  		 * 1. yyyy-MM-dd（默认）
  		 * 2. HH:mm
  		 * 3. yyyy-MM-dd HH:mm
  		 * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
  		 * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
  		 */
  var format: aliDashAppLib.aliDashAppLibStrings.`yyyy-MM-dd` | aliDashAppLib.aliDashAppLibStrings.`HH:mm` | (aliDashAppLib.aliDashAppLibStrings.`yyyy-MM-dd HH:mm`) | aliDashAppLib.aliDashAppLibStrings.`yyyy-MM` | aliDashAppLib.aliDashAppLibStrings.yyyy
  /** 最小日期时间 */
  var startDate: java.lang.String
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_MDatePickerOptions(error: aliDashAppLib.aliDashAppLibNumbers.`11`): scala.Unit
  @JSName("success")
  def success_MDatePickerOptions(result: aliDashAppLib.Anon_Date): scala.Unit
}

object DatePickerOptions {
  @scala.inline
  def apply(
    currentDate: java.lang.String,
    endDate: java.lang.String,
    fail: js.Function1[aliDashAppLib.aliDashAppLibNumbers.`11`, scala.Unit],
    format: aliDashAppLib.aliDashAppLibStrings.`yyyy-MM-dd` | aliDashAppLib.aliDashAppLibStrings.`HH:mm` | (aliDashAppLib.aliDashAppLibStrings.`yyyy-MM-dd HH:mm`) | aliDashAppLib.aliDashAppLibStrings.`yyyy-MM` | aliDashAppLib.aliDashAppLibStrings.yyyy,
    startDate: java.lang.String,
    success: js.Function1[aliDashAppLib.Anon_Date, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate, endDate = endDate, fail = fail, format = format.asInstanceOf[js.Any], startDate = startDate, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[DatePickerOptions]
  }
}

