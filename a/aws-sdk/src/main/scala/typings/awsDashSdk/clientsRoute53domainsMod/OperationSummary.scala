package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationSummary extends js.Object {
  /**
    * Identifier returned to track the requested action.
    */
  var OperationId: typings.awsDashSdk.clientsRoute53domainsMod.OperationId
  /**
    * The current status of the requested operation in the system.
    */
  var Status: OperationStatus
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: Timestamp
  /**
    * Type of the action requested.
    */
  var Type: OperationType
}

object OperationSummary {
  @scala.inline
  def apply(OperationId: OperationId, Status: OperationStatus, SubmittedDate: Timestamp, Type: OperationType): OperationSummary = {
    val __obj = js.Dynamic.literal(OperationId = OperationId, Status = Status.asInstanceOf[js.Any], SubmittedDate = SubmittedDate, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OperationSummary]
  }
}

