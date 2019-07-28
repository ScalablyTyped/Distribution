package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchReadOperationList
}

object BatchReadRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchReadOperationList, ConsistencyLevel: ConsistencyLevel = null): BatchReadRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, Operations = Operations)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadRequest]
  }
}

