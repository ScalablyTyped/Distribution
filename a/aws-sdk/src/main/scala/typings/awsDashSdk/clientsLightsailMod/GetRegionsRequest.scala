package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionsRequest extends js.Object {
  /**
    * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability Zones are indicated with a letter: e.g., us-east-2a.
    */
  var includeAvailabilityZones: js.UndefOr[Boolean] = js.native
  /**
    * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions request. Availability Zones are indicated with a letter (e.g., us-east-2a).
    */
  var includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.native
}

object GetRegionsRequest {
  @scala.inline
  def apply(
    includeAvailabilityZones: js.UndefOr[Boolean] = js.undefined,
    includeRelationalDatabaseAvailabilityZones: js.UndefOr[Boolean] = js.undefined
  ): GetRegionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAvailabilityZones)) __obj.updateDynamic("includeAvailabilityZones")(includeAvailabilityZones.asInstanceOf[js.Any])
    if (!js.isUndefined(includeRelationalDatabaseAvailabilityZones)) __obj.updateDynamic("includeRelationalDatabaseAvailabilityZones")(includeRelationalDatabaseAvailabilityZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRegionsRequest]
  }
}

