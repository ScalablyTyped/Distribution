package typings
package aliDashAppLib.myNs

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
  var fail_ChoosePhoneContactOptions: js.UndefOr[
    js.Function1[
      /* error */ aliDashAppLib.aliDashAppLibNumbers.`10` | aliDashAppLib.aliDashAppLibNumbers.`11`, 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("success")
  def success_MChoosePhoneContactOptions(result: aliDashAppLib.Anon_Mobile): scala.Unit
}

object ChoosePhoneContactOptions {
  @scala.inline
  def apply(
    success: aliDashAppLib.Anon_Mobile => scala.Unit,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: /* error */ aliDashAppLib.aliDashAppLibNumbers.`10` | aliDashAppLib.aliDashAppLibNumbers.`11` => scala.Unit = null
  ): ChoosePhoneContactOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChoosePhoneContactOptions]
  }
}

