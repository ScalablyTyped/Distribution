package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferData extends js.Object {
  /**
    * The date the transfer was accepted.
    */
  var acceptDate: js.UndefOr[DateType] = js.undefined
  /**
    * The date the transfer was rejected.
    */
  var rejectDate: js.UndefOr[DateType] = js.undefined
  /**
    * The reason why the transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.undefined
  /**
    * The date the transfer took place.
    */
  var transferDate: js.UndefOr[DateType] = js.undefined
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.undefined
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
    if (acceptDate != null) __obj.updateDynamic("acceptDate")(acceptDate)
    if (rejectDate != null) __obj.updateDynamic("rejectDate")(rejectDate)
    if (rejectReason != null) __obj.updateDynamic("rejectReason")(rejectReason)
    if (transferDate != null) __obj.updateDynamic("transferDate")(transferDate)
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage)
    __obj.asInstanceOf[TransferData]
  }
}

