package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupOutput extends js.Object {
  /**
    * A full description of the deleted resource group.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Group] = js.undefined
}

object DeleteGroupOutput {
  @scala.inline
  def apply(Group: Group = null): DeleteGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[DeleteGroupOutput]
  }
}

