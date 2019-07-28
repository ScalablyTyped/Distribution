package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupQueryOutput extends js.Object {
  /**
    * The resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.GroupQuery] = js.undefined
}

object UpdateGroupQueryOutput {
  @scala.inline
  def apply(GroupQuery: GroupQuery = null): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupQuery != null) __obj.updateDynamic("GroupQuery")(GroupQuery)
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
}

