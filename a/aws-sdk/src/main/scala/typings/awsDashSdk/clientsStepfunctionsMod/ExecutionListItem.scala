package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionListItem extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the execution.
    */
  var executionArn: Arn
  /**
    * The name of the execution. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)  
    */
  var name: Name
  /**
    * The date the execution started.
    */
  var startDate: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the executed state machine.
    */
  var stateMachineArn: Arn
  /**
    * The current status of the execution.
    */
  var status: ExecutionStatus
  /**
    * If the execution already ended, the date the execution stopped.
    */
  var stopDate: js.UndefOr[Timestamp] = js.undefined
}

object ExecutionListItem {
  @scala.inline
  def apply(
    executionArn: Arn,
    name: Name,
    startDate: Timestamp,
    stateMachineArn: Arn,
    status: ExecutionStatus,
    stopDate: Timestamp = null
  ): ExecutionListItem = {
    val __obj = js.Dynamic.literal(executionArn = executionArn, name = name, startDate = startDate, stateMachineArn = stateMachineArn, status = status.asInstanceOf[js.Any])
    if (stopDate != null) __obj.updateDynamic("stopDate")(stopDate)
    __obj.asInstanceOf[ExecutionListItem]
  }
}

