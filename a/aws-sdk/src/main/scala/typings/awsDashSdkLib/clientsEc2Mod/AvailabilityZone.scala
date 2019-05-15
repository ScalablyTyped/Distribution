package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * Any messages about the Availability Zone.
    */
  var Messages: js.UndefOr[AvailabilityZoneMessageList] = js.undefined
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[String] = js.undefined
  /**
    * The state of the Availability Zone.
    */
  var State: js.UndefOr[AvailabilityZoneState] = js.undefined
  /**
    * The ID of the Availability Zone.
    */
  var ZoneId: js.UndefOr[String] = js.undefined
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[String] = js.undefined
}

object AvailabilityZone {
  @scala.inline
  def apply(
    Messages: AvailabilityZoneMessageList = null,
    RegionName: String = null,
    State: AvailabilityZoneState = null,
    ZoneId: String = null,
    ZoneName: String = null
  ): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (ZoneId != null) __obj.updateDynamic("ZoneId")(ZoneId)
    if (ZoneName != null) __obj.updateDynamic("ZoneName")(ZoneName)
    __obj.asInstanceOf[AvailabilityZone]
  }
}

