package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackSetOutput extends js.Object {
  /**
    * The unique ID for this stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}

object UpdateStackSetOutput {
  @scala.inline
  def apply(OperationId: ClientRequestToken = null): UpdateStackSetOutput = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    __obj.asInstanceOf[UpdateStackSetOutput]
  }
}

