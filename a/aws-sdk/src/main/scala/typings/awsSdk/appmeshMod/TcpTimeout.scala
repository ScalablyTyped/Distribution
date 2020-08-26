package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpTimeout extends js.Object {
  var idle: js.UndefOr[Duration] = js.native
}

object TcpTimeout {
  @scala.inline
  def apply(): TcpTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpTimeout]
  }
  @scala.inline
  implicit class TcpTimeoutOps[Self <: TcpTimeout] (val x: Self) extends AnyVal {
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
  }
  
}

