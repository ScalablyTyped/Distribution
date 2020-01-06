package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchResult extends js.Object {
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList = js.native
  /**
    * A list of  DeleteMessageBatchResultEntry  items.
    */
  var Successful: DeleteMessageBatchResultEntryList = js.native
}

object DeleteMessageBatchResult {
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: DeleteMessageBatchResultEntryList): DeleteMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMessageBatchResult]
  }
}

