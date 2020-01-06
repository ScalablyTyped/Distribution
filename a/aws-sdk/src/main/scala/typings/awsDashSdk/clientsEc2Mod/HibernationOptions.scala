package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HibernationOptions extends js.Object {
  /**
    * If this parameter is set to true, your instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.native
}

object HibernationOptions {
  @scala.inline
  def apply(Configured: js.UndefOr[scala.Boolean] = js.undefined): HibernationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[HibernationOptions]
  }
}

