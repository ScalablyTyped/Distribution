package typings
package amqpDashRpcLib.amqpDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var autoDeleteCallback: js.UndefOr[js.Any] = js.undefined
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(autoDeleteCallback: js.Any = null, correlationId: java.lang.String = null): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (autoDeleteCallback != null) __obj.updateDynamic("autoDeleteCallback")(autoDeleteCallback)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    __obj.asInstanceOf[CallOptions]
  }
}

