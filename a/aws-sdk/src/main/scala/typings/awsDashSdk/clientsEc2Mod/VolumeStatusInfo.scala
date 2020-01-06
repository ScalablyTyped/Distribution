package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeStatusInfo extends js.Object {
  /**
    * The details of the volume status.
    */
  var Details: js.UndefOr[VolumeStatusDetailsList] = js.native
  /**
    * The status of the volume.
    */
  var Status: js.UndefOr[VolumeStatusInfoStatus] = js.native
}

object VolumeStatusInfo {
  @scala.inline
  def apply(Details: VolumeStatusDetailsList = null, Status: VolumeStatusInfoStatus = null): VolumeStatusInfo = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeStatusInfo]
  }
}

