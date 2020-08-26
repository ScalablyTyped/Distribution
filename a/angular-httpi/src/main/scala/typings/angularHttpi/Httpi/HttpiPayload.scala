package typings.angularHttpi.Httpi

import typings.angular.mod.IRequestShortcutConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpiPayload extends IRequestShortcutConfig {
  @JSName("data")
  var data_HttpiPayload: js.UndefOr[js.Object] = js.native
  var keepTrailingSlash: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[String] = js.native
  @JSName("params")
  var params_HttpiPayload: js.UndefOr[js.Object] = js.native
  var url: js.UndefOr[String] = js.native
}

object HttpiPayload {
  @scala.inline
  def apply(): HttpiPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpiPayload]
  }
  @scala.inline
  implicit class HttpiPayloadOps[Self <: HttpiPayload] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setKeepTrailingSlash(value: Boolean): Self = this.set("keepTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepTrailingSlash: Self = this.set("keepTrailingSlash", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

