package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableAddOnResult extends js.Object {
  /**
    * An array of objects that describe the result of your request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object EnableAddOnResult {
  @scala.inline
  def apply(operations: OperationList = null): EnableAddOnResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[EnableAddOnResult]
  }
}

