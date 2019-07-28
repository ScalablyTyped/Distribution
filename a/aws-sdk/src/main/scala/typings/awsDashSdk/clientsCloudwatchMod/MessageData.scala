package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageData extends js.Object {
  /**
    * The error code or status code associated with the message.
    */
  var Code: js.UndefOr[MessageDataCode] = js.undefined
  /**
    * The message text.
    */
  var Value: js.UndefOr[MessageDataValue] = js.undefined
}

object MessageData {
  @scala.inline
  def apply(Code: MessageDataCode = null, Value: MessageDataValue = null): MessageData = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MessageData]
  }
}

