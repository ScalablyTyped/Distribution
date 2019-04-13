package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeStatusDetails extends js.Object {
  /**
    * The name of the volume status.
    */
  var Name: js.UndefOr[VolumeStatusName] = js.undefined
  /**
    * The intended status of the volume status.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object VolumeStatusDetails {
  @scala.inline
  def apply(Name: VolumeStatusName = null, Status: String = null): VolumeStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[VolumeStatusDetails]
  }
}

