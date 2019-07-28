package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get operation request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object GetOperationResult {
  @scala.inline
  def apply(operation: Operation = null): GetOperationResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[GetOperationResult]
  }
}

