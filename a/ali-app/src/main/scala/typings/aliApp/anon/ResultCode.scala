package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultCode extends js.Object {
  // resultCode | 描述
  // -----------|------
  // 9000 | 订单支付成功
  // 8000 | 正在处理中
  // 4000 | 订单支付失败
  // 6001 | 用户中途取消
  // 6002 | 网络连接出错
  // 6004 | 支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
  // 99 | 用户点击忘记密码导致快捷界面退出(only iOS)
  var resultCode: String = js.native
}

object ResultCode {
  @scala.inline
  def apply(resultCode: String): ResultCode = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultCode]
  }
  @scala.inline
  implicit class ResultCodeOps[Self <: ResultCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResultCode(value: String): Self = this.set("resultCode", value.asInstanceOf[js.Any])
  }
  
}

