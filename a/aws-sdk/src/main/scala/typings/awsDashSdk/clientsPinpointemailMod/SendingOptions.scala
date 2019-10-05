package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendingOptions extends js.Object {
  /**
    * If true, email sending is enabled for the configuration set. If false, email sending is disabled for the configuration set.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}

object SendingOptions {
  @scala.inline
  def apply(SendingEnabled: js.UndefOr[Boolean] = js.undefined): SendingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SendingEnabled)) __obj.updateDynamic("SendingEnabled")(SendingEnabled)
    __obj.asInstanceOf[SendingOptions]
  }
}

