package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedResourceCount extends js.Object {
  /**
    * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the region was chosen as GroupByKey.
    */
  var GroupName: StringWithCharLimit256
  /**
    * The number of resources in the group.
    */
  var ResourceCount: Long
}

object GroupedResourceCount {
  @scala.inline
  def apply(GroupName: StringWithCharLimit256, ResourceCount: Long): GroupedResourceCount = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, ResourceCount = ResourceCount)
  
    __obj.asInstanceOf[GroupedResourceCount]
  }
}

