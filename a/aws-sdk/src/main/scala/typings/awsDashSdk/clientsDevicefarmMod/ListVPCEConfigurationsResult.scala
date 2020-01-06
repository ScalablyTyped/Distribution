package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVPCEConfigurationsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of VPCEConfiguration objects that contain information about your VPC endpoint configuration.
    */
  var vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.native
}

object ListVPCEConfigurationsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, vpceConfigurations: VPCEConfigurations = null): ListVPCEConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (vpceConfigurations != null) __obj.updateDynamic("vpceConfigurations")(vpceConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVPCEConfigurationsResult]
  }
}

