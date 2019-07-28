package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationStatus extends js.Object {
  /**
    * A user-defined string.
    */
  var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.undefined
  /**
    * The date when the status changed.
    */
  var Date: DateTime
  /**
    * The reason for the status.
    */
  var Message: StatusMessage
  /**
    * The status.
    */
  var Name: AssociationStatusName
}

object AssociationStatus {
  @scala.inline
  def apply(
    Date: DateTime,
    Message: StatusMessage,
    Name: AssociationStatusName,
    AdditionalInfo: StatusAdditionalInfo = null
  ): AssociationStatus = {
    val __obj = js.Dynamic.literal(Date = Date, Message = Message, Name = Name.asInstanceOf[js.Any])
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    __obj.asInstanceOf[AssociationStatus]
  }
}

