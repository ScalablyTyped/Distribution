package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferData extends js.Object {
  /**
    * The date the transfer was accepted.
    */
  var acceptDate: js.UndefOr[DateType] = js.native
  /**
    * The date the transfer was rejected.
    */
  var rejectDate: js.UndefOr[DateType] = js.native
  /**
    * The reason why the transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.native
  /**
    * The date the transfer took place.
    */
  var transferDate: js.UndefOr[DateType] = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}

object TransferData {
  @scala.inline
  def apply(
    acceptDate: DateType = null,
    rejectDate: DateType = null,
    rejectReason: Message = null,
    transferDate: DateType = null,
    transferMessage: Message = null
  ): TransferData = {
    val __obj = js.Dynamic.literal()
    if (acceptDate != null) __obj.updateDynamic("acceptDate")(acceptDate.asInstanceOf[js.Any])
    if (rejectDate != null) __obj.updateDynamic("rejectDate")(rejectDate.asInstanceOf[js.Any])
    if (rejectReason != null) __obj.updateDynamic("rejectReason")(rejectReason.asInstanceOf[js.Any])
    if (transferDate != null) __obj.updateDynamic("transferDate")(transferDate.asInstanceOf[js.Any])
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferData]
  }
}

