package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLocation extends js.Object {
  /**
    * The Availability Zone. Follows the format us-east-2a (case-sensitive).
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * The AWS Region name.
    */
  var regionName: js.UndefOr[RegionName] = js.native
}

object ResourceLocation {
  @scala.inline
  def apply(availabilityZone: String = null, regionName: RegionName = null): ResourceLocation = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (regionName != null) __obj.updateDynamic("regionName")(regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLocation]
  }
}

