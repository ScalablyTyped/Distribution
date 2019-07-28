package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComponentConfigurationRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
}

object DescribeComponentConfigurationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): DescribeComponentConfigurationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName)
  
    __obj.asInstanceOf[DescribeComponentConfigurationRequest]
  }
}

