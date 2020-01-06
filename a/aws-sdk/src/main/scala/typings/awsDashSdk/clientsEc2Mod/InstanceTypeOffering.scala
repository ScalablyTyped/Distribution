package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeOffering extends js.Object {
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceType] = js.native
  /**
    * The identifier for the location. This depends on the location type. For example, if the location type is region, the location is the Region code (for example, us-east-2.)
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Location] = js.native
  /**
    * The location type.
    */
  var LocationType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LocationType] = js.native
}

object InstanceTypeOffering {
  @scala.inline
  def apply(InstanceType: InstanceType = null, Location: Location = null, LocationType: LocationType = null): InstanceTypeOffering = {
    val __obj = js.Dynamic.literal()
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (LocationType != null) __obj.updateDynamic("LocationType")(LocationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeOffering]
  }
}

