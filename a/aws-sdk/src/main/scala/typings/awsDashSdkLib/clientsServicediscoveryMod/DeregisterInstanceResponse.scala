package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterInstanceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. For more information, see GetOperation.
    */
  var OperationId: js.UndefOr[OperationId] = js.undefined
}

object DeregisterInstanceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): DeregisterInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    __obj.asInstanceOf[DeregisterInstanceResponse]
  }
}

