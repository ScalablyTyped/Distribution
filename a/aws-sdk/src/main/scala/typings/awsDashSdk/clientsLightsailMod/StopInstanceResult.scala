package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object StopInstanceResult {
  @scala.inline
  def apply(operations: OperationList = null): StopInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[StopInstanceResult]
  }
}

