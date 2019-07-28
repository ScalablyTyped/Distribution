package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchWriteOperationList
}

object BatchWriteRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchWriteOperationList): BatchWriteRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, Operations = Operations)
  
    __obj.asInstanceOf[BatchWriteRequest]
  }
}

