package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateHibernationOptionsRequest extends js.Object {
  /**
    * If you set this parameter to true, the instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}

object LaunchTemplateHibernationOptionsRequest {
  @scala.inline
  def apply(Configured: js.UndefOr[scala.Boolean] = js.undefined): LaunchTemplateHibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured)
    __obj.asInstanceOf[LaunchTemplateHibernationOptionsRequest]
  }
}

