package typings.aliApp.my

import typings.aliApp.AnonAvatarNickName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 客户端获取会员信息 https://docs.alipay.com/mini/api/userinfo
trait GetAuthUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetAuthUserInfoOptions: js.UndefOr[js.Function1[/* res */ AnonAvatarNickName, Unit]] = js.undefined
}

object GetAuthUserInfoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ AnonAvatarNickName => Unit = null
  ): GetAuthUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetAuthUserInfoOptions]
  }
}

