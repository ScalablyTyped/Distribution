package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`10`
import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.anon.Avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double
  /**
    * 10    没有权限
    * 11    用户取消操作(或设备未授权使用通讯录)
    */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: Avatar): Unit
}

object ChooseAlipayContactOptions {
  @scala.inline
  def apply(
    count: Double,
    success: Avatar => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* error */ `10` | `11` => Unit = null
  ): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
}

