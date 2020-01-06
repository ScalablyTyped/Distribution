package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterInstanceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. For more information, see GetOperation.
    */
  var OperationId: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.OperationId] = js.native
}

object DeregisterInstanceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): DeregisterInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterInstanceResponse]
  }
}

