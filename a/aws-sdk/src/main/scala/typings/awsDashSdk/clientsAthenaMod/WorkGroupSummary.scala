package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkGroupSummary extends js.Object {
  /**
    * The workgroup creation date and time.
    */
  var CreationTime: js.UndefOr[_Date] = js.native
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  /**
    * The name of the workgroup.
    */
  var Name: js.UndefOr[WorkGroupName] = js.native
  /**
    * The state of the workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
}

object WorkGroupSummary {
  @scala.inline
  def apply(
    CreationTime: _Date = null,
    Description: WorkGroupDescriptionString = null,
    Name: WorkGroupName = null,
    State: WorkGroupState = null
  ): WorkGroupSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkGroupSummary]
  }
}

