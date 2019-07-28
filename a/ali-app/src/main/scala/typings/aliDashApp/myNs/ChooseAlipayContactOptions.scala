package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Avatar
import typings.aliDashApp.aliDashAppNumbers.`10`
import typings.aliDashApp.aliDashAppNumbers.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: Anon_Avatar): Unit
}

object ChooseAlipayContactOptions {
  @scala.inline
  def apply(
    count: Double,
    success: Anon_Avatar => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* error */ `10` | `11` => Unit = null
  ): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
}

