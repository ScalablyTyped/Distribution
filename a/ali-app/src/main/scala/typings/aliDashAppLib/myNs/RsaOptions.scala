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

