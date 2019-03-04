package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelClipboardContent extends js.Object {
  var Cancel: scala.Boolean
  val ClipboardContent: js.Any
  val Target: activexDashOutlookLib.OutlookNs.Folder
}

object Anon_CancelClipboardContent {
  @scala.inline
  def apply(Cancel: scala.Boolean, ClipboardContent: js.Any, Target: activexDashOutlookLib.OutlookNs.Folder): Anon_CancelClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, ClipboardContent = ClipboardContent, Target = Target)
  
    __obj.asInstanceOf[Anon_CancelClipboardContent]
  }
}

