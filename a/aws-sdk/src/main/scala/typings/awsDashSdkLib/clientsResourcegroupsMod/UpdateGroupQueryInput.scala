package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupQueryInput extends js.Object {
  /**
    * The name of the resource group for which you want to edit the query.
    */
  var GroupName: awsDashSdkLib.clientsResourcegroupsMod.GroupName
  /**
    * The resource query that determines which AWS resources are members of the resource group.
    */
  var ResourceQuery: awsDashSdkLib.clientsResourcegroupsMod.ResourceQuery
}

object UpdateGroupQueryInput {
  @scala.inline
  def apply(GroupName: GroupName, ResourceQuery: ResourceQuery): UpdateGroupQueryInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, ResourceQuery = ResourceQuery)
  
    __obj.asInstanceOf[UpdateGroupQueryInput]
  }
}

