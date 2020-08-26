package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logging extends js.Object {
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[AccessLog] = js.native
}

object Logging {
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  @scala.inline
  implicit class LoggingOps[Self <: Logging] (val x: Self) extends AnyVal {
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
    def setAccessLog(value: AccessLog): Self = this.set("accessLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLog: Self = this.set("accessLog", js.undefined)
  }
  
}

