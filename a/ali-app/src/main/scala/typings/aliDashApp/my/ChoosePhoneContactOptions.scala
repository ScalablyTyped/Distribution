package typings.aliDashApp.my

import typings.aliDashApp.Anon_Mobile
import typings.aliDashApp.aliDashAppNumbers.`10`
import typings.aliDashApp.aliDashAppNumbers.`11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 联系人 https://docs.alipay.com/mini/api/ui-contact
trait ChoosePhoneContactOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 10	没有权限
  		 * 11	用户取消操作(或设备未授权使用通讯录)
  		 */
  @JSName("fail")
  var fail_ChoosePhoneContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: Anon_Mobile): Unit
}

object ChoosePhoneContactOptions {
  @scala.inline
  def apply(
    success: Anon_Mobile => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: /* error */ `10` | `11` => Unit = null
  ): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
}

