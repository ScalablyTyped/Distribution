package typings.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonHttpOption extends js.Object {
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  var freeSocketTimeout: js.UndefOr[Double] = js.native
  var keepAlive: js.UndefOr[Boolean] = js.native
  var socketActiveTTL: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object CommonHttpOption {
  @scala.inline
  def apply(): CommonHttpOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonHttpOption]
  }
  @scala.inline
  implicit class CommonHttpOptionOps[Self <: CommonHttpOption] (val x: Self) extends AnyVal {
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
    def setFreeSocketKeepAliveTimeout(value: Double): Self = this.set("freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeSocketKeepAliveTimeout: Self = this.set("freeSocketKeepAliveTimeout", js.undefined)
    @scala.inline
    def setFreeSocketTimeout(value: Double): Self = this.set("freeSocketTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeSocketTimeout: Self = this.set("freeSocketTimeout", js.undefined)
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    @scala.inline
    def setSocketActiveTTL(value: Double): Self = this.set("socketActiveTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketActiveTTL: Self = this.set("socketActiveTTL", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

