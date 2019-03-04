package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentCancel extends js.Object {
  val Attachment: activexDashOutlookLib.OutlookNs.Attachment
  var Cancel: scala.Boolean
}

object Anon_AttachmentCancel {
  @scala.inline
  def apply(Attachment: activexDashOutlookLib.OutlookNs.Attachment, Cancel: scala.Boolean): Anon_AttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment, Cancel = Cancel)
  
    __obj.asInstanceOf[Anon_AttachmentCancel]
  }
}

