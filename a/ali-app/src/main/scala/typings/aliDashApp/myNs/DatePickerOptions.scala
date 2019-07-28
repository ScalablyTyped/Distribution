package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Date
import typings.aliDashApp.aliDashAppNumbers.`11`
import typings.aliDashApp.aliDashAppStrings.`HH:mm`
import typings.aliDashApp.aliDashAppStrings.`yyyy-MM-dd HH:mm`
import typings.aliDashApp.aliDashAppStrings.`yyyy-MM-dd`
import typings.aliDashApp.aliDashAppStrings.`yyyy-MM`
import typings.aliDashApp.aliDashAppStrings.yyyy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
trait DatePickerOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: String
  /** 最大日期时间 */
  var endDate: String
  /**
  		 * 返回的日期格式，
  		 * 1. yyyy-MM-dd（默认）
  		 * 2. HH:mm
  		 * 3. yyyy-MM-dd HH:mm
  		 * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
  		 * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
  		 */
  var format: `yyyy-MM-dd` | `HH:mm` | (`yyyy-MM-dd HH:mm`) | `yyyy-MM` | yyyy
  /** 最小日期时间 */
  var startDate: String
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_11(error: `11`): Unit
  @JSName("success")
  def success_MDatePickerOptions(result: Anon_Date): Unit
}

object DatePickerOptions {
  @scala.inline
  def apply(
    currentDate: String,
    endDate: String,
    fail_11: `11` => Unit,
    format: `yyyy-MM-dd` | `HH:mm` | (`yyyy-MM-dd HH:mm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: Anon_Date => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate, endDate = endDate, format = format.asInstanceOf[js.Any], startDate = startDate, success = js.Any.fromFunction1(success))
    __obj.updateDynamic("fail")(js.Any.fromFunction1(fail_11))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[DatePickerOptions]
  }
}

