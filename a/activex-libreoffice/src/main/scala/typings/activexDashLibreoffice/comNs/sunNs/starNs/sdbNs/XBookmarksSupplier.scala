package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all bookmarks associated with a data source. */
trait XBookmarksSupplier extends XInterface {
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  val Bookmarks: XNameAccess
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  def getBookmarks(): XNameAccess
}

object XBookmarksSupplier {
  @scala.inline
  def apply(
    Bookmarks: XNameAccess,
    acquire: () => Unit,
    getBookmarks: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBookmarksSupplier = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks, acquire = js.Any.fromFunction0(acquire), getBookmarks = js.Any.fromFunction0(getBookmarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBookmarksSupplier]
  }
}

