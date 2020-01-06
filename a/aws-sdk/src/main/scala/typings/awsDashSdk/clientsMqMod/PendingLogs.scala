package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingLogs extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[__boolean] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[__boolean] = js.native
}

object PendingLogs {
  @scala.inline
  def apply(Audit: js.UndefOr[Boolean] = js.undefined, General: js.UndefOr[Boolean] = js.undefined): PendingLogs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Audit)) __obj.updateDynamic("Audit")(Audit.asInstanceOf[js.Any])
    if (!js.isUndefined(General)) __obj.updateDynamic("General")(General.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingLogs]
  }
}

