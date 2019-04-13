package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HibernationOptionsRequest extends js.Object {
  /**
    * If you set this parameter to true, your instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}

object HibernationOptionsRequest {
  @scala.inline
  def apply(Configured: js.UndefOr[Boolean] = js.undefined): HibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Configured)) __obj.updateDynamic("Configured")(Configured)
    __obj.asInstanceOf[HibernationOptionsRequest]
  }
}

