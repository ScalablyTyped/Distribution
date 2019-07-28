package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBar extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Folder: typings.activexDashOutlook.OutlookNs.Folder
}

object Anon_CommandBar {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Folder: Folder
  ): Anon_CommandBar = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar, Folder = Folder)
  
    __obj.asInstanceOf[Anon_CommandBar]
  }
}

