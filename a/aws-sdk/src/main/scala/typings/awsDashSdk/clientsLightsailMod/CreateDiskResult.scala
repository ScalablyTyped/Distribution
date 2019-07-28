package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDiskResult extends js.Object {
  /**
    * An object describing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateDiskResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateDiskResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateDiskResult]
  }
}

