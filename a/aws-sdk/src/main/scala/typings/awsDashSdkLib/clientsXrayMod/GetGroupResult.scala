package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResult extends js.Object {
  /**
    * The group that was requested. Contains the name of the group, the ARN of the group, and the filter expression that assigned to the group.
    */
  var Group: js.UndefOr[Group] = js.undefined
}

object GetGroupResult {
  @scala.inline
  def apply(Group: Group = null): GetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[GetGroupResult]
  }
}

