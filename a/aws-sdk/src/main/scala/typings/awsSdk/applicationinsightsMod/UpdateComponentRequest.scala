package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[typings.awsSdk.applicationinsightsMod.NewComponentName] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object UpdateComponentRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
  @scala.inline
  implicit class UpdateComponentRequestOps[Self <: UpdateComponentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentName(value: ComponentName): Self = this.set("ComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = this.set("ResourceGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewComponentName(value: NewComponentName): Self = this.set("NewComponentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewComponentName: Self = this.set("NewComponentName", js.undefined)
    @scala.inline
    def setResourceListVarargs(value: ResourceARN*): Self = this.set("ResourceList", js.Array(value :_*))
    @scala.inline
    def setResourceList(value: ResourceList): Self = this.set("ResourceList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceList: Self = this.set("ResourceList", js.undefined)
  }
  
}

