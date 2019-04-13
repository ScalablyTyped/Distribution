package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureDetails extends js.Object {
  /**
    * The external ID of the run of the action that failed.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
  /**
    * The message about the failure.
    */
  var message: Message
  /**
    * The type of the failure.
    */
  var `type`: FailureType
}

object FailureDetails {
  @scala.inline
  def apply(message: Message, `type`: FailureType, externalExecutionId: ExecutionId = null): FailureDetails = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (externalExecutionId != null) __obj.updateDynamic("externalExecutionId")(externalExecutionId)
    __obj.asInstanceOf[FailureDetails]
  }
}

