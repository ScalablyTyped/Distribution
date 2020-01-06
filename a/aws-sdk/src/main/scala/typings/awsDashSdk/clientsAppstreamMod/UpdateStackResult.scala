package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStackResult extends js.Object {
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Stack] = js.native
}

object UpdateStackResult {
  @scala.inline
  def apply(Stack: Stack = null): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    if (Stack != null) __obj.updateDynamic("Stack")(Stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStackResult]
  }
}

