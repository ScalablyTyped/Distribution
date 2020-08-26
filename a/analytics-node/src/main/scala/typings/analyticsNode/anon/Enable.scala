package typings.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.native
  var flushAt: js.UndefOr[Double] = js.native
  var flushInterval: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double | String] = js.native
}

object Enable {
  @scala.inline
  def apply(): Enable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enable]
  }
  @scala.inline
  implicit class EnableOps[Self <: Enable] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setFlushAt(value: Double): Self = this.set("flushAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushAt: Self = this.set("flushAt", js.undefined)
    @scala.inline
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setTimeout(value: Double | String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

