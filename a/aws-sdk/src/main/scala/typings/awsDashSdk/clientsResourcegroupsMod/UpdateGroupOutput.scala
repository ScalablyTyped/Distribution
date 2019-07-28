package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupOutput extends js.Object {
  /**
    * The full description of the resource group after it has been updated.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Group] = js.undefined
}

object UpdateGroupOutput {
  @scala.inline
  def apply(Group: Group = null): UpdateGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[UpdateGroupOutput]
  }
}

