package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemFailureDetails extends js.Object {
  /**
    * A message describing any failures that occurred during file system creation.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}

object FileSystemFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): FileSystemFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[FileSystemFailureDetails]
  }
}

