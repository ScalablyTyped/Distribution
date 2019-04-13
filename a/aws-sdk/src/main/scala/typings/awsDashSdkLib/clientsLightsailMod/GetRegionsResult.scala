package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.undefined
}

object GetRegionsResult {
  @scala.inline
  def apply(regions: RegionList = null): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[GetRegionsResult]
  }
}

