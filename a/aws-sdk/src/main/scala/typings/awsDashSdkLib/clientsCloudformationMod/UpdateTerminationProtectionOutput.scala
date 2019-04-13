package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTerminationProtectionOutput extends js.Object {
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[StackId] = js.undefined
}

object UpdateTerminationProtectionOutput {
  @scala.inline
  def apply(StackId: StackId = null): UpdateTerminationProtectionOutput = {
    val __obj = js.Dynamic.literal()
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[UpdateTerminationProtectionOutput]
  }
}

