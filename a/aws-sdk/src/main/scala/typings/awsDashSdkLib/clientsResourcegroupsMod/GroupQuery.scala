package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupQuery extends js.Object {
  /**
    * The name of a resource group that is associated with a specific resource query.
    */
  var GroupName: awsDashSdkLib.clientsResourcegroupsMod.GroupName
  /**
    * The resource query which determines which AWS resources are members of the associated resource group.
    */
  var ResourceQuery: awsDashSdkLib.clientsResourcegroupsMod.ResourceQuery
}

object GroupQuery {
  @scala.inline
  def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): GroupQuery = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, ResourceQuery = ResourceQuery)
  
    __obj.asInstanceOf[GroupQuery]
  }
}

