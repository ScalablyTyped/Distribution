package typings.aliDashApp.my

import typings.aliDashApp.Anon_Date
import typings.aliDashApp.aliDashAppNumbers.`11`
import typings.aliDashApp.aliDashAppStrings.HHColonmm
import typings.aliDashApp.aliDashAppStrings.`yyyy-MM-dd HHColonmm`
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
  var format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy
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
    fail: `11` => Unit,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: Anon_Date => Unit,
    complete: /* res */ js.Any => Unit = null
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), format = format.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    __obj.asInstanceOf[DatePickerOptions]
  }
}

