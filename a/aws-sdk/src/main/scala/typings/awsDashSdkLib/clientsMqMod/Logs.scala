package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logs extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[__boolean] = js.undefined
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[__boolean] = js.undefined
}

object Logs {
  @scala.inline
  def apply(Audit: js.UndefOr[__boolean] = js.undefined, General: js.UndefOr[__boolean] = js.undefined): Logs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Audit)) __obj.updateDynamic("Audit")(Audit)
    if (!js.isUndefined(General)) __obj.updateDynamic("General")(General)
    __obj.asInstanceOf[Logs]
  }
}

