package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeType extends js.Object {
  /**
    * The compute type.
    */
  var Name: js.UndefOr[Compute] = js.undefined
}

object ComputeType {
  @scala.inline
  def apply(Name: Compute = null): ComputeType = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeType]
  }
}

