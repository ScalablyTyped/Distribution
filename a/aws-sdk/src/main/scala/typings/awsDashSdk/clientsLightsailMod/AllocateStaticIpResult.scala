package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the static IP address you allocated.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object AllocateStaticIpResult {
  @scala.inline
  def apply(operations: OperationList = null): AllocateStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpResult]
  }
}

