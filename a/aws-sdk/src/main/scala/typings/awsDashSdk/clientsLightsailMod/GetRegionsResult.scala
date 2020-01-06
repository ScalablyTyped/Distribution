package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.native
}

object GetRegionsResult {
  @scala.inline
  def apply(regions: RegionList = null): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionsResult]
  }
}

