package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 数据安全 https://docs.alipay.com/mini/api/data-safe
trait RsaOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 使用rsa加密还是rsa解密，encrypt加密，decrypt解密
  		 */
  var action: java.lang.String
  /**
  		 * rsa秘钥，加密使用公钥，解密使用私钥
  		 */
  var key: java.lang.String
  @JSName("success")
  var success_RsaOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Text, scala.Unit]] = js.undefined
  /**
  		 * 要处理的文本，加密为原始文本，解密为Base64编码格式文本
  		 */
  var text: java.lang.String
}

object RsaOptions {
  @scala.inline
  def apply(
    action: java.lang.String,
    key: java.lang.String,
    text: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ aliDashAppLib.Anon_Text => scala.Unit = null
  ): RsaOptions = {
    val __obj = js.Dynamic.literal(action = action, key = key, text = text)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RsaOptions]
  }
}

