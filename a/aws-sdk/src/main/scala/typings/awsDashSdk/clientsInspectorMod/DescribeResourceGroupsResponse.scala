package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourceGroupsResponse extends js.Object {
  /**
    * Resource group details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
  /**
    * Information about a resource group.
    */
  var resourceGroups: ResourceGroupList
}

object DescribeResourceGroupsResponse {
  @scala.inline
  def apply(failedItems: FailedItems, resourceGroups: ResourceGroupList): DescribeResourceGroupsResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems, resourceGroups = resourceGroups)
  
    __obj.asInstanceOf[DescribeResourceGroupsResponse]
  }
}

