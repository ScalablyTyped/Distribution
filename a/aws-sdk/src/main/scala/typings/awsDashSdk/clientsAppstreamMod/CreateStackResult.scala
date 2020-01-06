package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackResult extends js.Object {
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Stack] = js.native
}

object CreateStackResult {
  @scala.inline
  def apply(Stack: Stack = null): CreateStackResult = {
    val __obj = js.Dynamic.literal()
    if (Stack != null) __obj.updateDynamic("Stack")(Stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackResult]
  }
}

