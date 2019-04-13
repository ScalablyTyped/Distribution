package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupFailureDetails extends js.Object {
  /**
    * A message describing the backup creation failure.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}

object BackupFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): BackupFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[BackupFailureDetails]
  }
}

