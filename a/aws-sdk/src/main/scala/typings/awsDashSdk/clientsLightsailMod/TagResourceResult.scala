package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceResult extends js.Object {
  /**
    * A list of objects describing the API operation.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object TagResourceResult {
  @scala.inline
  def apply(operations: OperationList = null): TagResourceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[TagResourceResult]
  }
}

