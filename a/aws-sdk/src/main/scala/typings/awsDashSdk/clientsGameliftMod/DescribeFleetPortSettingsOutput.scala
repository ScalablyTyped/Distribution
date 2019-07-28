package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetPortSettingsOutput extends js.Object {
  /**
    * Object that contains port settings for the requested fleet ID.
    */
  var InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
}

object DescribeFleetPortSettingsOutput {
  @scala.inline
  def apply(InboundPermissions: IpPermissionsList = null): DescribeFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (InboundPermissions != null) __obj.updateDynamic("InboundPermissions")(InboundPermissions)
    __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
  }
}

