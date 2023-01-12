package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all bookmarks associated with a data source. */
trait XBookmarksSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  val Bookmarks: XNameAccess
  
  /** @returns the collection of all bookmarks associated with a data source A bookmark is simply a string specifying the location of the bookmarked document. */
  def getBookmarks(): XNameAccess
}
object XBookmarksSupplier {
  
  inline def apply(
    Bookmarks: XNameAccess,
    acquire: () => Unit,
    getBookmarks: () => XNameAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XBookmarksSupplier = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBookmarks = js.Any.fromFunction0(getBookmarks), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBookmarksSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XBookmarksSupplier] (val x: Self) extends AnyVal {
    
    inline def setBookmarks(value: XNameAccess): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
    
    inline def setGetBookmarks(value: () => XNameAccess): Self = StObject.set(x, "getBookmarks", js.Any.fromFunction0(value))
  }
}
