package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVPCEConfigurationsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of VPCEConfiguration objects containing information about your VPC endpoint configuration.
    */
  var vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.undefined
}

object ListVPCEConfigurationsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, vpceConfigurations: VPCEConfigurations = null): ListVPCEConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (vpceConfigurations != null) __obj.updateDynamic("vpceConfigurations")(vpceConfigurations)
    __obj.asInstanceOf[ListVPCEConfigurationsResult]
  }
}

