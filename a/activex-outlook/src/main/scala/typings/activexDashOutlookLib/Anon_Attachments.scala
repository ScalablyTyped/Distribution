package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachments extends js.Object {
  val Attachments: activexDashOutlookLib.OutlookNs.AttachmentSelection
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
}

object Anon_Attachments {
  @scala.inline
  def apply(
    Attachments: activexDashOutlookLib.OutlookNs.AttachmentSelection,
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  ): Anon_Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachments")(Attachments)
    __obj.updateDynamic("CommandBar")(CommandBar)
    __obj.asInstanceOf[Anon_Attachments]
  }
}

