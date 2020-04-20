package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClipboardContent extends js.Object {
  var Cancel: Boolean
  val ClipboardContent: js.Any
  val Target: Folder
}

object AnonClipboardContent {
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: Folder): AnonClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClipboardContent]
  }
}

