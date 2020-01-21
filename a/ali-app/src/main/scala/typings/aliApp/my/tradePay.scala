package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.tradePay")
@js.native
object tradePay extends js.Object {
  /**
  	 * 发起支付。
  	 * 详细接入支付方式参考[指引](https://docs.alipay.com/mini/introduce/pay)。
  	 * @param options
  	 */
  def apply(options: TradePayOptions): Unit = js.native
}

