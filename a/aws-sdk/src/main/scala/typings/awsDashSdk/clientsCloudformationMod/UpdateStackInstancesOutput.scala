package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackInstancesOutput extends js.Object {
  /**
    * The unique identifier for this stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
}

object UpdateStackInstancesOutput {
  @scala.inline
  def apply(OperationId: ClientRequestToken = null): UpdateStackInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    __obj.asInstanceOf[UpdateStackInstancesOutput]
  }
}

