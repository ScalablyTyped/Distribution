package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageErrorEntry extends js.Object {
  /**
    * The code associated with the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * More information about the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the "message" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}

object BatchPutMessageErrorEntry {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: ErrorMessage = null, messageId: MessageId = null): BatchPutMessageErrorEntry = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageErrorEntry]
  }
}

