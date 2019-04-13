package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkGroupInput extends js.Object {
  /**
    * The workgroup configuration that will be updated for the given workgroup.
    */
  var ConfigurationUpdates: js.UndefOr[WorkGroupConfigurationUpdates] = js.undefined
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  /**
    * The workgroup state that will be updated for the given workgroup.
    */
  var State: js.UndefOr[WorkGroupState] = js.undefined
  /**
    * The specified workgroup that will be updated.
    */
  var WorkGroup: WorkGroupName
}

object UpdateWorkGroupInput {
  @scala.inline
  def apply(
    WorkGroup: WorkGroupName,
    ConfigurationUpdates: WorkGroupConfigurationUpdates = null,
    Description: WorkGroupDescriptionString = null,
    State: WorkGroupState = null
  ): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup)
    if (ConfigurationUpdates != null) __obj.updateDynamic("ConfigurationUpdates")(ConfigurationUpdates)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
}

