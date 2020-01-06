package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackSetOutput extends js.Object {
  /**
    * The ID of the stack set that you're creating.
    */
  var StackSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetId] = js.native
}

object CreateStackSetOutput {
  @scala.inline
  def apply(StackSetId: StackSetId = null): CreateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackSetOutput]
  }
}

