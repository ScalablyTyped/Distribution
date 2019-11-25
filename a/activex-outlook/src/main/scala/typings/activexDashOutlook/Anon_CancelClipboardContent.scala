package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelClipboardContent extends js.Object {
  var Cancel: Boolean
  val ClipboardContent: js.Any
  val Target: Folder
}

object Anon_CancelClipboardContent {
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: Folder): Anon_CancelClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelClipboardContent]
  }
}

