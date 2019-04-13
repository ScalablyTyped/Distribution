package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRegionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    endpoint - The endpoint of the region (for example, ec2.us-east-1.amazonaws.com).    region-name - The name of the region (for example, us-east-1).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The names of one or more regions.
    */
  var RegionNames: js.UndefOr[RegionNameStringList] = js.undefined
}

object DescribeRegionsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    RegionNames: RegionNameStringList = null
  ): DescribeRegionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (RegionNames != null) __obj.updateDynamic("RegionNames")(RegionNames)
    __obj.asInstanceOf[DescribeRegionsRequest]
  }
}

