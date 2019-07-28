package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordsResultEntry extends js.Object {
  /**
    * The error code for an individual record result. ErrorCodes can be either ProvisionedThroughputExceededException or InternalFailure.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.ErrorCode] = js.undefined
  /**
    * The error message for an individual record result. An ErrorCode value of ProvisionedThroughputExceededException has an error message that includes the account ID, stream name, and shard ID. An ErrorCode value of InternalFailure has the error message "Internal Service Failure".
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.ErrorMessage] = js.undefined
  /**
    * The sequence number for an individual record result.
    */
  var SequenceNumber: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.SequenceNumber] = js.undefined
  /**
    * The shard ID for an individual record result.
    */
  var ShardId: js.UndefOr[typings.awsDashSdk.clientsKinesisMod.ShardId] = js.undefined
}

object PutRecordsResultEntry {
  @scala.inline
  def apply(
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    SequenceNumber: SequenceNumber = null,
    ShardId: ShardId = null
  ): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    if (ShardId != null) __obj.updateDynamic("ShardId")(ShardId)
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
}

