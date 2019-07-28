package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachDiskResult extends js.Object {
  /**
    * An object describing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object AttachDiskResult {
  @scala.inline
  def apply(operations: OperationList = null): AttachDiskResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[AttachDiskResult]
  }
}

