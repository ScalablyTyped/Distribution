package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPutMessageErrorEntry extends js.Object {
  /**
    * The code associated with the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The message associated with the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the message object.)
    */
  var messageId: js.UndefOr[MessageId] = js.undefined
}

object BatchPutMessageErrorEntry {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: ErrorMessage = null, messageId: MessageId = null): BatchPutMessageErrorEntry = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    __obj.asInstanceOf[BatchPutMessageErrorEntry]
  }
}

