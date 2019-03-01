package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all bookmarks within this text container. */
trait XBookmarksSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of all {@link Bookmark} instances which are within this context and which support the {@link Bookmarks} service. */
  val Bookmarks: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of all {@link Bookmark} instances which are within this context and which support the {@link Bookmarks} service. */
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bookmarks")(Bookmarks)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBookmarks")(getBookmarks)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XBookmarksSupplier]
  }
}

