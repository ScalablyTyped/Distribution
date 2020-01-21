package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.startZMVerify")
@js.native
object startZMVerify extends js.Object {
  /**
  	 * 芝麻认证接口，调用此接口可以唤起芝麻认证页面并进行人脸身份验证。
  	 * 有关芝麻认证的产品和接入介绍，详见 [芝麻认证](https://docs.alipay.com/mini/introduce/zm-verify)。
  	 * 需要通过蚂蚁开发平台，调用certification.initialize接口进行[认证初始化](https://docs.alipay.com/zmxy/271/105914)。获得biz_no 后，方能通过以下接口激活芝麻认证小程序。
  	 */
  def apply(options: StartZMVerifyOptions): Unit = js.native
}

