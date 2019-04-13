package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkGroupSummary extends js.Object {
  /**
    * The workgroup creation date and time.
    */
  var CreationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  /**
    * The name of the workgroup.
    */
  var Name: js.UndefOr[WorkGroupName] = js.undefined
  /**
    * The state of the workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.undefined
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
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkGroupSummary]
  }
}

