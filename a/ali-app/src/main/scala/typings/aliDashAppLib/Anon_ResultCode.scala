package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResultCode extends js.Object {
  // resultCode | 描述
  // -----------|------
  // 9000 | 订单支付成功
  // 8000 | 正在处理中
  // 4000 | 订单支付失败
  // 6001 | 用户中途取消
  // 6002 | 网络连接出错
  // 6004 | 支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
  // 99 | 用户点击忘记密码导致快捷界面退出(only iOS)
  var resultCode: java.lang.String
}

