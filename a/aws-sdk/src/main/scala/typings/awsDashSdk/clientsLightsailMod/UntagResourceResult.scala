package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceResult extends js.Object {
  /**
    * A list of objects describing the API operation.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object UntagResourceResult {
  @scala.inline
  def apply(operations: OperationList = null): UntagResourceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[UntagResourceResult]
  }
}

