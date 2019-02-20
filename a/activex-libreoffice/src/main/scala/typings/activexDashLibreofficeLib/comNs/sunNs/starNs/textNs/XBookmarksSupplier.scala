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

