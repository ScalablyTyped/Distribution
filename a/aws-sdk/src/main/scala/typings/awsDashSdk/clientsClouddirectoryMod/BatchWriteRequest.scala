package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchWriteOperationList = js.native
}

object BatchWriteRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchWriteOperationList): BatchWriteRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchWriteRequest]
  }
}

