package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTimeout extends js.Object {
  var idle: js.UndefOr[Duration] = js.native
  var perRequest: js.UndefOr[Duration] = js.native
}

object HttpTimeout {
  @scala.inline
  def apply(): HttpTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpTimeout]
  }
  @scala.inline
  implicit class HttpTimeoutOps[Self <: HttpTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdle(value: Duration): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    @scala.inline
    def setPerRequest(value: Duration): Self = this.set("perRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerRequest: Self = this.set("perRequest", js.undefined)
  }
  
}

