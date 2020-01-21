package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkGroupInput extends js.Object {
  /**
    * The workgroup configuration that will be updated for the given workgroup.
    */
  var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.native
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  /**
    * The workgroup state that will be updated for the given workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
  /**
    * The specified workgroup that will be updated.
    */
  var WorkGroup: WorkGroupName = js.native
}

object UpdateWorkGroupInput {
  @scala.inline
  def apply(
    WorkGroup: WorkGroupName,
    ConfigurationUpdates: WorkGroupConfigurationUpdates = null,
    Description: WorkGroupDescriptionString = null,
    State: WorkGroupState = null
  ): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    if (ConfigurationUpdates != null) __obj.updateDynamic("ConfigurationUpdates")(ConfigurationUpdates.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
}

