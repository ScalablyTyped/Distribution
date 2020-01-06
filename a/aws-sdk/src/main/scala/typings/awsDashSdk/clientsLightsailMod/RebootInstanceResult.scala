package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operations.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object RebootInstanceResult {
  @scala.inline
  def apply(operations: OperationList = null): RebootInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceResult]
  }
}

