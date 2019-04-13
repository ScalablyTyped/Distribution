package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupRequest extends js.Object {
  /**
    * The updated filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
  /**
    * The ARN that was generated upon creation.
    */
  var GroupARN: js.UndefOr[GroupARN] = js.undefined
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[GroupName] = js.undefined
}

object UpdateGroupRequest {
  @scala.inline
  def apply(FilterExpression: FilterExpression = null, GroupARN: GroupARN = null, GroupName: GroupName = null): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression)
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

