package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRegionsResult extends js.Object {
  /**
    * Information about the regions.
    */
  var Regions: js.UndefOr[RegionList] = js.undefined
}

object DescribeRegionsResult {
  @scala.inline
  def apply(Regions: RegionList = null): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    if (Regions != null) __obj.updateDynamic("Regions")(Regions)
    __obj.asInstanceOf[DescribeRegionsResult]
  }
}

