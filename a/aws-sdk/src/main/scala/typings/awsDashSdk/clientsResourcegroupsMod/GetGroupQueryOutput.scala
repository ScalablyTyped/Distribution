package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupQueryOutput extends js.Object {
  /**
    * The resource query associated with the specified group.
    */
  var GroupQuery: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.GroupQuery] = js.undefined
}

object GetGroupQueryOutput {
  @scala.inline
  def apply(GroupQuery: GroupQuery = null): GetGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupQuery != null) __obj.updateDynamic("GroupQuery")(GroupQuery)
    __obj.asInstanceOf[GetGroupQueryOutput]
  }
}

