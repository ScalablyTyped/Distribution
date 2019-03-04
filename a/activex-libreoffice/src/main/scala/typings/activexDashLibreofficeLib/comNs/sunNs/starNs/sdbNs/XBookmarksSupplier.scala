package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all bookmarks associated with a data source. */
trait XBookmarksSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  val Bookmarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  def getBookmarks(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XBookmarksSupplier {
  @scala.inline
  def apply(
    Bookmarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getBookmarks: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBookmarksSupplier = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, acquire = acquire, getBookmarks = getBookmarks, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBookmarksSupplier]
  }
}

