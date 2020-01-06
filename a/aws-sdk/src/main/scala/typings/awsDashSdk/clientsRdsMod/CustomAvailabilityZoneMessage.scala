package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAvailabilityZoneMessage extends js.Object {
  /**
    * The list of CustomAvailabilityZone objects for the AWS account.
    */
  var CustomAvailabilityZones: js.UndefOr[CustomAvailabilityZoneList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeCustomAvailabilityZones request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CustomAvailabilityZoneMessage {
  @scala.inline
  def apply(CustomAvailabilityZones: CustomAvailabilityZoneList = null, Marker: String = null): CustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZones != null) __obj.updateDynamic("CustomAvailabilityZones")(CustomAvailabilityZones.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAvailabilityZoneMessage]
  }
}

