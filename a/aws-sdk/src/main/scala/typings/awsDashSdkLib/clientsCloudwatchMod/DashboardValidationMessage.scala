package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashboardValidationMessage extends js.Object {
  /**
    * The data path related to the message.
    */
  var DataPath: js.UndefOr[DataPath] = js.undefined
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[Message] = js.undefined
}

object DashboardValidationMessage {
  @scala.inline
  def apply(DataPath: DataPath = null, Message: Message = null): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    if (DataPath != null) __obj.updateDynamic("DataPath")(DataPath)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[DashboardValidationMessage]
  }
}

