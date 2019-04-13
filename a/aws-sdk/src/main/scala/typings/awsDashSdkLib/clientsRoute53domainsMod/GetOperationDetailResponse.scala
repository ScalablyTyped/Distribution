package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationDetailResponse extends js.Object {
  /**
    * The name of a domain.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
  /**
    * Detailed information on the status including possible errors.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The identifier for the operation.
    */
  var OperationId: js.UndefOr[OperationId] = js.undefined
  /**
    * The current status of the requested operation in the system.
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of operation that was requested.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
}

object GetOperationDetailResponse {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    Message: ErrorMessage = null,
    OperationId: OperationId = null,
    Status: OperationStatus = null,
    SubmittedDate: Timestamp = null,
    Type: OperationType = null
  ): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmittedDate != null) __obj.updateDynamic("SubmittedDate")(SubmittedDate)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
}

