package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.getAuthUserInfo")
@js.native
object getAuthUserInfo extends js.Object {
  /**
  	 * 客户端获取会员信息
  	 * 获取会员信息首先需要获取用户授权，详细会员信息获取参考[指引](https://docs.alipay.com/mini/introduce/auth)，采用 jsapi 调用的方式。
  	 */
  def apply(options: GetAuthUserInfoOptions): Unit = js.native
}

