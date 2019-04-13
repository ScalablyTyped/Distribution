package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackSetOutput extends js.Object {
  /**
    * The ID of the stack set that you're creating.
    */
  var StackSetId: js.UndefOr[StackSetId] = js.undefined
}

object CreateStackSetOutput {
  @scala.inline
  def apply(StackSetId: StackSetId = null): CreateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId)
    __obj.asInstanceOf[CreateStackSetOutput]
  }
}

