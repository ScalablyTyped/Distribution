package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderPages extends js.Object {
  val Folder: activexDashOutlookLib.OutlookNs.Folder
  val Pages: activexDashOutlookLib.OutlookNs.PropertyPages
}

object Anon_FolderPages {
  @scala.inline
  def apply(
    Folder: activexDashOutlookLib.OutlookNs.Folder,
    Pages: activexDashOutlookLib.OutlookNs.PropertyPages
  ): Anon_FolderPages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Folder")(Folder)
    __obj.updateDynamic("Pages")(Pages)
    __obj.asInstanceOf[Anon_FolderPages]
  }
}

