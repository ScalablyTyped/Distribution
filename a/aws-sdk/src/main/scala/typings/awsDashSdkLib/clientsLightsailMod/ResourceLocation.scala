package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLocation extends js.Object {
  /**
    * The Availability Zone. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The AWS Region name.
    */
  var regionName: js.UndefOr[RegionName] = js.undefined
}

object ResourceLocation {
  @scala.inline
  def apply(availabilityZone: java.lang.String = null, regionName: RegionName = null): ResourceLocation = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (regionName != null) __obj.updateDynamic("regionName")(regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLocation]
  }
}

