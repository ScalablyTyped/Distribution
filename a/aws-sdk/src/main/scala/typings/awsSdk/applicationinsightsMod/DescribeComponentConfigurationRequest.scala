package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentConfigurationRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}

object DescribeComponentConfigurationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): DescribeComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentConfigurationRequest]
  }
  @scala.inline
  implicit class DescribeComponentConfigurationRequestOps[Self <: DescribeComponentConfigurationRequest] (val x: Self) extends AnyVal {
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
  }
  
}

