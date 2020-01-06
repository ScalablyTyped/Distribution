package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * The external ID of the run of the action that failed.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.native
  /**
    * The message about the failure.
    */
  var message: Message = js.native
  /**
    * The type of the failure.
    */
  var `type`: FailureType = js.native
}

object FailureDetails {
  @scala.inline
  def apply(message: Message, `type`: FailureType, externalExecutionId: ExecutionId = null): FailureDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
}

