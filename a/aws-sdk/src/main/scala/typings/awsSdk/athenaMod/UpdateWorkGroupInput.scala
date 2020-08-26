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
  def apply(WorkGroup: WorkGroupName): UpdateWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkGroupInput]
  }
  @scala.inline
  implicit class UpdateWorkGroupInputOps[Self <: UpdateWorkGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationUpdates(value: WorkGroupConfigurationUpdates): Self = this.set("ConfigurationUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationUpdates: Self = this.set("ConfigurationUpdates", js.undefined)
    @scala.inline
    def setDescription(value: WorkGroupDescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setState(value: WorkGroupState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

