package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupOutput extends js.Object {
  /**
    * A full description of the resource group.
    */
  var Group: js.UndefOr[Group] = js.undefined
}

object GetGroupOutput {
  @scala.inline
  def apply(Group: Group = null): GetGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[GetGroupOutput]
  }
}

