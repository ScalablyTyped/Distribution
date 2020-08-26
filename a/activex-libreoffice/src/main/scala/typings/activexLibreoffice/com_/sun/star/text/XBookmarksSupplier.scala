package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all bookmarks within this text container. */
@js.native
trait XBookmarksSupplier extends XInterface {
  /** @returns the collection of all {@link Bookmark} instances which are within this context and which support the {@link Bookmarks} service. */
  val Bookmarks: XNameAccess = js.native
  /** @returns the collection of all {@link Bookmark} instances which are within this context and which support the {@link Bookmarks} service. */
  def getBookmarks(): XNameAccess = js.native
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
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBookmarks = js.Any.fromFunction0(getBookmarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBookmarksSupplier]
  }
  @scala.inline
  implicit class XBookmarksSupplierOps[Self <: XBookmarksSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBookmarks(value: XNameAccess): Self = this.set("Bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBookmarks(value: () => XNameAccess): Self = this.set("getBookmarks", js.Any.fromFunction0(value))
  }
  
}

