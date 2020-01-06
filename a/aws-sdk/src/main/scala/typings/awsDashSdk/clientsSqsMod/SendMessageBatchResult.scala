package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageBatchResult extends js.Object {
  /**
    * A list of  BatchResultErrorEntry  items with error details about each message that can't be enqueued.
    */
  var Failed: BatchResultErrorEntryList = js.native
  /**
    * A list of  SendMessageBatchResultEntry  items.
    */
  var Successful: SendMessageBatchResultEntryList = js.native
}

object SendMessageBatchResult {
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: SendMessageBatchResultEntryList): SendMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessageBatchResult]
  }
}

