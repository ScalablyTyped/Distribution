package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupRequest extends js.Object {
  /**
    * The filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
  /**
    * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
    */
  var GroupName: awsDashSdkLib.clientsXrayMod.GroupName
}

object CreateGroupRequest {
  @scala.inline
  def apply(GroupName: GroupName, FilterExpression: FilterExpression = null): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression)
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

