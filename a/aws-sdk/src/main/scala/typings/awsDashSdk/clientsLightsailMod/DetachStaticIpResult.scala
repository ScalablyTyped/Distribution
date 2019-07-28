package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your detach static IP request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DetachStaticIpResult {
  @scala.inline
  def apply(operations: OperationList = null): DetachStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DetachStaticIpResult]
  }
}

