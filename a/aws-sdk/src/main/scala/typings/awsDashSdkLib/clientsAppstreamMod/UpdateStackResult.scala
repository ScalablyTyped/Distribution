package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackResult extends js.Object {
  /**
    * Information about the stack.
    */
  var Stack: js.UndefOr[Stack] = js.undefined
}

object UpdateStackResult {
  @scala.inline
  def apply(Stack: Stack = null): UpdateStackResult = {
    val __obj = js.Dynamic.literal()
    if (Stack != null) __obj.updateDynamic("Stack")(Stack)
    __obj.asInstanceOf[UpdateStackResult]
  }
}

