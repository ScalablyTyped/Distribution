package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupFailureDetails extends js.Object {
  /**
    * A message describing the backup creation failure.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}

object BackupFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): BackupFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupFailureDetails]
  }
}

