package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceExecutionSummary extends js.Object {
  /**
    * An ID created by the system when PutComplianceItems was called. For example, CommandID is a valid execution ID. You can use this ID in subsequent calls.
    */
  var ExecutionId: js.UndefOr[ComplianceExecutionId] = js.undefined
  /**
    * The time the execution ran as a datetime object that is saved in the following format: yyyy-MM-dd'T'HH:mm:ss'Z'.
    */
  var ExecutionTime: DateTime
  /**
    * The type of execution. For example, Command is a valid execution type.
    */
  var ExecutionType: js.UndefOr[ComplianceExecutionType] = js.undefined
}

object ComplianceExecutionSummary {
  @scala.inline
  def apply(
    ExecutionTime: DateTime,
    ExecutionId: ComplianceExecutionId = null,
    ExecutionType: ComplianceExecutionType = null
  ): ComplianceExecutionSummary = {
    val __obj = js.Dynamic.literal(ExecutionTime = ExecutionTime)
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId)
    if (ExecutionType != null) __obj.updateDynamic("ExecutionType")(ExecutionType)
    __obj.asInstanceOf[ComplianceExecutionSummary]
  }
}

