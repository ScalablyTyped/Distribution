package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStatusDetails extends js.Object {
  /**
    * The time when a status check failed. For an instance that was launched and impaired, this is the time when the instance was launched.
    */
  var ImpairedSince: js.UndefOr[DateTime] = js.undefined
  /**
    * The type of instance status.
    */
  var Name: js.UndefOr[StatusName] = js.undefined
  /**
    * The status.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
}

object InstanceStatusDetails {
  @scala.inline
  def apply(ImpairedSince: DateTime = null, Name: StatusName = null, Status: StatusType = null): InstanceStatusDetails = {
    val __obj = js.Dynamic.literal()
    if (ImpairedSince != null) __obj.updateDynamic("ImpairedSince")(ImpairedSince)
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatusDetails]
  }
}

