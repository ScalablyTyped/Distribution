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
  def apply(accessLog: AccessLog = null): Logging = {
    val __obj = js.Dynamic.literal()
    if (accessLog != null) __obj.updateDynamic("accessLog")(accessLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logging]
  }
}

