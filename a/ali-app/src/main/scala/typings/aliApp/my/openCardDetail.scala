package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.openCardDetail")
@js.native
object openCardDetail extends js.Object {
  /**
  	 * 打开当前用户的某张卡的详情页
  	 * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
  	 *
  	 * passId获取方式：
  	 * 1）通过alipass创建的卡
  	 * 调用alipay.pass.instance.add(支付宝pass新建卡券实例接口)接口，在出参“result”中可获取
  	 * 2）通过会员卡创建的卡
  	 * 调用alipay.marketing.card.query(会员卡查询)接口，在schema_url中可获取，具体参数为“p=xxx”，xxx即为passId。
  	 */
  def apply(options: OpenCardDetailOptions): Unit = js.native
}

