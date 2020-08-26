package typings.aliApp.my

import typings.aliApp.anon.NetworkAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 网络状态 https://docs.alipay.com/mini/api/network-status
@js.native
trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetNetworkTypeOptions: js.UndefOr[js.Function1[/* res */ NetworkAvailable, Unit]] = js.native
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
  @scala.inline
  implicit class GetNetworkTypeOptionsOps[Self <: GetNetworkTypeOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ NetworkAvailable => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

