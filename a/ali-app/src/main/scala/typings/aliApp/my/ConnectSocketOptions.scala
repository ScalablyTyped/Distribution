package typings.aliApp.my

import typings.aliApp.aliAppStrings.GET
import typings.aliApp.aliAppStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.native
  /** 设置请求的头部 */
  var header: js.UndefOr[RequestHeader] = js.native
  var method: js.UndefOr[GET | POST] = js.native
  /** 目标服务器url */
  var url: String = js.native
}

object ConnectSocketOptions {
  @scala.inline
  def apply(url: String): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketOptions]
  }
  @scala.inline
  implicit class ConnectSocketOptionsOps[Self <: ConnectSocketOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

