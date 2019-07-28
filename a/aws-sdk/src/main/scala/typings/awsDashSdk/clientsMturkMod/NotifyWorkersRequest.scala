package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyWorkersRequest extends js.Object {
  /**
    * The text of the email message to send. Can include up to 4,096 characters
    */
  var MessageText: String
  /**
    * The subject line of the email message to send. Can include up to 200 characters.
    */
  var Subject: String
  /**
    * A list of Worker IDs you wish to notify. You can notify upto 100 Workers at a time.
    */
  var WorkerIds: CustomerIdList
}

object NotifyWorkersRequest {
  @scala.inline
  def apply(MessageText: String, Subject: String, WorkerIds: CustomerIdList): NotifyWorkersRequest = {
    val __obj = js.Dynamic.literal(MessageText = MessageText, Subject = Subject, WorkerIds = WorkerIds)
  
    __obj.asInstanceOf[NotifyWorkersRequest]
  }
}

