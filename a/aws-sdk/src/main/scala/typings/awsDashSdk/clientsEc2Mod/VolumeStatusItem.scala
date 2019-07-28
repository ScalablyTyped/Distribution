package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeStatusItem extends js.Object {
  /**
    * The details of the operation.
    */
  var Actions: js.UndefOr[VolumeStatusActionsList] = js.undefined
  /**
    * The Availability Zone of the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A list of events associated with the volume.
    */
  var Events: js.UndefOr[VolumeStatusEventsList] = js.undefined
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  /**
    * The volume status.
    */
  var VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.undefined
}

object VolumeStatusItem {
  @scala.inline
  def apply(
    Actions: VolumeStatusActionsList = null,
    AvailabilityZone: String = null,
    Events: VolumeStatusEventsList = null,
    VolumeId: String = null,
    VolumeStatus: VolumeStatusInfo = null
  ): VolumeStatusItem = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (VolumeStatus != null) __obj.updateDynamic("VolumeStatus")(VolumeStatus)
    __obj.asInstanceOf[VolumeStatusItem]
  }
}

