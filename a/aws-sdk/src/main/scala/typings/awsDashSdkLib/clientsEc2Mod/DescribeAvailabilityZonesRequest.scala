package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAvailabilityZonesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    message - Information about the Availability Zone.    region-name - The name of the region for the Availability Zone (for example, us-east-1).    state - The state of the Availability Zone (available | information | impaired | unavailable).    zone-id - The ID of the Availability Zone (for example, use1-az1).    zone-name - The name of the Availability Zone (for example, us-east-1a).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The IDs of one or more Availability Zones.
    */
  var ZoneIds: js.UndefOr[ZoneIdStringList] = js.undefined
  /**
    * The names of one or more Availability Zones.
    */
  var ZoneNames: js.UndefOr[ZoneNameStringList] = js.undefined
}

object DescribeAvailabilityZonesRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    ZoneIds: ZoneIdStringList = null,
    ZoneNames: ZoneNameStringList = null
  ): DescribeAvailabilityZonesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (ZoneIds != null) __obj.updateDynamic("ZoneIds")(ZoneIds)
    if (ZoneNames != null) __obj.updateDynamic("ZoneNames")(ZoneNames)
    __obj.asInstanceOf[DescribeAvailabilityZonesRequest]
  }
}

