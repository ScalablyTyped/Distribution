package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegionsResult extends js.Object {
  /**
    * Information about the Regions.
    */
  var Regions: js.UndefOr[RegionList] = js.native
}

object DescribeRegionsResult {
  @scala.inline
  def apply(Regions: RegionList = null): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    if (Regions != null) __obj.updateDynamic("Regions")(Regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegionsResult]
  }
}

