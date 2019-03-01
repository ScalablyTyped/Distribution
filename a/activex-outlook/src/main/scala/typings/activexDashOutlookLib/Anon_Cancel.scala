package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: scala.Boolean
  val FolderToShare: activexDashOutlookLib.OutlookNs.Folder
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: scala.Boolean, FolderToShare: activexDashOutlookLib.OutlookNs.Folder): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("FolderToShare")(FolderToShare)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

