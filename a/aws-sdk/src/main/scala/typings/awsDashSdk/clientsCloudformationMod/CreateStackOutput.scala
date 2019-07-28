package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackOutput extends js.Object {
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
}

object CreateStackOutput {
  @scala.inline
  def apply(StackId: StackId = null): CreateStackOutput = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CreateStackOutput]
  }
}

