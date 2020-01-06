package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAvailabilityZone extends js.Object {
  /**
    * The identifier of the custom AZ. Amazon RDS generates a unique identifier when a custom AZ is created.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The name of the custom AZ.
    */
  var CustomAvailabilityZoneName: js.UndefOr[String] = js.native
  /**
    * The status of the custom AZ.
    */
  var CustomAvailabilityZoneStatus: js.UndefOr[String] = js.native
  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    */
  var VpnDetails: js.UndefOr[typings.awsDashSdk.clientsRdsMod.VpnDetails] = js.native
}

object CustomAvailabilityZone {
  @scala.inline
  def apply(
    CustomAvailabilityZoneId: String = null,
    CustomAvailabilityZoneName: String = null,
    CustomAvailabilityZoneStatus: String = null,
    VpnDetails: VpnDetails = null
  ): CustomAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZoneId != null) __obj.updateDynamic("CustomAvailabilityZoneId")(CustomAvailabilityZoneId.asInstanceOf[js.Any])
    if (CustomAvailabilityZoneName != null) __obj.updateDynamic("CustomAvailabilityZoneName")(CustomAvailabilityZoneName.asInstanceOf[js.Any])
    if (CustomAvailabilityZoneStatus != null) __obj.updateDynamic("CustomAvailabilityZoneStatus")(CustomAvailabilityZoneStatus.asInstanceOf[js.Any])
    if (VpnDetails != null) __obj.updateDynamic("VpnDetails")(VpnDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAvailabilityZone]
  }
}

